import re
import shutil
import subprocess
from pathlib import Path
import xml.etree.ElementTree as ET
import utils


class CafeProcessing:
    def __init__(self):
        self.submission_path = Path("/Users/ruizhengu/Experiments/APR-as-AAT/anonymised-submissions")
        self.model_solution = Path("/Users/ruizhengu/Projects/APR-as-AAT/resource/cafe_java_8")
        self.model_test_suite = self.model_solution / "src/test/java/uk/ac/sheffield/com1003/cafe"
        self.submission_list = list(filter(lambda p: ".DS_Store" not in str(p), self.submission_path.iterdir()))
        self._main_path = Path("src/main/java/uk/ac/sheffield/com1003/cafe")
        self._test_path = Path("src/test/java/uk/ac/sheffield/com1003/cafe")

    def replace_build_gradle(self, submission):
        build_gradle_source = self.model_solution / "build.gradle"
        build_gradle_submission = submission / "build.gradle"
        shutil.copy2(build_gradle_source, build_gradle_submission)

    def compile_submissions(self):
        for submission in self.submission_list:
            print(submission)
            self.replace_build_gradle(submission)
            chmod = f"chmod +x {submission}/gradlew"
            cmd = f"{submission}/gradlew build -x test -p {submission}"
            self.replace_tests(submission)
            self.inject_model_solution(submission)
            self.inject_aspectj(submission)
            try:
                utils.run_cmd(chmod)
                build_output = utils.run_cmd(cmd)
                if "BUILD SUCCESSFUL" not in build_output:
                    print(submission.name + " BUILD FAILED")
            except Exception as e:
                print(f"{submission} - Error executing {e}")
            break

    def replace_tests(self, submission):
        destination = submission / self._test_path
        utils.empty_directory(destination)
        if not destination.exists():
            destination.mkdir(parents=True)
        for item in self.model_test_suite.iterdir():
            if item.is_dir():
                shutil.copytree(item, destination / item.name)
            else:
                shutil.copy2(item, destination / item.name)

    def inject_model_solution(self, submission):
        model_solution = self.model_solution / self._main_path / "solution"
        destination = submission / self._main_path / "solution"
        if destination.exists():
            shutil.rmtree(destination)
        shutil.copytree(model_solution, destination)

    def inject_aspectj(self, submission):
        model_solution = self.model_solution / "src/main/java/aspect"
        destination = submission / "src/main/java/aspect"
        if destination.exists():
            shutil.rmtree(destination)
        shutil.copytree(model_solution, destination)

    def get_failed_tests(self):
        for submission in self.submission_list:
            test_cmd = f"{submission}/gradlew build -p {submission}"
            utils.run_cmd(test_cmd)
            list_cmd = f"{submission}/gradlew listFailedTests -p {submission}"
            output = utils.run_cmd(list_cmd)
            pattern = r"^(.+::\w+)$"
            failed_tests = re.findall(pattern, output, re.MULTILINE)
            failed_tests = [t.replace("::", ".") for t in failed_tests]
            print(len(failed_tests), failed_tests)
            for test in failed_tests:
                self.get_method_calls(submission, test)
            break

    def get_method_calls(self, submission, test):
        execution_log = submission / "method-executions.log"
        test_cmd = f"{submission}/gradlew -p {submission} test --tests {test}"
        utils.run_cmd(test_cmd)
        with open(execution_log, "r") as f:
            calls = f.readlines()
        calls = set([line.replace("\n", "") for line in calls])
        print(calls)


if __name__ == '__main__':
    p = CafeProcessing()
    p.compile_submissions()
    # p.replace_tests()
    # p.inject_model_solution()
    p.get_failed_tests()
