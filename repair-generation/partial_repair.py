import os.path
import re
import shutil
import subprocess

from utils import run_cmd


class PartialRepair:
    def __init__(self, root, class_name, build_tool):
        self._root = root
        self._class_name = class_name
        self._positive_tests = []
        self._negative_tests = []
        self.src_java, self.src_test, self.bin_java, self.bin_test = self.get_src_build(build_tool)
        self._test_tmp_bin = os.path.join("lib", "test-tmp", "bin")
        self._test_tmp_src = os.path.join("lib", "test-tmp", "src")

    @staticmethod
    def get_src_build(build_tool):
        build_paths = {
            "maven": ("src/main/java", "src/test/java", "target/classes", "target/test-classes"),
            "gradle": ("src/main/java", "src/test/java", "build/classes/java/main", "build/classes/java/test")
        }
        if build_tool not in build_paths:
            raise ValueError("Please provide a valid build tool: 'maven' or 'gradle'")
        return build_paths[build_tool]

    def get_tests(self):
        cmd = f"mvn -f {self._root} test | grep 'Tests run:.*Failures:.*Errors:'"
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

    def partial_repair(self):
        self.get_tests()
        if len(self._negative_tests) > 0:
            # Move all negative tests to temporary directory
            for test in self._negative_tests:
                self.move_test(f"{test}.java", self.src_test, self._test_tmp_src, 0)
                self.move_test(f"{test}.class", self.bin_test, self._test_tmp_bin, 0)
            # Build the project and run APR with only one negative test at a time
            for test in self._negative_tests:
                self.move_test(f"{test}.java", self.src_test, self._test_tmp_src, 1)
                self.move_test(f"{test}.class", self.bin_test, self._test_tmp_bin, 1)
                # print(run_cmd(f"mvn -f {self._root} compile"))
                # run_cmd(f"mvn -f {self._root} test")

    def move_test(self, test, src, destination, direction):
        source_path = os.path.join(self._root, src, self._class_name, test)
        destination_path = os.path.join(destination, test)
        if direction == 0:
            shutil.move(source_path, destination_path)
        else:
            shutil.move(destination_path, source_path)


if __name__ == '__main__':
    root = "/Users/ruizhengu/Experiments/APR-as-AAT/IntroClassJava/dataset/checksum/2c1556672751734adf9a561fbf88767c32224fca14a81e9d9c719f18d0b21765038acc16ecd8377f74d4f43e8c844538161d869605e3516cf797d0a6a59f1f8e/003"
    partial = PartialRepair(root, "introclassJava", "maven")
    partial.partial_repair()
