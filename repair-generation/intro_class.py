import json
import os
import re
import shutil
from pathlib import Path

import utils


class IntroClass:
    def __init__(self, dataset):
        self.path_dataset = Path(dataset)
        self.patch_results = Path(
            "/Users/ruizhengu/Projects/APR-as-AAT/repair-generation/results/results_introclass.xlsx")
        self._ref_main = Path("reference/src/main/java/introclassJava")
        self._ref_tests = Path("reference/src/test/java/introclassJava")
        self._submission_main = Path("src/main/java/introclassJava")
        self._submission_test = Path("src/test/java/introclassJava")
        self._astor_output = utils.ASTOR_OUTPUT

    def get_ref(self, dataset):
        """
        Get reference solutions of the dataset

        :param dataset: path of the dataset
        :return:
        """
        ref = dataset / "ref"
        classes = []
        tests = []
        if ref.is_dir():
            classes = list((ref / self._ref_main).glob('*'))
            tests = list((ref / self._ref_tests).glob('*'))
        return classes, tests

    def get_submission(self, dataset):
        """
        Get the submissions in the dataset

        :param dataset: path of the dataset
        :return:
        """
        submissions_main = []
        submissions_test = []
        roots = []
        submission_dirs = [d for d in dataset.iterdir() if d.is_dir() and d.name != "ref"]

        for sub_dir in submission_dirs:
            for subsub_dir in sub_dir.iterdir():
                if subsub_dir.is_dir():
                    roots.append(str(subsub_dir))
                    submissions_main.append(subsub_dir / self._submission_main)
                    submissions_test.append(subsub_dir / self._submission_test)

        return submissions_main, submissions_test, roots

    def copy_ref(self, ref_classes, ref_tests, submissions_main, submissions_test):
        """
        Copy the reference solution in each submission in the current dataset

        :param ref_classes:
        :param ref_tests:
        :param submissions_main:
        :param submissions_test:
        """
        for ref_class in ref_classes:
            file_name = ref_class.name
            for submission_main in submissions_main:
                solution_dir = submission_main / "solution"
                if not solution_dir.exists():
                    solution_dir.mkdir(parents=True)
                target_name = solution_dir / file_name
                shutil.copy(ref_class, target_name)
                utils.replace_package(target_name, "package introclassJava;", "package introclassJava.solution;")

        for ref_test in ref_tests:
            file_name = ref_test.name
            for submission_test in submissions_test:
                target_name = submission_test / file_name
                shutil.copy(ref_test, target_name)
                utils.import_class(target_name, "import org.junit.Test;", "import introclassJava.solution.*;")

    def pre_processing(self):
        # Reference solution
        ref_classes, ref_tests = self.get_ref(self.path_dataset)
        # Individual submissions
        submissions_main, submissions_test, roots = self.get_submission(self.path_dataset)
        # Copy reference solution to each individual submission
        self.copy_ref(ref_classes, ref_tests, submissions_main, submissions_test)
        return roots

    def repair(self, root, root_index):
        utils.run_cmd(f"mvn -f {root} compile")
        utils.run_cmd(f"mvn -f {root} test")
        astor_command = f"java -cp /Users/ruizhengu/Experiments/APR-as-AAT/astor/target/astor-*-jar-with-dependencies.jar fr.inria.main.evolution.AstorMain -mode jgenprog -srcjavafolder /src/main/java/ -srctestfolder /src/test/java/ -binjavafolder /target/classes/ -bintestfolder /target/test-classes/ -location {root} -scope global -out {self._astor_output}"
        utils.run_cmd(astor_command)
        astor_output = self._astor_output / f"AstorMain-{root.split('/')[-1]}"
        astor_output_json = astor_output / "astor_output.json"
        # if not astor_output.exists():
        #     return None
        with astor_output_json.open("r") as file:
            patches = json.load(file)["patches"]
        if patches:
            print(f"Patch found - {root}")
            data = {
                # "ID": patch_count,
                "Project": self.path_dataset.name,
                "Patch": f"AstorMain-{self.path_dataset.name}-{root_index}",
                "Submission": str(root)
            }
            new_path = self.rename_output(astor_output)
            utils.append_excel(self.patch_results, data)
            utils.update_patch_paths(new_path, new_path.name)
            return new_path
        else:
            print(f"No patch found - {root}")
            shutil.rmtree(astor_output)
            return None

    def rename_output(self, astor_output):
        # new_name = self._astor_output / f"AstorMain-{self.path_dataset.name}-1"
        # pattern = rf"AstorMain-{self.path_dataset.name}-1-\d+"
        # new_name_digit = self._astor_output / f"AstorMain-{self.path_dataset.name}-1-1"
        # output = ""
        # max_digit = -1
        # if astor_output.exists():
        #     os.rename(astor_output, new_name)
        #     output = new_name
        #     # return new_name
        # if new_name.exists():
        #     os.rename(new_name, new_name_digit)
        #     # return new_name_digit
        #     output = new_name_digit
        # for file in self._astor_output.iterdir():
        #     if re.match(pattern, file.name):
        #         digit = int(file.name.split("-")[-1]) + 1
        #         if digit > max_digit:
        #             max_digit = digit
        #             updated_name_digit = self._astor_output / f"AstorMain-{self.path_dataset.name}-1-{digit}"
        #             os.rename(file, updated_name_digit)
        #         # return updated_name_digit
        #             output = updated_name_digit
        # return output
        pattern = rf"AstorMain-{re.escape(self.path_dataset.name)}-1-(\d+)"
        max_digit = 0

        # Find the maximum digit in existing files
        for file in self._astor_output.iterdir():
            match = re.match(pattern, file.name)
            if match:
                digit = int(match.group(1))
                max_digit = max(max_digit, digit)

        # Determine the new name for astor_output
        if max_digit > 0:
            new_digit = max_digit + 1
        else:
            new_digit = 1
        new_name = self._astor_output / f"AstorMain-{self.path_dataset.name}-1-{new_digit}"

        # Rename astor_output to new_name
        if astor_output.exists():
            os.rename(astor_output, new_name)
            return new_name

        # Return None or an appropriate value if astor_output doesn't exist
        return None