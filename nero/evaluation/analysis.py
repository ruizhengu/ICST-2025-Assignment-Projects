import json
import re
import shutil
from pathlib import Path

import utils
from incremental_repair.intermediate import Intermediate


class Analysis:
    def __init__(self):
        self.root = Path("/Users/Projects")
        self.project_home = self.root / "APR4Grade"
        self.method_weighting_json = self.project_home / "resource/method_weighting.json"
        self.method_coverage_json = self.project_home / "resource/method_coverage.json"
        self._main_path = Path("main/java/cafe")
        self.model = "3"
        self.model_solution = {
            "m": self.root / "IntermediateJava/model_solution",
            "1": self.root / "IntermediateJava/correct_submissions/1",
            "2": self.root / "IntermediateJava/correct_submissions/2",
            "3": self.root / "IntermediateJava/correct_submissions/3",
        }
        self.patches_path = Path(f"/Users/Experiments/APR4Grade/patches_{self.model}")
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
                    count_patches += 1
                    intermediate_path = self.get_submissions(patches)
                    intermediate = self.apply_patch(intermediate_path, valid_patches[0])
                    self.degree_of_patchedness(intermediate, patches, buggy_methods)
                elif len(valid_patches) > 1:
                    count_patches += 1
                    try:
                        intermediate_path = self.get_submissions(patches)
                        intermediate = self.apply_patch_replace_methods(intermediate_path, valid_patches)
                        self.degree_of_patchedness(intermediate, patches, buggy_methods)
                    except FileNotFoundError:
                        print(f"Submission {patches.name} has multiple patches, manually apply them to avoid conflict.")
                        for patch in valid_patches:
                            print(patch)
                else:
                    shutil.rmtree(patches)
        print(count_patches)

    def individual_check(self):
        dp = 0
        patches = Path("/Users/Experiments/APR4Grade/patches_3/157")
        intermediate = Path("/Users/Projects/intermediates/157")
        buggy_methods = [method for method in patches.iterdir() if method.is_dir()]
        unnormalised_weights = self.get_unnormalised_weights(buggy_methods)
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

    def apply_patch_replace_methods(self, intermediate, patches):
        for patch in patches:
            method_name = str(patch).split("/")[-2]
            method_file = self.intermediate.get_method_path(method_name)
            file_path = intermediate / method_file
            method_content = self.get_method_content(patch)
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
            new_code = code[:start_index] + method_content + code[i:]
            with open(file_path, "w") as file:
                file.write(new_code)
        self.compile(intermediate)
        return intermediate

    def get_method_content(self, patch):
        method_name = str(patch).split("/")[-2]
        method_file = self.intermediate.get_method_path(method_name).replace("src", "patched")
        file_path = patch / method_file
        with open(file_path, "r") as file:
            code = file.read()
        pattern = re.compile(
            rf'(public|protected|private|static|\s) +[\w<>\[\]]+\s+{re.escape(method_name.split(".")[1])}\s*\([^\)]*\)\s*(throws\s+[\w,\s]+)?\s*\{{',
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
                if "System.exit(0);" not in d and "Solution" not in d:
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


if __name__ == '__main__':
    a = Analysis()
    # a.calculate_weights()
    # a.launcher()
    # a.individual_check()
    a.get_results()
