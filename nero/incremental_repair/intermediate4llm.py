import json
import os
import shutil
from pathlib import Path

import utils


class Intermediate4LLM:
    def __init__(self):
        self.root = Path("/Users/ruizhengu/Projects")
        self.project_home = self.root / "NERO"

        self.model_solution = Path("/Users/ruizhengu/Experiments/model_solution") # TODO create a new one without the solution test folder
        self.dataset_home = self.root / "IntermediateJava/incorrect_submissions"
        self.method_coverage_json = self.project_home / "resource/method_coverage.json"
        self.intermediates_path = Path("/Users/ruizhengu/Experiments/intermediates_llm")

    def get_buggy_methods(self, submission):
        buggy_methods = []
        with open(self.method_coverage_json) as f:
            data = json.load(f)
        for method, coverage in data[submission].items():
            if coverage["num"] > 0:
                buggy_methods.append(method)
        return buggy_methods

    def delete_redundant(self):
        # delete aspectj folder, solution tests folder
        pass

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

    def launcher(self):
        for i in range(1, 297):
            self.create_intermediates(str(i))
            self.check_compilation(str(i))
