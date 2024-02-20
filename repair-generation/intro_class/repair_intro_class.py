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
        self.new_datasets = self.pre_processing()

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
                new_revision = new_dataset / str(index)
                if not new_revision.exists():
                    shutil.copytree(revision, new_revision)
                new_datasets.append(new_revision)
        return new_datasets

    def arja(self):
        for dataset in self.new_datasets:
            # mvn_compile = f"cd {dataset} && mvn compile"
            # mvn_test = f"cd {dataset} && mvn test"
            # utils.run_cmd(mvn_compile)
            # utils.run_cmd(mvn_test)
            arja_path = "/Users/ruizhengu/Experiments/APR-as-AAT/arja"
            path_src = dataset / "src"
            path_bin_src = dataset / "target/classes"
            path_bin_test = dataset / "target/test-classes"
            path_dependency = "/Users/ruizhengu/Experiments/APR-as-AAT/dependency/junit-4.13.2.jar"
            arja_cmd = f"cd {arja_path} && java -cp \"lib/*:bin:target/classes\" us.msu.cse.repair.Main Arja -DsrcJavaDir {path_src} -DbinJavaDir {path_bin_src} -DbinTestDir {path_bin_test} -Ddependences {path_dependency}"
            print("=" * 10 + f" ARJA -> {dataset} " + "=" * 10)
            # print(arja_cmd)
            arja_output = utils.run_cmd(arja_cmd)
            # print(arja_output)


if __name__ == '__main__':
    repair = RepairIntroClass()
    repair.arja()
