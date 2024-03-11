import json
import os
import random
import re
from pathlib import Path


class PartialRepairCafeArja:
    def __init__(self):
        self.home_path = Path("/Users/ruizhengu/Projects/APR-as-AAT")
        self.model_solution = self.home_path / "resource/cafe_java_8"
        self.method_file_json = self.home_path / "repair-generation/lib/method_files.json"
        self.method_coverage_json = self.home_path / "repair-generation/lib/method_coverage.json"
        self.method_ranking_policy = "ASCENT"
        self.method_ranking_policy = "DESCENT"
        # self.method_ranking_policy = "RANDOM"
        self.patch_dir = "/Users/ruizhengu/Experiments/APR-as-AAT/arja_intro/median"

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
        patches = self.get_patches(submission)
        print(patches)

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


def yield_test():
    li = [1, 2, 3, 4, 5]
    for i in range(3):
        print(li)
        yield li.pop()


if __name__ == '__main__':
    # method = "App.main"
    # submission = Path("/Users/ruizhengu/Experiments/APR-as-AAT/cafe_java_8")

    p = PartialRepairCafeArja()
    # content = p.get_model_method_content(method)
    # p.replace_method(submission, method, content)
    submission = "135"
    p.apply_patch(submission)
