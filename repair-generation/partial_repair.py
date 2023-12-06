import os.path
import re
import shutil
import subprocess
from pathlib import Path

import utils

from intro_class import IntroClass


class PartialRepair:
    def __init__(self, datasets, class_name, build_tool):
        self.datasets = datasets
        self._class_name = class_name
        self._positive_tests = []
        self._negative_tests = []
        self.src_java, self.src_test, self.bin_java, self.bin_test = self.get_src_build(build_tool)
        self._test_tmp_bin = os.path.join("lib", "test-tmp", "bin")
        self._test_tmp_src = os.path.join("lib", "test-tmp", "src")
        utils.create_excel(utils.PATCH_RESULTS)

    @staticmethod
    def get_src_build(build_tool):
        build_paths = {
            "maven": ("src/main/java", "src/test/java", "target/classes", "target/test-classes"),
            "gradle": ("src/main/java", "src/test/java", "build/classes/java/main", "build/classes/java/test")
        }
        if build_tool not in build_paths:
            raise ValueError("Please provide a valid build tool: 'maven' or 'gradle'")
        return build_paths[build_tool]

    def get_tests(self, root):
        self._negative_tests = []
        self._positive_tests = []
        cmd = f"mvn -f {root} test | grep 'Tests run:.*Failures:.*Errors:'"
        try:
            output = subprocess.check_output(cmd, shell=True, text=True)
            failures_pattern = re.compile(rf"Failures: (\d+).*{self._class_name}.(.*)")
            for line in output.split('\n'):
                # match the number of failed test cases in a test suite
                match = failures_pattern.search(line)
                if match:
                    num_failures = int(match.group(1))
                    if num_failures > 0:
                        self._negative_tests.append(match.group(2))
                    else:
                        self._positive_tests.append(match.group(2))
        except subprocess.CalledProcessError as e:
            print(f"Error executing test command: {e}")
        print("Positive Tests: ", self._positive_tests)
        print("Negative Tests: ", self._negative_tests)

    def repair_dataset(self):
        for dataset, path in self.datasets.items():
            repair_intro_class = IntroClass(path)
            roots = repair_intro_class.pre_processing()
            total_roots = len(roots)
            for root_index, root in enumerate(roots, start=1):
                print(f"Processing submission {root_index}/{total_roots} in dataset {dataset}")
                self.partial_repair(root, repair_intro_class, root_index)

    def partial_repair(self, root, repair_intro_class, root_index):
        self.get_tests(root)
        if len(self._negative_tests) > 0:
            # Move all negative tests to temporary directory
            for test in self._negative_tests:
                self.move_test(f"{test}.java", self.src_test, self._test_tmp_src, 0, root)
                self.move_test(f"{test}.class", self.bin_test, self._test_tmp_bin, 0, root)
            # Build the project and run APR with only one negative test at a time
            for test in self._negative_tests:
                self.move_test(f"{test}.java", self.src_test, self._test_tmp_src, 1, root)
                self.move_test(f"{test}.class", self.bin_test, self._test_tmp_bin, 1, root)
                patch = repair_intro_class.repair(root, root_index)
                if patch is not None:
                    utils.apply_patch(patch / "astor_output.json")

    def move_test(self, test, src, destination, direction, root):
        source_path = Path(root) / src / self._class_name / test
        destination_path = Path(__file__).parent / destination / test
        if direction == 0:
            shutil.move(source_path, destination_path)
        else:
            shutil.move(destination_path, source_path)


if __name__ == '__main__':
    datasets = utils.get_intro_class_datasets()
    repair = PartialRepair(datasets, "introclassJava", "maven")
    repair.repair_dataset()
