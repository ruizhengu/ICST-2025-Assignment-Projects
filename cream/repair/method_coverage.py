import json
import re
import shutil
import sys
from pathlib import Path

from cream import utils


class MethodCoverage:
    def __init__(self):
        if sys.platform == "linux":
            self.root = Path("/mnt/parscratch/users/acp22rg/APR")
        else:
            self.root = Path("/Users/ruizhengu/Projects")
        self.project_home = self.root / "APR4Grade"
        self.dataset_home = self.root / "IntermediateJava/incorrect_submissions"
        self.model_solution = self.root / "IntermediateJava/model_solution"
        self.model_test_suite = self.model_solution / "src/test/java/uk/ac/sheffield/com1003/cafe"
        self.submission_list = [submission for submission in self.dataset_home.iterdir() if
                                submission.is_dir() and submission.name != ".git"]

        self.methods = self.get_model_methods()
        self.method_file_json = self.project_home / "resource/method_files.json"
        self.method_coverage_json = self.project_home / "resource/lib/method_coverage.json"

    def get_model_methods(self):
        methods_txt = self.project_home / "resource/methods.txt"
        # methods_txt = self.project_home / "resource/methods_of_interest.txt"
        with open(methods_txt, "r") as f:
            methods = f.readlines()
        deduplicate = set(methods)
        return [m.replace("\n", "") for m in deduplicate]

    def get_method_coverage(self, test_method_calls):
        method_coverage = {}
        for method in self.methods:
            data = {}
            tests = []
            for test, method_calls in test_method_calls.items():
                for call in method_calls:
                    if method in call:
                        tests.append(test)
            data["tests"] = tests
            data["num"] = len(tests)
            method_coverage[method] = data
        return method_coverage

    def get_method_calls(self, submission, test):
        execution_log = submission / "method-executions.log"
        test_cmd = f"{submission}/gradlew -p {submission} test --tests {test}"
        utils.run_cmd(test_cmd)
        with open(execution_log, "r") as f:
            calls = f.readlines()
        calls = set([line.replace("\n", "") for line in calls])
        return calls

    def inject_aspectj(self, submission):
        model_solution = self.model_solution / "src/main/java/aspect"
        destination = submission / "src/main/java/aspect"
        if destination.exists():
            shutil.rmtree(destination)
        shutil.copytree(model_solution, destination)

    def failed_tests_method_coverage(self):
        submission_method_coverage = {}
        method_coverage_json = self.project_home / "resource/method_coverage.json"
        for submission in self.submission_list:
            self.inject_aspectj(submission)
            test_cmd = f"{submission}/gradlew build -p {submission}"
            utils.run_cmd(test_cmd)
            list_cmd = f"{submission}/gradlew listFailedTests -p {submission}"
            output = utils.run_cmd(list_cmd)
            pattern = r"^(.+::\w+)$"
            failed_tests = re.findall(pattern, output, re.MULTILINE)
            failed_tests = [t.replace("::", ".") for t in failed_tests]
            test_method_calls = {}
            for test in failed_tests:
                method_calls = self.get_method_calls(submission, test)
                test_method_calls[test] = method_calls
            method_coverage = self.get_method_coverage(test_method_calls)
            submission_method_coverage[submission.name] = method_coverage
            with open(method_coverage_json, "w") as f:
                f.write(json.dumps(submission_method_coverage, indent=4))
            print(f"Get failed tests: {submission.name}")

    def method_weighting(self):
        method_weighting_json = self.project_home / "resource/method_weighting.json"
        list_cmd = f"{self.model_solution}/gradlew listTests -p {self.model_solution}"
        list_output = utils.run_cmd(list_cmd)
        pattern = r"^(.+::\w+)$"
        tests = re.findall(pattern, list_output, re.MULTILINE)
        tests = [t.replace("::", ".") for t in tests]
        test_method_calls = {}
        for test in tests:
            method_calls = self.get_method_calls(self.model_solution, test)
            test_method_calls[test] = method_calls
        method_weighting = self.get_method_coverage(test_method_calls)
        with open(method_weighting_json, "w") as f:
            f.write(json.dumps(method_weighting, indent=4))

    def method_weighting_remove_solutions(self):
        method_weighting_json = self.project_home / "resource/method_weighting.json"
        with open(method_weighting_json, 'r') as file:
            data = json.load(file)
        filter_data = {}
        for name, tests in data.items():
            filter_tests = [test for test in tests["tests"] if "uk.ac.sheffield.com1003.cafe.solution" not in test]
            filter_data[name] = {
                "tests": filter_tests,
                "num": len(filter_tests)
            }
        with open(method_weighting_json, "w") as f:
            f.write(json.dumps(filter_data, indent=4))


if __name__ == '__main__':
    m = MethodCoverage()
    # m.failed_tests_method_coverage()
    m.method_weighting()
    m.method_weighting_remove_solutions()
