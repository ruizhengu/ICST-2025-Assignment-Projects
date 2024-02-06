import json
import re
import shutil
from pathlib import Path

import utils


class RepairMutant:
    def __init__(self, mutants, home_path, astor_output):
        self.mutants = Path(mutants)
        self._main_path = Path("src/main/java/uk/ac/sheffield/com1003/cafe")
        self._test_path = Path("src/test/java/uk/ac/sheffield/com1003/cafe")
        self._astor_output = astor_output
        self.home_path = home_path

    def pre_processing(self):
        mutant_list = list(filter(lambda p: ".DS_Store" not in str(p), self.mutants.iterdir()))
        mutant_roots = [str(_) for _ in mutant_list]
        return mutant_roots

    def repair(self, root):
        mutant_name = root.split('/')[-1]
        utils.run_cmd(f"{root}/gradlew clean build -p {root}")
        astor_command = f"java -cp /Users/ruizhengu/Experiments/APR-as-AAT/astor/target/astor-*-jar-with-dependencies.jar fr.inria.main.evolution.AstorMain -mode jgenprog -srcjavafolder /src/main/java/ -srctestfolder /src/test/java/ -binjavafolder /build/classes/java/main/ -bintestfolder /build/classes/java/test/ -location {root} -scope global -out {self._astor_output}"
        astor_console = utils.run_cmd(astor_command)
        astor_output = Path(self._astor_output) / f"AstorMain-{mutant_name}"
        astor_output_json = astor_output / "astor_output.json"
        if "No suspicious line detected by the fault localization" in astor_console:
            print("No suspicious line detected by the fault localization")
            return "No suspicious line"
        else:
            with astor_output_json.open("r") as file:
                patches = json.load(file)["patches"]
            if patches:
                print(f"Patch found - {root}")
                new_path = self.rename_output(astor_output, mutant_name)
                utils.update_patch_paths(new_path)
                return new_path
            else:
                print(f"No patch found - {root}")
                shutil.rmtree(astor_output)
                return None

    def rename_output(self, astor_output, submission_name):
        pattern = rf"AstorMain-Cafe-{submission_name}-(\d+)"
        patch_path = self.home_path / "repair-generation/results/patches"
        max_digit = 0
        for file in patch_path.iterdir():
            match = re.match(pattern, file.name)
            if match:
                digit = int(match.group(1))
                max_digit = max(max_digit, digit)
        if max_digit > 0:
            new_digit = max_digit + 1
        else:
            new_digit = 1
        new_name = patch_path / f"AstorMain-{submission_name}-{new_digit}"

        shutil.copytree(astor_output, new_name)
        return new_name


if __name__ == '__main__':
    home_path = Path("/Users/ruizhengu/Projects/APR-as-AAT")
    astor_output = "/Users/ruizhengu/Projects/APR-as-AAT/repair-generation/results/output_astor"
    model_mutants = "/Users/ruizhengu/Experiments/APR-as-AAT/model_mutants"
    repair = RepairMutant(model_mutants, home_path, astor_output)
    mutants = repair.pre_processing()
    for mutant in mutants:
        repair.repair(mutant)
