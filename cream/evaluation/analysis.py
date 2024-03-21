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

    def launcher(self):
        intermediate = Path("/Users/ruizhengu/Experiments/APR4Grade/114")
        patches = Path("/Users/ruizhengu/Downloads/114")

        buggy_methods = [method for method in patches.iterdir() if method.is_dir()]
        valid_patches = self.count_valid_patches(buggy_methods)
        if len(valid_patches) == 1:
            intermediate = self.apply_patch(intermediate, valid_patches[0])
            self.degree_of_patchness(intermediate, patches, buggy_methods)
        else:
            print("There are multiple patches, manually apply them to avoid conflict.")

    def degree_of_patchness(self, intermediate, patches, buggy_methods):
        dp = 0
        unnormalised_weights = self.get_unnormalised_weights(buggy_methods)
        for method in buggy_methods:
            method_unnormalised_weight = self.get_weight(method.name)
            method_normalised_weight = method_unnormalised_weight * 100 / unnormalised_weights
            num_failed_tests_before = self.get_number_failed_tests_before_patch(patches.name, method.name)
            num_failed_tests_after = self.get_number_failed_tests(intermediate, method.name)
            print(
                f"Program {intermediate.name}-{method.name} Num failed tests before: {num_failed_tests_before} Num failed tests after: {num_failed_tests_after}")
            dp += method_normalised_weight * (
                    num_failed_tests_before - num_failed_tests_after) / num_failed_tests_before
        print(f"Patched Program {intermediate.name} Degree of Patchness {dp}")

    def apply_patch(self, intermediate, patch):
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
        # Compile the patched program
        chmod = f"chmod +x {intermediate}/gradlew"
        cmd = f"{intermediate}/gradlew build -p {intermediate}"
        try:
            utils.run_cmd(chmod)
            build_output = utils.run_cmd(cmd)
            if "BUILD SUCCESSFUL" not in build_output and "Execution failed for task ':test'." not in build_output:
                print(intermediate.name + " BUILD FAILED")
        except Exception as e:
            print(f"{intermediate} - Error executing {e}")
        return intermediate

    def get_weight(self, method):
        with open(self.method_weighting_json, 'r') as file:
            data = json.load(file)
        return data[method]["weight"]

    def get_unnormalised_weights(self, buggy_methods):
        unnormalised_weights = 0
        for buggy_method in buggy_methods:
            weight = self.get_weight(buggy_method.name)
            unnormalised_weights += weight
        return unnormalised_weights

    def get_number_failed_tests_before_patch(self, submission, method):
        with open(self.method_coverage_json, 'r') as file:
            data = json.load(file)
        return data[submission][method]["num"]

    def get_number_failed_tests(self, patched_program, method):
        list_cmd = f"{patched_program}/gradlew listFailedTests -p {patched_program}"
        output = utils.run_cmd(list_cmd)
        pattern = r"^(.+::\w+)$"
        failed_tests = re.findall(pattern, output, re.MULTILINE)
        failed_tests = [t.replace("::", ".") for t in failed_tests]
        method_covering_tests = self.get_method_covering_tests(method)
        still_failed_tests = [el for el in failed_tests if el in method_covering_tests]
        return len(still_failed_tests)

    def get_method_covering_tests(self, method):
        with open(self.method_weighting_json, 'r') as file:
            data = json.load(file)
        return data[method]["tests"]

    def count_valid_patches(self, buggy_methods):
        valid_patches = []
        for buggy_method in buggy_methods:
            patch = self.patch_selection(buggy_method)
            if patch is not None:
                valid_patches.append(patch)
        return valid_patches

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
    a.launcher()
