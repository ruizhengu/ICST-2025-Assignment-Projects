import json
import logging
import os
import re
import shutil
from pathlib import Path

from cream import utils


class Intermediate:
    def __init__(self, root):
        self.root = root
        self.project_home = self.root / "APR4Grade"
        self.dataset_home = self.root / "IntermediateJava/incorrect_submissions"
        self.method_file_json = self.project_home / "resource/method_files.json"
        self.model_solution = self.root / "IntermediateJava/model_solution"
        self.method_coverage_json = self.project_home / "resource/method_coverage.json"
        self.intermediates_path = Path("/Users/ruizhengu/Experiments/APR4Grade/intermediates")
        self.intermediate_failed_tests = self.project_home / "resource/intermediate_failed_tests.json"
        self.arja_home = self.root / "arja"
        self.dependency = self.root / "IntermediateJava/dependency"
        self.arja_output = self.logging_init()

    def logging_init(self):
        arja_output = self.project_home / "patches"
        if not arja_output.exists():
            os.mkdir(arja_output)
        arja_output = arja_output / f"cream"
        if not arja_output.exists():
            os.mkdir(arja_output)
        arja_log = arja_output / "arja.log"
        # if arja_log.exists():
        #     arja_log.unlink()
        logging.basicConfig(filename=arja_log, level=logging.INFO)
        return arja_output

    def get_method_path(self, method_name):
        with open(self.method_file_json) as f:
            d = json.load(f)
        return d[method_name]

    def update_intermediate(self, submission, methods_to_replace):
        for method in methods_to_replace:
            method_content = self.get_model_method_content(method)
            self.replace_method(submission, method, method_content)

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

    def get_buggy_methods(self, submission):
        buggy_methods = []
        with open(self.method_coverage_json) as f:
            data = json.load(f)
        for method, coverage in data[submission].items():
            if coverage["num"] > 0:
                buggy_methods.append(method)
        return buggy_methods

    def check_compilation(self, submission):
        intermediate_submission = self.intermediates_path / submission
        for intermediate in intermediate_submission.iterdir():
            chmod = f"chmod +x {intermediate}/gradlew"
            cmd = f"{intermediate}/gradlew clean build -p {intermediate}"
            try:
                utils.run_cmd(chmod)
                build_output = utils.run_cmd(cmd)
                if "BUILD SUCCESSFUL" not in build_output and "Execution failed for task ':test'." not in build_output:
                    print(f"{submission} - {intermediate.name} BUILD FAILED")
            except Exception as e:
                print(f"{submission} - {intermediate.name} - Error executing {e}")

    def copy_submission(self, submission, intermediate):
        original_submission = self.dataset_home / submission
        if intermediate.exists():
            shutil.rmtree(intermediate)
        shutil.copytree(original_submission, intermediate)

    def create_intermediates(self, submission):
        intermediate_submission = self.intermediates_path / submission
        if not intermediate_submission.exists():
            os.mkdir(intermediate_submission)
        buggy_methods = self.get_buggy_methods(submission)
        for method in buggy_methods:
            intermediate_method = intermediate_submission / method
            self.copy_submission(submission, intermediate_method)
            methods_to_replace = list(filter(lambda x: x != method, buggy_methods))
            self.update_intermediate(intermediate_method, methods_to_replace)

    def get_number_failed_tests(self, submission):
        intermediate_submission = self.intermediates_path / submission
        for intermediate in intermediate_submission.iterdir():
            if intermediate.is_dir():
                list_cmd = f"{intermediate}/gradlew listFailedTests -p {intermediate}"
                output = utils.run_cmd(list_cmd)
                pattern = r"^(.+::\w+)$"
                failed_tests = re.findall(pattern, output, re.MULTILINE)
                with open(self.intermediate_failed_tests, 'r') as f:
                    d = json.load(f)
                intermediate_method = intermediate.name.split("_")[-1]
                if not str(submission) in d:
                    d[str(submission)] = {}
                submission_data = d[str(submission)]
                submission_data[intermediate_method] = len(failed_tests)
                d[str(submission)] = submission_data
                with open(self.intermediate_failed_tests, 'w') as f:
                    json.dump(d, f)

    def repair(self, start_index, end_index):
        for i in range(start_index, end_index + 1):
            # submission = self.dataset_home / str(i)
            intermediate = self.intermediates_path / str(i)
            for intermediate_method in intermediate.iterdir():
                if intermediate.is_dir():
                    arja_output = self.arja(intermediate, intermediate_method.name)
                    patch = self.patch_selection(arja_output)
                    if patch is not None:
                        logging.info(f"Repair {str(i)} - Method {intermediate_method.name} > Patch generated.")
                    else:
                        logging.info(f"Repair {str(i)} - Method {intermediate_method.name} > No Patch generated.")

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

    def arja(self, submission, method):
        path_src = submission / "src"
        path_bin_src = submission / "build/classes/java/main"
        path_bin_test = submission / "build/classes/java/test"
        dependencies = [str(file) for file in self.dependency.glob('**/*.jar') if file.name != ".DS_Store"]
        dependencies = ":".join(dependencies)
        arja_output = self.arja_output / submission.name
        if not arja_output.exists():
            os.mkdir(arja_output)
        arja_output = self.arja_output / submission.name / method
        if not arja_output.exists():
            os.mkdir(arja_output)
        # Set 10 minutes time limit per execution
        arja_cmd = f"cd {self.arja_home} && java -cp \"lib/*:bin\" us.msu.cse.repair.Main ArjaE -DsrcJavaDir {path_src} -DbinJavaDir {path_bin_src} -DbinTestDir {path_bin_test} -Ddependences {dependencies} -DpatchOutputRoot {arja_output} -DmaxTime 10 -DingredientMode Application -DdiffFormat true"
        arja_results = utils.run_cmd(arja_cmd)
        return arja_output

    def launcher(self):
        for i in range(1, 297):
            self.create_intermediates(str(i))


if __name__ == '__main__':
    root = Path("/Users/ruizhengu/Projects")
    im = Intermediate(root)
    im.launcher()
