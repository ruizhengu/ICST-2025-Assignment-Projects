import json
import os
import re
import shutil
from pathlib import Path

import utils


class Intermediate4LLM:
    def __init__(self):
        self.root = Path("/Users/ruizhengu/Projects")
        self.project_home = self.root / "NERO"

        self.model_solution = Path("/Users/ruizhengu/Experiments/model_solution") # TODO create a new one without the solution test folder
        self.dataset_home = Path("/Users/ruizhengu/Experiments/incorrect_submissions")
        self.method_coverage_json = self.project_home / "resource/method_coverage.json"
        self.intermediates_path = Path("/Users/ruizhengu/Experiments/intermediates_llm")
        self.method_file_json = self.project_home / "resource/method_files.json"


    def get_buggy_methods(self, submission):
        buggy_methods = []
        with open(self.method_coverage_json) as f:
            data = json.load(f)
        for method, coverage in data[submission].items():
            if coverage["num"] > 0:
                buggy_methods.append(method)
        return buggy_methods

    def delete_redundant(self, submission):
        aspect_path = self.dataset_home / submission / "src/main/java/aspect"
        if aspect_path.exists():
            shutil.rmtree(aspect_path)

    def copy_submission(self, submission, intermediate):
        original_submission = self.dataset_home / submission
        if intermediate.exists():
            shutil.rmtree(intermediate)
        shutil.copytree(original_submission, intermediate)

    def replace_tests(self, submission):
        destination = submission / "src/test/java/cafe"
        utils.empty_directory(destination)
        if not destination.exists():
            destination.mkdir(parents=True)
        # TODO remove the solution test folder
        model_test_suite = self.model_solution / "src/test/java/cafe"
        for item in model_test_suite.iterdir():
            if item.is_file():
                shutil.copy2(item, destination / item.name)


    def get_method_path(self, method_name):
        with open(self.method_file_json) as f:
            d = json.load(f)
        return d[method_name]

    def update_intermediate(self, submission, methods_to_replace):
        for method in methods_to_replace:
            method_content = self.get_model_method_content(method, False)
            self.replace_method(submission, method, method_content)

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

    def create_intermediates(self, submission):
        intermediate_submission = self.intermediates_path / submission
        if not intermediate_submission.exists():
            os.mkdir(intermediate_submission)
        buggy_methods = self.get_buggy_methods(submission)
        for method in buggy_methods:
            intermediate_program = intermediate_submission / method
            self.copy_submission(submission, intermediate_program)
            methods_to_replace = list(filter(lambda x: x != method, buggy_methods))
            self.update_intermediate(intermediate_program, methods_to_replace)

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

    def launcher(self):
        for i in range(1, 2):
            self.delete_redundant(str(i))
            self.create_intermediates(str(i))
            self.check_compilation(str(i))

if __name__ == '__main__':
    i4l = Intermediate4LLM()
    i4l.launcher()