import json
import re
import shutil
from pathlib import Path

import pandas as pd
from cream import utils
from cream.incremental_repair.intermediate import Intermediate


class Analysis:
    def __init__(self):
        self.root = Path("/Users/ruizhengu/Projects")
        self.project_home = self.root / "APR4Grade"
        self.method_weighting_json = self.project_home / "resource/method_weighting.json"
        self.method_coverage_json = self.project_home / "resource/method_coverage.json"
        self._main_path = Path("main/java/uk/ac/sheffield/com1003/cafe")
        self.model = "3"
        self.model_solution = {
            "m": self.root / "IntermediateJava/model_solution",
            "1": self.root / "IntermediateJava/correct_submissions/1",
            "2": self.root / "IntermediateJava/correct_submissions/2",
            "3": self.root / "IntermediateJava/correct_submissions/3",
        }
        self.patches_path = Path(f"/Users/ruizhengu/Experiments/APR4Grade/patches_{self.model}")
        self.intermediate = Intermediate(self.model)
        self.results_json = self.project_home / "resource/results.json"
        self.dataset_home = self.root / "IntermediateJava/incorrect_submissions"

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
        count_patches = 0
        for patches in self.patches_path.iterdir():
            if patches.is_dir():
                buggy_methods = [method for method in patches.iterdir() if method.is_dir()]
                valid_patches = self.count_valid_patches(buggy_methods)
                if len(valid_patches) == 1:
                    # intermediate_path = self.get_submissions(patches)
                    # intermediate = self.apply_patch(intermediate_path, valid_patches[0])
                    # self.degree_of_patchedness(intermediate, patches, buggy_methods)
                    count_patches += 1
                elif len(valid_patches) > 1:
                    count_patches += 1
                    print(f"Submission {patches.name} has multiple patches, manually apply them to avoid conflict.")
                    for patch in valid_patches:
                        print(patch)
                else:
                    shutil.rmtree(patches)
        print(count_patches)

    def individual_check(self):
        dp = 0
        patches = Path("/Users/ruizhengu/Experiments/APR4Grade/patches_3/195")
        intermediate = Path("/Users/ruizhengu/Projects/intermediates/195")
        buggy_methods = [method for method in patches.iterdir() if method.is_dir()]
        unnormalised_weights = self.get_unnormalised_weights(buggy_methods)

        # valid_patches = self.count_valid_patches(buggy_methods)
        # intermediate = self.apply_patch(intermediate, valid_patches[0])
        for method in buggy_methods:
            method_unnormalised_weight = self.get_weight(method.name)
            method_normalised_weight = method_unnormalised_weight * 100 / unnormalised_weights
            num_failed_tests_before = self.get_num_failed_tests_before_patch(patches.name, method.name)
            num_failed_tests_after = self.get_number_failed_tests_method(intermediate, method.name)
            print(
                f"Program {intermediate.name}-{method.name} Num failed tests before: {num_failed_tests_before} Num failed tests after: {num_failed_tests_after}")
            dp += method_normalised_weight * (
                    num_failed_tests_before - num_failed_tests_after) / num_failed_tests_before
        print(f"Patched Program {intermediate.name} Degree of Patchedness {round(dp, 2)}")

    def get_results(self):
        with open(self.results_json, 'r') as f:
            d = json.load(f)[self.model]
        dps = []
        for submission, result in d.items():
            dps.append(result["degree of patchedness"])
        dp_len = len(dps)
        dp_max = max(dps)
        dp_min = min(dps)
        dp_avg = sum(dps) / dp_len
        print(f"Number of patched programs: {dp_len}")
        print(f"Maximum dp: {dp_max}")
        print(f"Minimum dp: {dp_min}")
        print(f"Average dp: {round(dp_avg, 2)}")

    def degree_of_patchedness(self, intermediate, patches, buggy_methods):
        dp = 0
        unnormalised_weights = self.get_unnormalised_weights(buggy_methods)
        for method in buggy_methods:
            method_unnormalised_weight = self.get_weight(method.name)
            method_normalised_weight = method_unnormalised_weight * 100 / unnormalised_weights
            num_failed_tests_before = self.get_num_failed_tests_before_patch(patches.name, method.name)
            num_failed_tests_after = self.get_number_failed_tests_method(intermediate, method.name)
            # print(
            #     f"Program {intermediate.name}-{method.name} Num failed tests before: {num_failed_tests_before} Num failed tests after: {num_failed_tests_after}")
            dp += method_normalised_weight * (
                    num_failed_tests_before - num_failed_tests_after) / num_failed_tests_before
        print(f"Patched Program {intermediate.name} Degree of Patchedness {round(dp, 2)}")
        num_failed_tests_model = self.get_num_failed_tests_model(patches)
        num_failed_test_patched = self.get_num_failed_tests_patched(patches)
        data = {
            "degree of patchedness": round(dp, 2),
            "number of failed tests - model": num_failed_tests_model,
            "number of failed tests - patched": num_failed_test_patched
        }
        self.record_results(intermediate, data)

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
        self.compile(intermediate)
        return intermediate

    def compile(self, program):
        chmod = f"chmod +x {program}/gradlew"
        cmd = f"{program}/gradlew build -p {program}"
        try:
            utils.run_cmd(chmod)
            build_output = utils.run_cmd(cmd)
            if "BUILD SUCCESSFUL" not in build_output and "Execution failed for task ':test'." not in build_output:
                print(program.name + " BUILD FAILED")
        except Exception as e:
            print(f"{program} - Error executing {e}")
        return program

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

    def get_num_failed_tests_before_patch(self, submission, method):
        with open(self.method_coverage_json, 'r') as file:
            data = json.load(file)
        return data[submission][method]["num"]

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

    def record_results(self, intermediate, data):
        with open(self.results_json, 'r') as f:
            d = json.load(f)
        model_data = d[self.model]
        model_data[intermediate.name] = data
        d[self.model] = model_data
        with open(self.results_json, 'w') as f:
            json.dump(d, f)

    def get_submissions(self, patch):
        submission = self.dataset_home / patch.name
        intermediate_path = self.intermediate.intermediates_path / patch.name
        if intermediate_path.exists():
            shutil.rmtree(intermediate_path)
        shutil.copytree(submission, intermediate_path)
        return intermediate_path

    def get_num_failed_tests_model(self, patch):
        submission = self.dataset_home / patch.name
        self.compile(submission)
        list_cmd = f"{submission}/gradlew listFailedTests -p {submission}"
        output = utils.run_cmd(list_cmd)
        pattern = r"^(.+::\w+)$"
        failed_tests = re.findall(pattern, output, re.MULTILINE)
        return len(failed_tests)

    def get_num_failed_tests_patched(self, patch):
        intermediate = self.intermediate.intermediates_path / patch.name
        self.compile(intermediate)
        list_cmd = f"{intermediate}/gradlew listFailedTests -p {intermediate}"
        output = utils.run_cmd(list_cmd)
        pattern = r"^(.+::\w+)$"
        failed_tests = re.findall(pattern, output, re.MULTILINE)
        return len(failed_tests)

    def get_number_failed_tests_method(self, patched_program, method):
        list_cmd = f"{patched_program}/gradlew listFailedTests -p {patched_program}"
        output = utils.run_cmd(list_cmd)
        pattern = r"^(.+::\w+)$"
        failed_tests = re.findall(pattern, output, re.MULTILINE)
        failed_tests = [t.replace("::", ".") for t in failed_tests]
        method_covering_tests = self.get_method_covering_tests(method)
        still_failed_tests = [el for el in failed_tests if el in method_covering_tests]
        return len(still_failed_tests)

    def get_missed_submissions(self):
        # path = Path("/Users/ruizhengu/Experiments/APR4Grade/cream")
        # submissions = []
        submissions = [1, 123, 131, 14, 148, 156, 164, 172, 180, 189, 197, 204, 212, 220, 232, 240, 251, 26, 268, 276,
                       284, 292, 33, 41, 5, 58, 66, 74, 82, 10, 124, 132, 140, 149, 157, 165, 173, 181, 19, 198, 205,
                       213, 221, 233, 241, 252, 260, 269, 277, 285, 293, 34, 42, 50, 59, 67, 75, 83, 101, 125, 133, 141,
                       15, 158, 166, 174, 182, 190, 199, 206, 214, 222, 234, 242, 253, 261, 27, 278, 286, 294, 35, 43,
                       51, 6, 68, 76, 84, 11, 126, 134, 142, 150, 159, 167, 175, 183, 191, 2, 207, 215, 223, 235, 243,
                       254, 262, 270, 279, 287, 295, 36, 44, 52, 60, 69, 77, 85, 111, 127, 135, 143, 151, 16, 168, 176,
                       184, 192, 20, 208, 216, 224, 236, 244, 255, 263, 271, 28, 288, 296, 37, 45, 53, 61, 7, 78, 86,
                       112, 128, 136, 144, 152, 160, 169, 177, 185, 193, 200, 209, 217, 225, 237, 245, 256, 264, 272,
                       280, 289, 3, 38, 46, 54, 62, 70, 79, 87, 12, 129, 137, 145, 153, 161, 17, 178, 186, 194, 201, 21,
                       218, 226, 238, 246, 257, 265, 273, 281, 29, 30, 39, 47, 55, 63, 71, 8, 9, 121, 13, 138, 146, 154,
                       162, 170, 179, 187, 195, 202, 210, 219, 23, 239, 247, 258, 266, 274, 282, 290, 31, 4, 48, 56, 64,
                       72, 80, 91, 122, 130, 139, 147, 155, 163, 171, 18, 188, 196, 203, 211, 22, 231, 24, 25, 259, 267,
                       275, 283, 291, 32, 40, 49, 57, 65, 73, 81, 92]
        # for submission in path.iterdir():
        #     if submission.is_dir():
        #         submissions.append(int(submission.name))
        for i in range(1, 297):
            if i not in submissions:
                print(i)


if __name__ == '__main__':
    a = Analysis()
    # a.launcher()
    a.individual_check()
    # a.get_results()
    # a.get_missed_submissions()
