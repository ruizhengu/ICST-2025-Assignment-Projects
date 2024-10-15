import json
from calendar import day_abbr
from operator import index
from pathlib import Path
import matplotlib.pyplot as plt
import numpy as np
import matplotlib.colors as mcolors
import pandas as pd

from numpy.lib.function_base import select
from numpy.ma.core import equal
from setuptools.command.rotate import rotate

from utils import *


class TestGen:
    def __init__(self):
        self.root = Path("/Users/ruizhengu/Projects")
        self.project_home = self.root / "NERO"
        # self.generated_tests_path = self.project_home / "resource/test_gen/evosuite_5"
        self.generated_tests_path = self.project_home / "resource/test_gen/LLM_qwen"
        self.generated_tests = list(self.generated_tests_path.rglob("*"))
        self.model_solution = Path("/Users/ruizhengu/Experiments/model_solution")
        self.dataset_home = Path("/Users/ruizhengu/Experiments/incorrect_submissions")
        self.submission_list = [submission for submission in self.dataset_home.iterdir() if
                                submission.is_dir() and submission.name != ".git"]
        self.method_file_json = self.project_home / "resource/method_files.json"
        self.method_of_interest_file_json = self.project_home / "resource/method_of_interest_test.json"
        # self.method_coverage_gen_json = self.project_home / "resource/method_coverage_evosuite_5.json"
        self.method_coverage_gen_json = self.project_home / "resource/method_coverage_llm.json"
        self.method_coverage_teacher_json = self.project_home / "resource/method_coverage.json"
        self.methods = self.get_model_methods()

    def replace_tests(self):
        for submission in self.submission_list:
            self.replace_build_gradle(submission)
            submission_test = submission / "src/test/java"
            empty_directory(submission_test)
            for generated_test in self.generated_tests_path.rglob("*"):
                target_path = submission_test / generated_test.relative_to(self.generated_tests_path)
                if generated_test.is_dir():
                    target_path.mkdir(parents=True, exist_ok=True)
                else:
                    target_path.parent.mkdir(parents=True, exist_ok=True)
                    shutil.copy2(generated_test, target_path)

    def replace_build_gradle(self, submission):
        model_gradle = self.model_solution / "build.gradle"
        submission_gradle = submission / "build.gradle"
        shutil.copy2(model_gradle, submission_gradle)

    def check_compilation(self):
        count = 0
        for submission in self.submission_list:
            chmod = f"chmod +x {submission}/gradlew"
            cmd = f"{submission}/gradlew clean build -p {submission}"
            try:
                run_cmd(chmod)
                build_output = run_cmd(cmd)
                if "BUILD SUCCESSFUL" not in build_output and "Execution failed for task ':test'." not in build_output:
                    print(f"{submission} - BUILD FAILED")
                elif "BUILD SUCCESSFUL" in build_output and "Execution failed for task ':test'." not in build_output:
                    shutil.rmtree(submission)
            except Exception as e:
                print(f"{submission} - Error executing {e}")
            count += 1
            print(f"process {count} / 296")

    def get_model_methods(self):
        with open(self.method_of_interest_file_json, "r") as f:
            data = json.load(f)
        return list(data.keys())

    def inject_aspectj(self, submission):
        model_solution = self.model_solution / "src/main/java/aspect"
        destination = submission / "src/main/java/aspect"
        if destination.exists():
            shutil.rmtree(destination)
        shutil.copytree(model_solution, destination)

    def get_method_coverage(self, test_method_calls):
        method_coverage = {}
        for method in self.methods:
            data = {}
            tests = []
            for test, method_calls in test_method_calls.items():
                for call in method_calls:
                    if method in call:
                        tests.append(test)
            data["tests"] = tests
            data["num"] = len(tests)
            method_coverage[method] = data
        return method_coverage

    def get_method_calls(self, submission, test):
        execution_log = submission / "method-executions.log"
        test_cmd = f"{submission}/gradlew -p {submission} test --tests {test}"
        run_cmd(test_cmd)
        with open(execution_log, "r") as f:
            calls = f.readlines()
        calls = set([line.replace("\n", "") for line in calls])
        return calls

    def failed_tests_method_coverage(self):
        submission_method_coverage = {}
        for submission in self.submission_list:
            self.inject_aspectj(submission)
            test_cmd = f"{submission}/gradlew build -p {submission}"
            run_cmd(test_cmd)
            list_cmd = f"{submission}/gradlew listFailedTests -p {submission}"
            output = run_cmd(list_cmd)
            pattern = r"^(.+::\w+)$"
            failed_tests = re.findall(pattern, output, re.MULTILINE)
            failed_tests = [t.replace("::", ".") for t in failed_tests]
            test_method_calls = {}
            for test in failed_tests:
                method_calls = self.get_method_calls(submission, test)
                test_method_calls[test] = method_calls
            method_coverage = self.get_method_coverage(test_method_calls)
            submission_method_coverage[submission.name] = method_coverage
            with open(self.method_coverage_gen_json, "w") as f:
                f.write(json.dumps(submission_method_coverage, indent=4))
            print(f"Get failed tests: {submission.name}")

    def get_buggy_method_gen(self, submission, data_source=None):
        buggy_methods = []
        if data_source is None:
            data_source = self.method_coverage_gen_json
        with open(data_source) as f:
            data = json.load(f)
        for method, coverage in data[submission].items():
            if coverage["num"] > 0:
                buggy_methods.append(method)
        return buggy_methods

    def get_buggy_method_teacher(self, submission):
        buggy_methods = []
        with open(self.method_coverage_teacher_json) as f:
            data = json.load(f)
        for method, coverage in data[submission].items():
            if coverage["num"] > 0:
                buggy_methods.append(method)
        return buggy_methods

    def buggy_methods_analysis(self):
        insufficient = 0
        complementary = 0
        complementary_teacher_better = 0
        complementary_gen_better = 0
        outperform = 0
        equivalent = 0
        for submission in range(1, 297):
            if not (self.dataset_home / str(submission)).exists():
                continue
            buggy_method_teacher = set(self.get_buggy_method_teacher(str(submission)))
            buggy_method_gen = set(self.get_buggy_method_gen(str(submission)))
            if buggy_method_gen.issubset(buggy_method_teacher) and buggy_method_gen != buggy_method_teacher:
                insufficient += 1
            elif buggy_method_teacher.issubset(buggy_method_gen) and buggy_method_gen != buggy_method_teacher:
                outperform += 1
            elif buggy_method_gen == buggy_method_teacher:
                equivalent += 1
            else:
                complementary += 1
                intersection = buggy_method_teacher & buggy_method_gen
                complementary_teacher_better += len(buggy_method_teacher - intersection)
                complementary_gen_better += len(buggy_method_gen - intersection)
        print(f"Generated tests - insufficient: {insufficient} / 296, {insufficient / 296}")
        print(f"Generated tests - equivalent: {equivalent} / 296, {equivalent / 296}")
        print(f"Generated tests - complementary: {complementary} / 296, {complementary / 296}")
        print(f"Generated tests - outperform: {outperform} / 296, {outperform / 296}")
        print(
            f"Generated tests - average complementary - teacher better: {round(complementary_teacher_better / 296, 2)}")
        print(
            f"Generated tests - average complementary - gen better: {round(complementary_gen_better / 296, 2)}")

        labels = np.array(["insufficient", "complementary", "equivalent", "outperform"])
        data = np.array([insufficient, complementary, equivalent, outperform])
        plt.bar(labels, data, width=0.2, color=mcolors.TABLEAU_COLORS)
        plt.show()

    def buggy_methods_results(self, data_source):
        insufficient = 0
        complementary = 0
        outperform = 0
        equivalent = 0
        for submission in range(1, 297):
            # if not (self.dataset_home / str(submission)).exists():
            #     continue
            buggy_method_teacher = set(self.get_buggy_method_teacher(str(submission)))
            try:
                buggy_method_gen = set(self.get_buggy_method_gen(str(submission), data_source))
            except KeyError:
                continue
            if buggy_method_gen.issubset(buggy_method_teacher) and buggy_method_gen != buggy_method_teacher:
                insufficient += 1
            elif buggy_method_teacher.issubset(buggy_method_gen) and buggy_method_gen != buggy_method_teacher:
                outperform += 1
            elif buggy_method_gen == buggy_method_teacher:
                equivalent += 1
            else:
                complementary += 1
        return [insufficient, complementary, equivalent, outperform]

    def buggy_methods_plot(self):
        json_es1 = self.project_home / "resource/method_coverage_evosuite_1.json"
        json_es2 = self.project_home / "resource/method_coverage_evosuite_2.json"
        json_es3 = self.project_home / "resource/method_coverage_evosuite_3.json"
        json_es4 = self.project_home / "resource/method_coverage_evosuite_4.json"
        json_es5 = self.project_home / "resource/method_coverage_evosuite_5.json"
        json_llm = self.project_home / "resource/method_coverage_llm.json"

        data_es1 = self.buggy_methods_results(json_es1)
        data_es2 = self.buggy_methods_results(json_es2)
        data_es3 = self.buggy_methods_results(json_es3)
        data_es4 = self.buggy_methods_results(json_es4)
        data_es5 = self.buggy_methods_results(json_es5)
        data_llm = self.buggy_methods_results(json_llm)

        data = pd.DataFrame({
            "insufficient": [data_es1[0], data_es2[0], data_es3[0], data_es4[0], data_es5[0], data_llm[0]],
            "complementary": [data_es1[1], data_es2[1], data_es3[1], data_es4[1], data_es5[1], data_llm[1]],
            "equivalent": [data_es1[2], data_es2[2], data_es3[2], data_es4[2], data_es5[2], data_llm[2]],
            "outperform": [data_es1[3], data_es2[3], data_es3[3], data_es4[3], data_es5[3], data_llm[3]]
        },
            index=["ES1", "ES2", "ES3", "ES4", "ES5", "LLM"])

        data.plot(kind="bar", figsize=(16, 6), rot=0, alpha=0.8)
        plt.ylabel("number of solutions", fontsize=14)
        plt.xticks(fontsize=18)
        plt.legend(fontsize=12)
        plt.tight_layout()
        plt.show()


if __name__ == '__main__':
    test_gen = TestGen()
    # test_gen.replace_tests()
    # test_gen.check_compilation()
    # test_gen.failed_tests_method_coverage()
    # test_gen.buggy_methods_analysis()
    test_gen.buggy_methods_plot()
