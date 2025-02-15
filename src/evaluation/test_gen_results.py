import json
from pathlib import Path
import matplotlib.pyplot as plt
import statistics
import numpy as np
import matplotlib.colors as mcolors

from src.utils import *


class TestGen:
    def __init__(self):
        """
        Evosuite command: java -jar evosuite-1.2.0.jar -prefix uk.ac.sheffield.com1003.cafe -projectCP build/classes/java/main
        """
        self.root = Path("/Users/ruizhengu/Projects")
        self.project_home = self.root / "ICST-2025-Assignment-Projects"
        self.generated_tests_path = self.project_home / "resource/test_gen/evosuite_10"
        # self.generated_tests_path = self.project_home / "resource/test_gen/Edu_LLM"
        self.generated_tests = list(self.generated_tests_path.rglob("*"))
        self.model_solution = Path("/Users/ruizhengu/Experiments/model_solution")
        self.dataset_home = Path("/Users/ruizhengu/Experiments/incorrect_submissions")
        self.submission_list = [submission for submission in self.dataset_home.iterdir() if
                                submission.is_dir() and submission.name != ".git"]
        self.method_file_json = self.project_home / "resource/method_files.json"
        self.method_of_interest_file_json = self.project_home / "resource/method_of_interest_test.json"
        self.method_coverage_gen_json = self.project_home / "resource/method_coverage_evosuite_10.json"
        # self.method_coverage_gen_json = self.project_home / "resource/method_coverage_llm.json"
        # self.method_coverage_gen_json = self.project_home / "resource/method_coverage_edu_llm.json"
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
                # elif "BUILD SUCCESSFUL" in build_output and "Execution failed for task ':test'." not in build_output:
                #     shutil.rmtree(submission)
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
        count = 0
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
            # print(f"Get failed tests: {submission.name}")
            count += 1
            print(f"process {count} / 296")

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

    def buggy_methods_results(self, data_source):
        insufficient = 0
        complementary = 0
        outperform = 0
        equivalent = 0
        complementary_teacher_better = 0
        complementary_gen_better = 0
        for submission in range(1, 297):
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
                intersection = buggy_method_teacher & buggy_method_gen
                complementary_teacher_better += len(buggy_method_teacher - intersection)
                complementary_gen_better += len(buggy_method_gen - intersection)
        # print(f"{data_source.name} - # unique - educator: {complementary_teacher_better}")
        # print(f"{data_source.name} - # unique - gen: {complementary_gen_better}")
        return [insufficient, complementary, equivalent, outperform]

    def get_evosuite_results(self):
        es_json = [self.project_home / f"resource/method_coverage_evosuite_{i}.json" for i in range(1, 11)]

        return [self.buggy_methods_results(j) for j in es_json]

    def statistical_measure(self):
        data_es = self.get_evosuite_results()
        for data in data_es:
            print(data)
        data_es_stdev = [statistics.stdev(v) for v in zip(*data_es)]
        print(data_es_stdev)

    def buggy_methods_plot(self):
        json_llm = self.project_home / "resource/method_coverage_llm.json"
        # json_edu_llm = self.project_home / "resource/method_coverage_edu_llm.json"
        # json_edu_edu_llm = self.project_home / "resource/method_coverage_edu+edu_llm.json"

        data_es_avg = [sum(v) / len(v) for v in zip(*self.get_evosuite_results())]
        data_llm = self.buggy_methods_results(json_llm)
        # data_edu_llm = self.buggy_methods_results(json_edu_llm)
        # data_edu_edu_llm = self.buggy_methods_results(json_edu_edu_llm)

        data = pd.DataFrame({
            "nondetection": [0, 12],
            "insufficient": [data_es_avg[0], data_llm[0]],
            "complementary": [data_es_avg[1], data_llm[1]],
            "equivalent": [data_es_avg[2], data_llm[2]],
            "outperform": [data_es_avg[3], data_llm[3]]
        }, index=["$EvoSuite$", "$LLM$"])

        ax = data.plot(kind="bar", figsize=(8, 3.5), rot=0, alpha=0.7, width=0.7)
        y_max = max(data.max()) * 1.1
        ax.set_ylim(1, y_max)

        plt.ylabel("number of submissions", fontsize=15)
        plt.xlim(-0.3, 1.6)
        plt.xticks(fontsize=15)
        plt.yticks(fontsize=13)
        plt.legend(fontsize=13)
        for p in ax.patches:
            ax.annotate(f'{int(p.get_height())}',
                        (p.get_x() + p.get_width() / 2., p.get_height()),
                        ha='center', va='center', xytext=(0, 9),
                        textcoords='offset points', fontsize=12)
        plt.tight_layout()
        plt.show()


if __name__ == '__main__':
    test_gen = TestGen()
    # test_gen.replace_tests()
    # test_gen.check_compilation()
    # test_gen.failed_tests_method_coverage()
    test_gen.buggy_methods_plot()
    # test_gen.statistical_measure()
