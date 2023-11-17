import re
import subprocess


class PartialRepair:
    def __init__(self, root, class_name):
        self._root = root
        self._class_name = class_name
        self._positive_tests = []
        self._negative_tests = []

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
        if len(self._negative_tests) > 1:
            # remove
            pass


if __name__ == '__main__':
    root = "/Users/ruizhengu/Experiments/APR-as-AAT/IntroClassJava/dataset/checksum/2c1556672751734adf9a561fbf88767c32224fca14a81e9d9c719f18d0b21765038acc16ecd8377f74d4f43e8c844538161d869605e3516cf797d0a6a59f1f8e/003"
    partial = PartialRepair(root, "introclassJava")
    partial.partial_repair()
