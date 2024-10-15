import json
import re
from distutils.core import setup_keywords
from nis import match
from pathlib import Path
from turtledemo.nim import NimModel

import ollama
from numpy.lib.function_base import select
from pooch import retrieve

import utils


class LLMRepair:
    def __init__(self):
        self.root = Path("/Users/ruizhengu/Projects")
        self.project_home = self.root / "NERO"
        self.dataset = Path("/Users/ruizhengu/Experiments/intermediates_llm")
        self.model_solution = Path(
            "/Users/ruizhengu/Experiments/model_solution")  # model solution error logging set to full
        self.method_file_json = self.project_home / "resource/method_files.json"
        self.method_coverage_json = self.project_home / "resource/method_coverage.json"

    def repair_results(self, prompt):
        response = ollama.generate(
            model="qwen2.5-coder:7b-instruct",
            prompt=prompt
        )
        return response["response"]

    def get_class_content(self, solution, method_path):
        with open(solution / method_path, "r") as f:
            class_content = f.read()
        method_name = solution.name.split(".")[1]

        pattern = re.compile(
            rf'(public|protected|private|static|\s)+[\w<>\[\]]+\s+{re.escape(method_name)}\s*\([^\)]*\)\s*(throws\s+[\w,\s]+)?\s*',
            re.DOTALL
        )
        match = pattern.search(class_content)
        signature = ""
        if match:
            signature = match.group().strip()
        return class_content, signature

    def get_model_method(self, solution, method_path):
        file_path = self.model_solution / method_path
        method_name = solution.name.split(".")[1]

        with open(file_path, "r") as file:
            code = file.read()
        pattern = re.compile(
            rf'(public|protected|private|static|\s) +[\w<>\[\]]+\s+{re.escape(method_name)}\s*\([^\)]*\)\s*(throws\s+[\w,\s]+)?\s*\{{',
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
            return None

    def get_test_content(self, test):
        test_class = test.split(".")[-2]
        test_method = test.split(".")[-1]
        test_path = self.model_solution / "src/test/java/uk/ac/sheffield/com1003/cafe" / f"{test_class}.java"
        with open(test_path, "r") as file:
            code = file.read()
        pattern = re.compile(
            rf'(public|protected|private|static|\s) +[\w<>\[\]]+\s+{re.escape(test_method)}\s*\([^\)]*\)\s*(throws\s+[\w,\s]+)?\s*\{{',
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
            return None

    def get_failing_tests(self, intermediate):
        failing_tests_error_message = {}
        with open(self.method_coverage_json) as f:
            data = json.load(f)
        failing_tests = data[intermediate.parent.name][intermediate.name]["tests"]
        for test in failing_tests:
            error_message = self.get_error_message(intermediate, test)
            test_content = self.get_test_content(test)
            failing_tests_error_message[test] = {
                "test": test_content,
                "error": error_message
            }
        return failing_tests_error_message

    def get_error_message(self, intermediate, test):
        failed_message = None
        cmd = f"{intermediate}/gradlew test --tests {test} -p {intermediate}"
        test_output = utils.run_cmd(cmd)

        lines = test_output.splitlines()
        for i, line in enumerate(lines):
            if "FAILED" in line:
                failed_message = f"{line}\n{lines[i + 1].strip()}"
                break

        return failed_message

    def generate_prompt(self, intermediate):
        method_path = self.get_method_path(intermediate.name)
        class_content, method_signature = self.get_class_content(intermediate, method_path)
        failing_test_error_message = self.get_failing_tests(intermediate)
        model_method = self.get_model_method(intermediate, method_path)

        prompt = "You are an automatic program repair tool. Your task is to fix a buggy method with in its class.\n"
        prompt += "The following class is where the buggy method within:\n"
        prompt += f"```{class_content}```\n"
        prompt += f"The buggy method is `{method_signature}`.\n"
        prompt += "The method fails the following tests:\n"
        for failing_test in failing_test_error_message:
            prompt += f"```{failing_test_error_message[failing_test]['test']}\n# error message:\n{failing_test_error_message[failing_test]['error']}\n```"
        prompt += "This is the reference solution of the buggy method, do not directly use this as the answer.\n"
        prompt += f"```{model_method}```\n"
        prompt += "Please provide a fixed version of the buggy method, do not use the reference solution, make the minimal edits to the original buggy method\n"
        prompt += "Return only the fixed buggy method, within a code block."

        prompt_txt = intermediate / "prompt.txt"
        with open(prompt_txt, "w") as f:
            f.write(prompt)
        return prompt_txt

    def get_method_path(self, method_name):
        with open(self.method_file_json) as f:
            d = json.load(f)
        return d[method_name]

    def repair(self, submission):
        intermediate_submission = self.dataset / submission
        for intermediate in intermediate_submission.iterdir():
            if intermediate.is_dir():
                prompt_txt = self.generate_prompt(intermediate)
                with open(prompt_txt, "r") as f:
                    prompt = f.read()
                for i in range(5):
                    llm_response = self.repair_results(prompt)
                    response_file = intermediate / f"llm_repair_{i + 1}.txt"
                    with open(response_file, "w") as f:
                        f.write(llm_response)

    def count_repairs(self):
        purged_count = 0
        fixed_submissions = 0
        fixed_bugs = 0
        purged_path = Path("/Users/ruizhengu/Experiments/patches_1")
        purged_submissions = (_ for _ in purged_path.iterdir() if _.is_dir())
        for submission in purged_submissions:
            fully_patched = True
            fix_tmps = (_ for _ in submission.iterdir() if _.is_dir())
            for tmp in fix_tmps:
                purged_count += 1
                # check if there is any patch within the buggy method
                if not any(tmp.iterdir()):
                    fully_patched = False
                # count how many methods have a patch
                else:
                    fixed_bugs += 1
            if fully_patched:
                fixed_submissions += 1
        print(f"number of purged solutions: {purged_count}")
        print(f"number of fully fixed submissions: {fixed_submissions}")
        print(f"number of fixed buggy methods: {fixed_bugs}")

    def get_llm_responses(self, intermediate):
        responses = []

        for i in range(5):
            response_file = intermediate / f"llm_repair_{i + 1}.txt"
            with open(response_file, "r") as f:
                response = f.read()
            pattern = r'```(?:java)?\s+(.*?)```'
            match = re.search(pattern, response, re.DOTALL)

            if match:
                content = match.group(1)
                responses.append(content)
            else:
                responses.append(None)
        return responses

    def replace_method(self, solution, method_name, content):
        file_path = solution / self.get_method_path(method_name)
        with open(file_path, "r") as f:
            code = f.read()
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


    def get_test_result(self, solution):
        # make sure set solution gradle.build file ignoreFailures = false
        chmod = f"chmod +x {solution}/gradlew"
        cmd = f"{solution}/gradlew clean build -p {solution}"
        utils.run_cmd(chmod)
        build_output = utils.run_cmd(cmd)
        if "BUILD SUCCESSFUL" not in build_output and "Execution failed for task ':test'." not in build_output:
            print(f"{solution} - BUILD FAILED")
            return "BUILD FAILED"
        elif "BUILD SUCCESSFUL" not in build_output and "Execution failed for task ':test'." in build_output:
            return "TEST FAILED"
        # elif "BUILD SUCCESSFUL" in build_output and "Execution failed for task ':test'." not in build_output:
        #     return "TEST SUCCESS"
        else:
            return "TEST SUCCESS"
            # return "UNKNOWN"

    def analysis(self):
        purged_count = 0
        fixed_submissions = 0
        fixed_bugs = 0
        for i in range(1, 2):
            intermediate_submission = self.dataset / str(i)
            intermediate_submission = (_ for _ in intermediate_submission.iterdir() if _.is_dir())
            for intermediate in intermediate_submission:
                fully_patched = True
                purged_count += 1
                responses = self.get_llm_responses(intermediate)
                for response in responses:
                    self.replace_method(intermediate, intermediate.name, response)
                    test_result = self.get_test_result(intermediate)
                    if test_result == "TEST SUCCESS":
                        fixed_bugs += 1
                        break
                else:
                    fully_patched = False
                if fully_patched:
                    fixed_submissions += 1
                print(f"progress - {i} / 296")
        print(f"number of purged solutions: {purged_count}")
        print(f"number of fully fixed submissions: {fixed_submissions}")
        print(f"number of fixed buggy methods: {fixed_bugs}")


    def launcher(self):
        for i in range(1, 2):
            self.repair(str(i))


if __name__ == '__main__':
    l = LLMRepair()
    # l.count_repairs()
    # l.launcher()
    l.analysis()
