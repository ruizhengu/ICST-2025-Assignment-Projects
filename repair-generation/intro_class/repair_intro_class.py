import os
import shutil
from pathlib import Path

import utils


class RepairIntroClass:
    def __init__(self):
        self.home_path = Path("/Users/ruizhengu/Experiments/APR-as-AAT/IntroClassJava")
        self.dataset_path = self.home_path / "dataset"
        self.datasets = [dataset for dataset in self.dataset_path.iterdir() if dataset.is_dir()]
        self.new_root = Path("/Users/ruizhengu/Experiments/APR-as-AAT/newIntroClass")
        self.datasets_ref = Path("/Users/ruizhengu/Experiments/APR-as-AAT/newIntroClassRef")
        # self.new_datasets = self.pre_processing()
        # self.new_datasets = self.copy_ref()
        self.new_datasets = self.new_dataset()
        # self.path_output = Path("/Users/ruizhengu/Experiments/APR-as-AAT/arja_intro")
        self.path_output = Path("/Users/ruizhengu/Experiments/APR-as-AAT/arja_intro_ref")

    def get_datasets_info(self):
        datasets_info = []
        for dataset in self.datasets:
            programs = [d for d in dataset.iterdir() if d.is_dir() and d.name != "ref" and d.name != ".DS_Store"]
            revisions = []
            for sub in programs:
                for revision in sub.iterdir():
                    if revision.is_dir():
                        revisions.append(revision)
            ref = dataset / "ref/reference"
            info = {
                "name": dataset.name,
                "revisions": revisions,
                "ref": ref
            }
            datasets_info.append(info)
        return datasets_info

    def pre_processing(self):
        """
        Rearrange all the revisions in a dataset in one single directory, starting with the index 1.
        """
        datasets_info = self.get_datasets_info()
        new_datasets = []
        for info in datasets_info:
            new_dataset = self.new_root / info["name"]
            if not new_dataset.exists():
                os.mkdir(new_dataset)
            new_ref = new_dataset / "ref"
            if not new_ref.exists():
                shutil.copytree(info["ref"], new_ref)
            for index, revision in enumerate(info["revisions"], start=1):
                new_revision = new_dataset / f"{info['name']}_{index}"
                if not new_revision.exists():
                    shutil.copytree(revision, new_revision)
                new_datasets.append(new_revision)
        return new_datasets

    def copy_ref(self):
        new_datasets = []
        for dataset in self.datasets_ref.iterdir():
            if dataset.is_dir():
                solution_main = dataset / "main/solution"
                solution_test = dataset / "test/solution"
                for program in dataset.iterdir():
                    if program.is_dir() and program.name != "ref" and program.name != "test" and program.name != "main":
                        destination_main = program / "src/main/java/introclassJava/solution"
                        destination_test = program / "src/test/java/introclassJava/solution"
                        if not destination_main.exists():
                            shutil.copytree(solution_main, destination_main)
                        if not destination_test.exists():
                            shutil.copytree(solution_test, destination_test)
                        new_datasets.append(program)
        return new_datasets

    def new_dataset(self):
        new_datasets = []
        for dataset in self.datasets_ref.iterdir():
            if dataset.is_dir():
                for program in dataset.iterdir():
                    if program.is_dir() and program.name != "ref" and program.name != "test" and program.name != "main":
                        new_datasets.append(program)
        return new_datasets

    def arja(self):
        # for program in self.new_datasets:
        for program in self.new_datasets:
            # mvn_compile = f"cd {program} && mvn compile"
            # mvn_test = f"cd {program} && mvn test"
            # utils.run_cmd(mvn_compile)
            # utils.run_cmd(mvn_test)
            # print(program)
            arja_path = "/Users/ruizhengu/Experiments/APR-as-AAT/arja"
            path_src = program / "src"
            path_bin_src = program / "target/classes"
            path_bin_test = program / "target/test-classes"
            path_dependency = "/Users/ruizhengu/Experiments/APR-as-AAT/dependency/junit-4.11.jar"

            path_output = self.path_output / program.name.split("_")[0]
            if not path_output.exists():
                os.mkdir(path_output)
            path_output = path_output / program.name
            if not path_output.exists():
                os.mkdir(path_output)

            arja_cmd = f"cd {arja_path} && java -cp \"lib/*:bin:target/classes\" us.msu.cse.repair.Main Arja -DsrcJavaDir {path_src} -DbinJavaDir {path_bin_src} -DbinTestDir {path_bin_test} -Ddependences {path_dependency} -DpatchOutputRoot {path_output}"
            print("=" * 10 + f" ARJA -> {program} " + "=" * 10)
            # print(arja_cmd)
            utils.run_cmd(arja_cmd)

    def k_gen_prog(self):
        success_count = 0
        for program in self.new_datasets:
            path_src = program / "src/main"
            path_test = program / "src/test"
            cmd = f"java -jar /Users/ruizhengu/Experiments/APR-as-AAT/kGenProg-1.8.2.jar -r {program} -s {path_src} -t {path_test} --max-generation 50"
            output = utils.run_cmd(cmd)
            if "Exit status = SUCCESS" in output:
                success_count += 1
            print(f"kGenProg > {program}")
        print(f"Success Count: {success_count}")

    def jaid(self):
        pass

    def check_outputs(self):
        total_count = 0
        data = {}
        for dataset in self.path_output.iterdir():
            if dataset.is_dir():
                patch_count = 0
                for program in dataset.iterdir():
                    if program.is_dir():
                        if any(os.scandir(program)):
                            patch_count += 1
                            total_count += 1
                data[dataset.name] = patch_count
        data["total"] = total_count
        print(data)


if __name__ == '__main__':
    repair = RepairIntroClass()
    # repair.arja()
    # repair.check_outputs()
    repair.k_gen_prog()
