import json
import os
import re
from pathlib import Path


class PartialRepairCafeArja:
    def __init__(self):
        self.model_solution = Path("/Users/ruizhengu/Projects/APR-as-AAT/resource/cafe_java_8")
        self.method_file_json = Path("/Users/ruizhengu/Projects/APR-as-AAT/repair-generation/lib/method_files.json")

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

    def get_patch(self):
        pass

    def method_ranking(self):
        # failed test number high to low
        # failed test number low to high
        # random
        pass


if __name__ == '__main__':
    method = "App.main"
    submission = Path("/Users/ruizhengu/Experiments/APR-as-AAT/cafe_java_8")

    p = PartialRepairCafeArja()
    content = p.get_model_method_content(method)
    p.replace_method(submission, method, content)
