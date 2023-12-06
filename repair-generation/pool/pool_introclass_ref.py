import json
import os
import shutil
from pathlib import Path

import utils


class PoolIntroClassRef:
    """
    Generating the initial patches for the IntroClassJava dataset (with reference solutions)
    """
    def __init__(self):
        self.path_dataset = Path("/Users/ruizhengu/Experiments/APR-as-AAT/IntroClassJava/dataset")
        self.patch_results = Path(
            "/Users/ruizhengu/Projects/APR-as-AAT/repair-generation/results/results_introclass.xlsx")
        self._ref_main = Path("reference/src/main/java/introclassJava")
        self._ref_tests = Path("reference/src/test/java/introclassJava")
        self._submission_main = Path("src/main/java/introclassJava")
        self._submission_test = Path("src/test/java/introclassJava")
        self._astor_output = Path("/Users/ruizhengu/Projects/APR-as-AAT/repair-generation/results/output_astor")
        utils.create_excel(self.patch_results)

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

    def repair(self):
        datasets = list(Path(self.path_dataset).glob('*'))
        total_datasets = len(datasets)
        patch_count = 0
        for index, dataset_path in enumerate(datasets, start=1):
            if dataset_path.is_dir():
                print(f"Processing dataset {index}/{total_datasets}: {dataset_path.name}")
                # Reference solution
                ref_classes, ref_tests = self.get_ref(dataset_path)
                # Individual submissions
                submissions_main, submissions_test, roots = self.get_submission(dataset_path)
                # Copy reference solution to each individual submission
                self.copy_ref(ref_classes, ref_tests, submissions_main, submissions_test)
                # Build and test submissions
                total_roots = len(roots)
                for root_index, root in enumerate(roots, start=1):
                    print(f"Processing submission {root_index}/{total_roots} in dataset {index}")
                    utils.run_cmd(f"mvn -f {root} compile")
                    utils.run_cmd(f"mvn -f {root} test")
                    astor_command = f"java -cp /Users/ruizhengu/Experiments/APR-as-AAT/astor/target/astor-*-jar-with-dependencies.jar fr.inria.main.evolution.AstorMain -mode jgenprog -srcjavafolder /src/main/java/ -srctestfolder /src/test/java/ -binjavafolder /target/classes/ -bintestfolder /target/test-classes/ -location {root} -scope global -out {self._astor_output}"
                    utils.run_cmd(astor_command)
                    astor_output = self._astor_output / f"AstorMain-{root.split('/')[-1]}"
                    astor_output_json = astor_output / "astor_output.json"
                    with astor_output_json.open("r") as file:
                        patches = json.load(file)["patches"]
                    if patches:
                        print(f"Patch found - {root}")
                        data = {
                            "ID": patch_count,
                            "Project": dataset_path.name,
                            "Patch": f"AstorMain-{dataset_path.name}-{root_index}",
                            "Submission": str(root)
                        }
                        astor_output_rename = self._astor_output / f"AstorMain-{dataset_path.name}-{root_index}"
                        os.rename(astor_output, astor_output_rename)
                        utils.append_excel(self.patch_results, data)
                        utils.update_patch_paths(astor_output_rename, f"AstorMain-{dataset_path.name}-{root_index}")
                    else:
                        print(f"No patch found - {root}")
                        shutil.rmtree(astor_output)


if __name__ == '__main__':
    repair = PoolIntroClassRef()
    repair.repair()
