import json
import os
import pathlib
import shutil
from pathlib import Path

import utils


class PoolIntroClassRef:
    def __init__(self):
        self.path_dataset = "/Users/ruizhengu/Experiments/APR-as-AAT/IntroClassJava/dataset"
        self.path_fix_output = "/Users/ruizhengu/Projects/APR-as-AAT/repair-generation/results/results_introclass.xlsx"
        self._ref_main = os.path.join("reference", "src", "main", "java", "introclassJava")
        self._ref_tests = os.path.join("reference", "src", "test", "java", "introclassJava")
        self._submission_main = os.path.join("src", "main", "java", "introclassJava")
        self._submission_test = os.path.join("src", "test", "java", "introclassJava")
        self._astor_output = os.path.join(pathlib.Path(__file__).parent.resolve(), "output_astor")
        utils.create_excel(self.path_fix_output)

    def get_ref(self, dataset):
        ref = os.path.join(dataset, "ref")
        classes = []
        tests = []
        if os.path.isdir(ref):
            classes = [os.path.join(ref, self._ref_main, _) for _ in os.listdir(os.path.join(ref, self._ref_main))]
            tests = [os.path.join(ref, self._ref_tests, _) for _ in os.listdir(os.path.join(ref, self._ref_tests))]
        return classes, tests

    def get_submission(self, dataset):
        dataset_path = Path(dataset)
        submissions_main = []
        submissions_test = []
        roots = []
        submission_dirs = [d for d in dataset_path.iterdir() if d.is_dir() and d.name != "ref"]

        for sub_dir in submission_dirs:
            for subsub_dir in sub_dir.iterdir():
                if subsub_dir.is_dir():
                    roots.append(str(subsub_dir))
                    submissions_main.append(subsub_dir / self._submission_main)
                    submissions_test.append(subsub_dir / self._submission_test)
        submissions_main = [str(path) for path in submissions_main]
        submissions_test = [str(path) for path in submissions_test]

        return submissions_main, submissions_test, roots

    def copy_ref(self, ref_classes, ref_tests, submissions_main, submissions_test):
        # classes
        for ref_class in map(Path, ref_classes):
            file_name = ref_class.name
            for submission_main in submissions_main:
                if not os.path.exists(os.path.join(submission_main, "solution")):
                    os.mkdir(os.path.join(submission_main, "solution"))
                target_name = os.path.join(submission_main, "solution", file_name)
                shutil.copy(ref_class, target_name)
                utils.replace_package(target_name, "package introclassJava;", "package introclassJava.solution;")
        # test classes
        for ref_test in map(Path, ref_tests):
            file_name = ref_test.name
            for submission_test in submissions_test:
                target_name = os.path.join(submission_test, file_name)
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
                ref_classes, ref_tests = self.get_ref(str(dataset_path))
                # Individual submissions
                submissions_main, submissions_test, roots = self.get_submission(str(dataset_path))
                # Copy reference solution to each individual submission
                self.copy_ref(ref_classes, ref_tests, submissions_main, submissions_test)
                # Build and test submissions
                total_roots = len(roots)
                for root_index, root in enumerate(roots, start=1):
                    print(f"Processing submission {root_index}/{total_roots} in dataset {index}")
                    utils.run_cmd(f"mvn -f {root} compile")
                    utils.run_cmd(f"mvn -f {root} test")
                    astor_command = f"java -cp /Users/ruizhengu/Experiments/APR-as-AAT/astor/target/astor-*-jar-with-dependencies.jar fr.inria.main.evolution.AstorMain -mode jgenprog -srcjavafolder /src/main/java/ -srctestfolder /src/test/java/ -binjavafolder /target/classes/ -bintestfolder /target/test-classes/ -location {root} -scope global"
                    utils.run_cmd(astor_command)
                    try:
                        astor_output = os.path.join(self._astor_output, f"AstorMain-{root.split('/')[-1]}")
                        with open(os.path.join(astor_output, "astor_output.json"), 'r') as file:
                            patches = json.load(file)["patches"]
                        if patches:
                            print(f"Patch found - {root}")
                            data = {
                                "ID": patch_count,
                                "Project": dataset_path.name,
                                "Patch": f"AstorMain-{dataset_path.name}-{root_index}",
                                "Submission": str(root)
                            }
                            # utils.save_results(self.path_fix_output, str(root))
                            astor_output_rename = os.path.join(self._astor_output,
                                                               f"AstorMain-{dataset_path.name}-{root_index}")
                            os.rename(astor_output, astor_output_rename)
                            utils.append_excel(self.path_fix_output, data)
                        else:
                            print(f"No patch found - {root}")
                            shutil.rmtree(astor_output)
                    except Exception as e:
                        print(f"Error processing {root}: {e}")


if __name__ == '__main__':
    repair = PoolIntroClassRef()
    repair.repair()
