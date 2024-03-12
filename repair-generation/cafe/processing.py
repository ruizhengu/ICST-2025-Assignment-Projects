import json
import os.path
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
        # self.submission_list = list(filter(lambda p: ".DS_Store" not in str(p) and "", self.submission_path.iterdir()))
        self.submission_list = [submission for submission in self.submission_path.iterdir() if
                                submission.is_dir() and submission.name != ".git"]
        self._main_path = Path("src/main/java/uk/ac/sheffield/com1003/cafe")
        self._test_path = Path("src/test/java/uk/ac/sheffield/com1003/cafe")
        self.methods = self.get_model_methods()

    def replace_build_gradle(self, submission):
        build_gradle_source = self.model_solution / "build.gradle"
        build_gradle_submission = submission / "build.gradle"
        shutil.copy2(build_gradle_source, build_gradle_submission)

    def compile_submissions(self):
        for submission in self.submission_list:
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
            print("*" * 5 + f" {submission} compilation finish " + "*" * 5)

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
        submission_method_coverage = {}
        method_coverage_json = "/Users/ruizhengu/Projects/APR-as-AAT/repair-generation/lib/method_coverage.json"
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

    def get_method_calls(self, submission, test):
        execution_log = submission / "method-executions.log"
        test_cmd = f"{submission}/gradlew -p {submission} test --tests {test}"
        utils.run_cmd(test_cmd)
        with open(execution_log, "r") as f:
            calls = f.readlines()
        calls = set([line.replace("\n", "") for line in calls])
        return calls

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

    def get_model_methods(self):
        methods_txt = Path("/Users/ruizhengu/Projects/APR-as-AAT/repair-generation/lib/methods.txt")
        with open(methods_txt, "r") as f:
            methods = f.readlines()
        deduplicate = set(methods)
        return [m.replace("\n", "") for m in deduplicate]

    def test_all_submissions(self):
        for submission in self.submission_list:
            test_cmd = f"{submission}/gradlew build -p {submission}"
            utils.run_cmd(test_cmd)
            try:
                build_output = utils.run_cmd(test_cmd)
                if "BUILD SUCCESSFUL" not in build_output and "Execution failed for task ':test'." not in build_output:
                    print(submission.name + " BUILD FAILED")
            except Exception as e:
                print(f"{submission} - Error executing {e}")
            # print("*" * 5 + f" {submission} compilation finish " + "*" * 5)

    def reset_submission(self):
        """
        Remove the model solution
        Remove the model test suite
        Remove AspectJ and method-executions.log
        """
        for submission in self.submission_list:
            # Remove the model solution
            model_solution = submission / self._main_path / "solution"
            if model_solution.exists():
                shutil.rmtree(model_solution)
            # Remove the model test suite
            model_test = submission / self._test_path / "solution"
            if model_test.exists():
                shutil.rmtree(model_test)
            # Remove AspectJ
            aspect_j = submission / "src/main/java/aspect"
            if aspect_j.exists():
                shutil.rmtree(aspect_j)
            # remove method execution log
            log = submission / "method-executions.log"
            if os.path.exists(log):
                os.remove(log)
            test_cmd = f"{submission}/gradlew build -p {submission}"
            utils.run_cmd(test_cmd)
            try:
                build_output = utils.run_cmd(test_cmd)
                if "BUILD SUCCESSFUL" not in build_output and "Execution failed for task ':test'." not in build_output:
                    print(submission.name + " BUILD FAILED")
            except Exception as e:
                print(f"{submission} - Error executing {e}")

    def count_submission(self):
        count = 0
        for submission in self.submission_list:
            count += 1
        print(count)


if __name__ == '__main__':
    # p = CafeProcessing()
    # p.compile_submissions()
    # p.get_failed_tests()
    nega = "uk.ac.sheffield.com1003.cafe.TestPlaceOrderForNonexistentRecipeThrowsCorrectException#placeOrderForNonexistentRecipeThrowsCorrectException, uk.ac.sheffield.com1003.cafe.TestServeNonexistentOrder#serveNonexistentOrder, uk.ac.sheffield.com1003.cafe.TestCafeTask3#placeAndServeOrder, uk.ac.sheffield.com1003.cafe.TestCafeTask3#placeOrderOutOfCapacityThrowsException, uk.ac.sheffield.com1003.cafe.TestCafeTask3#placeOrderCapacityZeroThrowsCorrectException, uk.ac.sheffield.com1003.cafe.TestCafeTask3#serveNonexistentOrder, uk.ac.sheffield.com1003.cafe.TestPlaceAndServeOrder#placeAndServeOrder, uk.ac.sheffield.com1003.cafe.TestCafeTask3#placeOrderForNonexistentRecipeThrowsException, uk.ac.sheffield.com1003.cafe.TestCafeTask3#placeOrderOutOfCapacityThrowsCorrectException, uk.ac.sheffield.com1003.cafe.TestRemoveRecipe#testRemoveRecipe, uk.ac.sheffield.com1003.cafe.TestCafeTask3#placeOrderCapacityZeroThrowsException, uk.ac.sheffield.com1003.cafe.TestCafeTask7#testRemoveRecipe, uk.ac.sheffield.com1003.cafe.TestSyrupToString#testSyrupToString, uk.ac.sheffield.com1003.cafe.TestRemoveMiddleRecipe#testRemoveMiddleRecipe, uk.ac.sheffield.com1003.cafe.TestRecipeEqualsIncompleteRecipe#testRecipeEqualsIncompleteRecipe, uk.ac.sheffield.com1003.cafe.TestRemoveAllRecipes#testRemoveAllRecipes, uk.ac.sheffield.com1003.cafe.TestCafeTask1#testTooManyIngredients, uk.ac.sheffield.com1003.cafe.TestCafeTask6#testSyrupToString, uk.ac.sheffield.com1003.cafe.TestCafeTask3#placeOrderForNonexistentRecipeThrowsCorrectException, uk.ac.sheffield.com1003.cafe.TestCafeTask7#testRemoveMiddleRecipe, uk.ac.sheffield.com1003.cafe.TestCafeTask5#testRecipeEqualsIncompleteRecipe, uk.ac.sheffield.com1003.cafe.TestCafeTask7#testRemoveAllRecipes"
    for t in nega.split(","):
        print(t)

    # dep = Path("/Users/ruizhengu/Projects/APR-as-AAT/dependency")
    # dependencies = [str(file) for file in dep.glob('**/*.jar') if file.name != ".DS_Store"]
    # dependencies = ":".join(dependencies)
    # print(dependencies)