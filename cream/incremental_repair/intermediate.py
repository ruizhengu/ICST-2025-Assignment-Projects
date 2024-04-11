import json
import logging
import os
import re
import shutil
import sys
from pathlib import Path

from cream import utils


class Intermediate:
    def __init__(self, model):
        if sys.platform == "linux":
            self.root = Path("/mnt/parscratch/users/acp22rg/APR")
        # elif sys.platform == "linux2":
        #     self.root = Path("/mnt/fastdata/acp22rg/APR2")
        else:
            self.root = Path("/Users/ruizhengu/Projects")

        self.project_home = self.root / "APR4Grade"
        self.dataset_home = self.root / "IntermediateJava/incorrect_submissions"
        self.method_file_json = self.project_home / "resource/method_files.json"
        self.method_solution_test = self.project_home / "resource/method_of_interest_test.json"

        if model == "m":
            self.model_solution = self.root / "IntermediateJava/model_solution"
        elif model == "1":
            self.model_solution = self.root / "IntermediateJava/correct_submissions/1"
        elif model == "2":
            self.model_solution = self.root / "IntermediateJava/correct_submissions/2"
        elif model == "3":
            self.model_solution = self.root / "IntermediateJava/correct_submissions/3"
        else:
            print("Please enter a valid model. Valid models are 1, 2, 3, m.")
        self.method_coverage_json = self.project_home / "resource/method_coverage.json"
        self.intermediates_path = self.root / "intermediates"
        self.arja_home = self.root / "arja"
        self.dependency = self.root / "IntermediateJava/dependency"
        # self.count_purged_solutions = 0

    def get_method_path(self, method_name):
        with open(self.method_file_json) as f:
            d = json.load(f)
        return d[method_name]

    def get_solution_test_path(self, method_name):
        with open(self.method_solution_test) as f:
            d = json.load(f)
        return d[method_name]

    def update_intermediate(self, submission, methods_to_replace):
        for method in methods_to_replace:
            method_content = self.get_model_method_content(method, False)
            self.replace_method(submission, method, method_content)

    def inject_correct_method_of_interest(self, method_name, submission):
        method_content = self.get_model_method_content(method_name, True)
        method_file = Path(self.get_method_path(method_name))
        file_path = submission / method_file
        with open(file_path, "r") as file:
            code = file.read()
        injection_point = code.rfind("}")
        injected_code = code[:injection_point] + "\n\n" + method_content + "\n" + code[injection_point:]
        with open(file_path, "w") as file:
            file.write(injected_code)
        self.inject_method_of_interest_test(method_name, submission)

    def inject_method_of_interest_test(self, method_name, submission):
        test_file = Path(self.get_solution_test_path(method_name))
        test_path = submission / Path("src/test/java/uk/ac/sheffield/com1003/cafe/solution")
        if not test_path.exists():
            os.mkdir(test_path)
        model_test_path = self.model_solution / test_file
        destination_path = submission / test_file
        shutil.copy2(model_test_path, destination_path)

    def replace_method(self, submission, method_name, content):
        method_file = Path(self.get_method_path(method_name))
        file_path = submission / method_file
        with open(file_path, "r") as file:
            code = file.read()
        pattern = re.compile(
            rf'(public|protected|private|static|\s) +[\w<>\[\]]+\s+{re.escape(method_name.split(".")[1])}\s*\([^\)]*\)\s*(throws\s+[\w,\s]+)?\s*\{{',
            re.DOTALL)
        match = pattern.search(code)
        if not match:
            print(f"Method {method_name} not found.")
            return
        start_index = match.start()
        brace_count = 1
        i = match.end()
        while i < len(code) and brace_count > 0:
            if code[i] == '{':
                brace_count += 1
            elif code[i] == '}':
                brace_count -= 1
            i += 1
        new_code = code[:start_index] + content + code[i:]
        with open(file_path, "w") as file:
            file.write(new_code)

    def get_model_method_content(self, method_name, solution):
        method_file = Path(self.get_method_path(method_name))
        file_path = self.model_solution / method_file
        with open(file_path, "r") as file:
            code = file.read()
        if not solution:
            pattern = re.compile(
                rf'(public|protected|private|static|\s) +[\w<>\[\]]+\s+{re.escape(method_name.split(".")[1])}\s*\([^\)]*\)\s*(throws\s+[\w,\s]+)?\s*\{{',
                re.DOTALL)
        else:
            pattern = re.compile(
                rf'(public|protected|private|static|\s) +[\w<>\[\]]+\s+{re.escape(method_name.split(".")[1] + "Solution")}\s*\([^\)]*\)\s*(throws\s+[\w,\s]+)?\s*\{{',
                re.DOTALL)
        match = pattern.search(code)
        if match:
            start_index = match.start()
            brace_count = 1
            i = match.end()
            while i < len(code) and brace_count > 0:
                if code[i] == '{':
                    brace_count += 1
                elif code[i] == '}':
                    brace_count -= 1
                i += 1
            return code[start_index:i].strip()
        else:
            print(f"Method {method_name} not found in {file_path}")
            return None

    def get_buggy_methods(self, submission):
        buggy_methods = []
        with open(self.method_coverage_json) as f:
            data = json.load(f)
        for method, coverage in data[submission].items():
            if coverage["num"] > 0:
                buggy_methods.append(method)
        return buggy_methods

    def check_compilation(self, submission):
        intermediate_submission = self.intermediates_path / submission
        for intermediate in intermediate_submission.iterdir():
            if intermediate.is_dir():
                chmod = f"chmod +x {intermediate}/gradlew"
                cmd = f"{intermediate}/gradlew clean build -p {intermediate}"
                try:
                    utils.run_cmd(chmod)
                    build_output = utils.run_cmd(cmd)
                    if "BUILD SUCCESSFUL" not in build_output and "Execution failed for task ':test'." not in build_output:
                        print(f"{submission} - {intermediate.name} BUILD FAILED")
                    elif "BUILD SUCCESSFUL" in build_output and "Execution failed for task ':test'." not in build_output:
                        shutil.rmtree(intermediate)
                except Exception as e:
                    print(f"{submission} - {intermediate.name} - Error executing {e}")

    def copy_submission(self, submission, intermediate):
        original_submission = self.dataset_home / submission
        if intermediate.exists():
            shutil.rmtree(intermediate)
        shutil.copytree(original_submission, intermediate)

    def create_intermediates(self, submission):
        intermediate_submission = self.intermediates_path / submission
        if not intermediate_submission.exists():
            os.mkdir(intermediate_submission)
        buggy_methods = self.get_buggy_methods(submission)
        # self.count_purged_solutions += len(buggy_methods)
        for method in buggy_methods:
            intermediate_program = intermediate_submission / method
            self.copy_submission(submission, intermediate_program)
            self.replace_tests(intermediate_program)
            self.inject_correct_method_of_interest(method, intermediate_program)
            methods_to_replace = list(filter(lambda x: x != method, buggy_methods))
            self.update_intermediate(intermediate_program, methods_to_replace)

    # def inject_model_solution(self, intermediate_program):
    #     model_solution = self.model_solution / "src/main/java/uk/ac/sheffield/com1003/cafe/solution"
    #     destination = intermediate_program / "src/main/java/uk/ac/sheffield/com1003/cafe/solution"
    #     if destination.exists():
    #         shutil.rmtree(destination)
    #     shutil.copytree(model_solution, destination)
    #
    # def replace_tests_with_solution(self, intermediate_program):
    #     destination = intermediate_program / "src/test/java/uk/ac/sheffield/com1003/cafe"
    #     utils.empty_directory(destination)
    #     if not destination.exists():
    #         destination.mkdir(parents=True)
    #     model_test_suite = self.model_solution / "src/test/java/uk/ac/sheffield/com1003/cafe"
    #     for item in model_test_suite.iterdir():
    #         if item.is_dir():
    #             shutil.copytree(item, destination / item.name)
    #         else:
    #             shutil.copy2(item, destination / item.name)

    def replace_tests(self, submission):
        destination = submission / "src/test/java/uk/ac/sheffield/com1003/cafe"
        utils.empty_directory(destination)
        if not destination.exists():
            destination.mkdir(parents=True)
        model_test_suite = self.model_solution / "src/test/java/uk/ac/sheffield/com1003/cafe"
        for item in model_test_suite.iterdir():
            if item.is_file():
                shutil.copy2(item, destination / item.name)

    def launcher(self):
        for i in range(1, 297):
            self.create_intermediates(str(i))
            self.check_compilation(str(i))
        # print(self.count_purged_solutions)

    def empty_intermediates(self):
        utils.empty_directory(self.intermediates_path)


if __name__ == '__main__':
    # model = sys.argv[1]
    model = "2"
    im = Intermediate(model)
    im.empty_intermediates()
    im.launcher()
