import json
import os
import random
import re
import sys
from pathlib import Path


class PartialRepair:
    def __init__(self, start, end):
        self.root = Path("/Users/ruizhengu/Projects")
        # self.root = Path("/mnt/parscratch/users/acp22rg/APR")
        self.project_home = self.root / "APR4Grade"
        self.dataset_home = self.root / "IntermediateJava/incorrect_submissions"
        self.model_solution = self.root / "IntermediateJava/model_solution"
        self.model_test_suite = self.model_solution / "src/test/java/uk/ac/sheffield/com1003/cafe"
        self.method_file_json = self.project_home / "resource/method_files.json"
        self.method_coverage_json = self.project_home / "resource/method_coverage.json"
        self.method_ranking_policy = "ASCENT"
        # self.method_ranking_policy = "DESCENT"
        # self.method_ranking_policy = "RANDOM"
        self.patch_dir = "/Users/ruizhengu/Experiments/APR-as-AAT/arja_intro/median"
        self.start_index = start
        self.end_index = end

    def repair(self):
        for i in range(self.start_index, self.end_index + 1):
            submission = self.dataset_home / str(i)
            print(submission)

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
        end_index = match.end() - 1
        brace_count = 1
        i = end_index + 1
        while i < len(code) and brace_count > 0:
            if code[i] == '{':
                brace_count += 1
            elif code[i] == '}':
                brace_count -= 1
            i += 1
        new_code = code[:start_index] + code[start_index:end_index] + content + code[i:]
        with open(file_path, "w") as file:
            file.write(new_code)
        print(f"Method {method_name} in {file_path} replaced successfully.")

    def get_model_method_content(self, method_name):
        method_file = Path(self.get_method_path(method_name))
        file_path = self.model_solution / method_file
        with open(file_path, "r") as file:
            code = file.read()
        pattern = re.compile(
            rf'(public|protected|private|static|\s) +[\w<>\[\]]+\s+{re.escape(method_name.split(".")[1])}\s*\([^\)]*\)\s*(throws\s+[\w,\s]+)?\s*\{{',
            re.DOTALL)
        match = pattern.search(code)
        if match:
            start_index = match.end() - 1
            brace_count = 1
            i = start_index + 1
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

    def get_method_path(self, method_name):
        with open(self.method_file_json) as f:
            d = json.load(f)
        return d[method_name]

    def get_patches(self, submission):
        with open("/Users/ruizhengu/Experiments/APR-as-AAT/arja_intro/median/median_1/Patch_465.txt") as f:
            text = f.read()
        patterns = {
            "Replace": re.compile(r"Replace (.*?) (\d+)\s+Faulty:\s+(.*?)\s+Seed:\s+(.*?)\s+\*+", re.DOTALL),
            "Delete": re.compile(r"Delete (.*?) (\d+)\s+Faulty:\s+(.*?)\s+Seed:\s+(.*?)\s+\*+", re.DOTALL),
            "InsertBefore": re.compile(r"InsertBefore (.*?) (\d+)\s+Faulty:\s+(.*?)\s+Seed:\s+(.*?)\s+\*+", re.DOTALL),
        }
        patches = []
        for action, pattern in patterns.items():
            matches = pattern.findall(text)
            for match in matches:
                file_path, line_number, faulty, seed = match
                patch = {
                    "action": action,
                    "file_path": file_path,
                    "line_number": line_number,
                    "faulty_line": faulty.strip(),
                    "seed_line": seed.strip()
                }
                patches.append(patch)
        return patches

    def apply_patch(self, submission):
        submission = "median_1"

        # TODO create a copy of the program under patch

        path = Path("/Users/ruizhengu/Experiments/APR-as-AAT/arja_intro_patches/median_1")

        patches = self.get_patches(submission)
        for patch in patches:
            # print(patch["file_path"].split(f"{submission}/"))
            path_suffix = patch["file_path"].split(f"{submission}/")[-1]
            patch_path = path / path_suffix
            print(patch)
            if patch["action"] == "Replace":
                # self.replace_statement(patch_path, patch)
                pass
            elif patch["action"] == "Delete":
                # self.delete_statement(patch_path, patch)
                pass
            elif patch["action"] == "InsertBefore":
                self.insert_statement_before(patch_path, patch)
            else:
                raise Exception("Unexpected Patch Action!")

    def replace_statement(self, patch_path, patch):
        with open(patch_path, "r") as f:
            lines = f.readlines()
        line_index = int(patch["line_number"]) - 1
        if lines[line_index].strip().replace(" ", "") == patch["faulty_line"].replace(" ", ""):
            lines[line_index] = patch["seed_line"] + "\n"
        else:
            raise Exception("Patch line number doesn't match with faulty code!")
        with open(patch_path, "w") as f:
            f.writelines(lines)

    def delete_statement(self, patch_path, patch):
        with open(patch_path, "r") as f:
            lines = f.readlines()
        line_index = int(patch["line_number"]) - 1
        if lines[line_index].strip().replace(" ", "") == patch["faulty_line"].replace(" ", ""):
            lines.pop(line_index)
        else:
            raise Exception("Patch line number doesn't match with faulty code!")
        with open(patch_path, "w") as f:
            f.writelines(lines)

    def insert_statement_before(self, patch_path, patch):
        with open(patch_path, "r") as f:
            lines = f.readlines()
        line_index = int(patch["line_number"]) - 1
        print(lines[line_index].strip().replace(" ", ""))
        if lines[line_index].strip().replace(" ", "") == patch["faulty_line"].replace(" ", ""):
            lines.insert(line_index, patch["seed_line"] + "\n")
        else:
            raise Exception("Patch line number doesn't match with faulty code!")
        with open(patch_path, "w") as f:
            f.writelines(lines)

    def method_ranking(self, submission):
        with open(self.method_coverage_json) as f:
            d = json.load(f)
        coverage = d[submission]
        methods_with_coverage = [(method, detail["num"]) for method, detail in coverage.items() if detail["num"] > 0]
        if self.method_ranking_policy == "ASCENT":
            # sort from high to low
            sorted_methods = sorted(methods_with_coverage, key=lambda x: x[1], reverse=True)
            for method in sorted_methods:
                yield method[0]
        elif self.method_ranking_policy == "DESCENT":
            # sort from low to high
            sorted_methods = sorted(methods_with_coverage, key=lambda x: x[1], reverse=False)
            for method in sorted_methods:
                yield method[0]
        elif self.method_ranking_policy == "RANDOM":
            # get a random element
            for i in range(len(methods_with_coverage)):
                random_index = random.randint(0, len(methods_with_coverage) - 1)
                random_element = methods_with_coverage.pop(random_index)
                yield random_element[0]

    def patch_selection(self):
        patches = Path("/Users/ruizhengu/Downloads/patches_ctxr")
        patches_filtered = []
        for patch in patches.iterdir():
            if patch.is_dir():
                diff = patch / "diff"
                with open(diff, "r") as f:
                    d = f.read()
            if "System.exit(0);" not in d:
                print(patch)
                patches_filtered.append(patch)
        # Output the patch with minimal lines
        min_lines = None
        min_file = None
        for patch in patches_filtered:
            diff = patch / "diff"
            with open(diff, "r") as f:
                lines = f.readlines()
                number_of_lines = len(lines)
                if min_lines is None or number_of_lines < min_lines:
                    min_lines = number_of_lines
                    min_file = patch.name
        print(min_file)


if __name__ == '__main__':
    # start_index = int(sys.argv[1])
    # end_index = int(sys.argv[2])

    start_index = 1
    end_index = 1
    p = PartialRepair(start_index, end_index)

    # content = p.get_model_method_content(method)
    # p.replace_method(submission, method, content)
    # p.apply_patch(submission)
    p.patch_selection()
    # p.repair()
