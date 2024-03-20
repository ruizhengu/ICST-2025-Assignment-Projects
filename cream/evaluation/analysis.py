import json
import re
import shutil
from pathlib import Path

import pandas as pd
from cream import utils


class Analysis:
    def __init__(self):
        self.root = Path("/Users/ruizhengu/Projects")
        self.project_home = self.root / "APR4Grade"
        self.method_weighting_json = self.project_home / "resource/method_weighting.json"
        self.method_coverage_json = self.project_home / "resource/method_coverage.json"
        self._main_path = Path("main/java/uk/ac/sheffield/com1003/cafe")

    def calculate_weights(self):
        with open(self.method_weighting_json, 'r') as file:
            data = json.load(file)
        weighted_data = {}
        num_tests = []
        for name, tests in data.items():
            num_tests.append(tests["num"])
        total_tests = sum(num_tests)
        for name, tests in data.items():
            weighted_data[name] = {
                "tests": tests["tests"],
                "num": tests["num"],
                "weight": round(tests["num"] * 100.00 / total_tests, 2)
            }
        with open(self.method_weighting_json, "w") as f:
            f.write(json.dumps(weighted_data, indent=4))

    def degree_of_patchness(self):
        submission = 114
        method = "Recipe.equals"
        method_weight = self.get_weight(method)
        num_failed_tests_before = self.get_number_failed_tests_before_patch(str(submission), method)
        print(method_weight)
        print(num_failed_tests_before)
        intermediate = Path("/Users/ruizhengu/Experiments/APR4Grade/114")
        self.apply_patch(intermediate)
        num_failed_tests_after = self.get_number_failed_tests(intermediate, method)
        print(num_failed_tests_after)
        # TODO Get the normalised weight of the method

    def apply_patch(self, intermediate):
        patches = Path("/Users/ruizhengu/Downloads/114/Recipe.equals")
        patch = self.patch_selection(patches)
        patch_classes = patch / "patched" / self._main_path
        for clazz in patch_classes.iterdir():
            if clazz.is_file() and clazz.name.endswith(".java"):
                submission_clazz = intermediate / "src" / self._main_path / clazz.name
                submission_clazz.unlink()
                shutil.copy(clazz, submission_clazz)
            elif clazz.is_dir():
                for sub_clazz in clazz.iterdir():
                    if sub_clazz.name.endswith(".java"):
                        submission_clazz = intermediate / "src" / self._main_path / clazz.name / sub_clazz.name
                        submission_clazz.unlink()
                        shutil.copy(sub_clazz, submission_clazz)

    def get_weight(self, method):
        with open(self.method_weighting_json, 'r') as file:
            data = json.load(file)
        return data[method]["weight"]

    def get_number_failed_tests_before_patch(self, submission, method):
        with open(self.method_coverage_json, 'r') as file:
            data = json.load(file)
        return data[submission][method]["num"]

    def get_number_failed_tests(self, patched_program, method):
        chmod = f"chmod +x {patched_program}/gradlew"
        cmd = f"{patched_program}/gradlew build -p {patched_program} --parallel"
        try:
            utils.run_cmd(chmod)
            build_output = utils.run_cmd(cmd)
            if "BUILD SUCCESSFUL" not in build_output and "Execution failed for task ':test'." not in build_output:
                print(patched_program.name + " BUILD FAILED")
        except Exception as e:
            print(f"{patched_program} - Error executing {e}")

        list_cmd = f"{patched_program}/gradlew listFailedTests -p {patched_program}"
        output = utils.run_cmd(list_cmd)
        pattern = r"^(.+::\w+)$"
        failed_tests = re.findall(pattern, output, re.MULTILINE)
        method_covering_tests = self.get_method_covering_tests(method)
        still_failed_tests = [el for el in failed_tests if el in method_covering_tests]
        return len(still_failed_tests)

    def get_method_covering_tests(self, method):
        with open(self.method_weighting_json, 'r') as file:
            data = json.load(file)
        return data[method]["tests"]

    def patch_selection(self, patches):
        patches_filtered = []
        if not any(patches.iterdir()):
            return None
        for patch in patches.iterdir():
            if patch.is_dir():
                diff = patch / "diff"
                with open(diff, "r") as f:
                    d = f.read()
                if "System.exit(0);" not in d:
                    patches_filtered.append(patch)
        # Get the patch with the minimal edits (lowest number of lines in the diff file)
        min_lines = None
        min_file = None
        for filtered_patch in patches_filtered:
            diff = filtered_patch / "diff"
            with open(diff, "r") as f:
                lines = f.readlines()
                number_of_lines = len(lines)
                if min_lines is None or number_of_lines < min_lines:
                    min_lines = number_of_lines
                    min_file = filtered_patch
        return min_file


if __name__ == '__main__':
    a = Analysis()
    a.degree_of_patchness()
