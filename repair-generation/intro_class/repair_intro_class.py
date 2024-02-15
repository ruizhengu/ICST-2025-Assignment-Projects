import os
import shutil
from pathlib import Path


class RepairIntroClass:
    def __init__(self):
        self.home_path = Path("/Users/ruizhengu/Experiments/APR-as-AAT/IntroClassJava")
        self.dataset_path = self.home_path / "dataset"
        self.datasets = [dataset for dataset in self.dataset_path.iterdir() if dataset.is_dir()]
        self.new_root = Path("/Users/ruizhengu/Experiments/APR-as-AAT/newIntroClass")

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
        for info in datasets_info:
            new_dataset = self.new_root / info["name"]
            if not new_dataset.exists():
                os.mkdir(new_dataset)
            for index, revision in enumerate(info["revisions"], start=1):
                new_revision = new_dataset / str(index)
                shutil.copytree(revision, new_revision)


if __name__ == '__main__':
    repair = RepairIntroClass()
    repair.pre_processing()
