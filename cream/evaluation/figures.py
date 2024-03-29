import json
import re
from pathlib import Path

import matplotlib.pyplot as plt
from matplotlib_venn import venn2
from matplotlib_venn import venn3
from venny4py.venny4py import *
import numpy as np

from cream import utils


class Figures:
    def __init__(self):
        self.root = Path("/Users/ruizhengu/Projects")
        self.project_home = self.root / "APR4Grade"
        self.results_json = self.project_home / "resource/results.json"
        self.failed_tests_json = self.project_home / "resource/failed_tests.json"
        self.method_coverage_json = self.project_home / "resource/method_coverage.json"
        self.failed_tests_buggy_methods = self.project_home / "resource/failed_tests_buggy_methods.json"
        self.intermediates_path = self.root / "intermediates"
        self.dp_m = self.get_dp("m")
        self.dp_1 = self.get_dp("1")
        self.dp_2 = self.get_dp("2")
        self.dp_3 = []

    def box_plot_rq1(self):
        failed_tests_original = []
        failed_tests_buggy_methods = []
        with open(self.failed_tests_json, "r") as f:
            d = json.load(f)
        for submission, number in d.items():
            failed_tests_original.append(number)
        with open(self.failed_tests_buggy_methods, "r") as f:
            d = json.load(f)
        for submission, methods in d.items():
            for method, number in methods.items():
                failed_tests_buggy_methods.append(number)
        results = {
            "original programs": failed_tests_original,
            "intermediate programs": failed_tests_buggy_methods
        }
        plt.boxplot(results.values(), labels=results.keys())
        plt.ylabel("Number of failed tests")
        plt.show()

    def box_plot_rq2(self):
        results = {
            "TS": self.dp_m,
            "CS 1": self.dp_1,
            "CS 2": self.dp_2,
            "CS 3": self.dp_3,
        }
        plt.boxplot(results.values(), labels=results.keys())
        plt.ylabel("Degree of patchedness")
        plt.show()

    # def bar_chart_rq2(self):
    #     x = ["MS", "CS 1", "CS 2", "CS 3"]
    #     y = [16, 15, 0, 0]
    #     plt.bar(x, y)
    #     plt.show()

    def venn_diagram_rq2(self):
        set_m = self.results_get_submission("m")
        set_1 = self.results_get_submission("1")
        set_2 = self.results_get_submission("2")
        # set_3 = self.results_get_submission("3")
        # venn3(
        #     [set_m, set_1, set_2],
        #     ("Model solution", "Correct solution 1")
        # )
        # plt.show()

        sets = {
            'TS': set_m,
            'CS 1': set_1,
            'CS 2': set_2,
            # 'CS 3': set(list("Severus Snape"))
        }
        venny4py(sets=sets)
        plt.show()


    def box_plot_failed_tests_program(self):
        patched_programs = self.get_submission_patched()
        unpatched_programs = self.get_submission_unpatched()
        num_tests_patched = []
        num_tests_unpatched = []

        with open(self.failed_tests_json, 'r') as j:
            d = json.load(j)
        for submission, number in d.items():
            if submission in patched_programs:
                num_tests_patched.append(number)
            elif submission in unpatched_programs:
                num_tests_unpatched.append(number)
        results = {
            "with patches generated": num_tests_patched,
            "without patches generated": num_tests_unpatched
        }

        q3_patched = np.percentile(num_tests_patched, 75)
        q3_unpatched = np.percentile(num_tests_unpatched, 75)
        print(f"q3_patched: {q3_patched}")
        print(f"q3_unpatched: {q3_unpatched}")

        plt.boxplot(results.values(), labels=results.keys())
        plt.show()

    def box_plot_failed_tests_method(self):
        patched_programs = self.get_submission_patched()
        unpatched_programs = self.get_submission_unpatched()
        num_tests_patched = []
        num_tests_unpatched = []
        with open(self.method_coverage_json, 'r') as j:
            d = json.load(j)
        for submission, methods in d.items():
            if submission in patched_programs:
                for method, tests in methods.items():
                    if tests["num"] > 0:
                        num_tests_patched.append(tests["num"])
            elif submission in unpatched_programs:
                for method, tests in methods.items():
                    if tests["num"] > 0:
                        num_tests_unpatched.append(tests["num"])
        results = {
            "with patches generated": num_tests_patched,
            "without patches generated": num_tests_unpatched
        }
        plt.boxplot(results.values(), labels=results.keys())
        plt.show()

    def get_dp(self, model):
        with open(self.results_json, 'r') as j:
            d = json.load(j)[model]
        dps = []
        for submission, result in d.items():
            dps.append(result["degree of patchedness"])
        return dps

    def get_submission_patched(self):
        patched_programs = set()
        for model in ["m", "1", "2", "3"]:
            with open(self.results_json, 'r') as j:
                d = json.load(j)[model]
            for submission, result in d.items():
                patched_programs.add(submission)
        return list(patched_programs)

    def get_submission_unpatched(self):
        unpatched_programs = []
        patched_programs = self.get_submission_patched()
        for i in range(1, 297):
            if str(i) not in patched_programs:
                unpatched_programs.append(str(i))
        return unpatched_programs

    def results_get_submission(self, model):
        with open(self.results_json, 'r') as j:
            d = json.load(j)[model]
        submissions = set()
        for submission, result in d.items():
            submissions.add(submission)
        return submissions

    def get_num_failed_tests_buggy_methods(self):
        data = {}
        for i in range(1, 297):
            submissions = self.intermediates_path / str(i)
            method_data = {}
            for method in submissions.iterdir():
                if method.is_dir():
                    list_cmd = f"{method}/gradlew listFailedTests -p {method}"
                    output = utils.run_cmd(list_cmd)
                    pattern = r"^(.+::\w+)$"
                    failed_tests = re.findall(pattern, output, re.MULTILINE)
                    data[submissions.name] = {
                        "method": method.name,
                        "number of failed tests": len(failed_tests)
                    }
                    method_data[method.name] = len(failed_tests)

            data[submissions.name] = method_data

            with open(self.failed_tests_buggy_methods, 'w') as f:
                json.dump(data, f)


if __name__ == '__main__':
    f = Figures()
    # f.box_plot_failed_tests_program()
    f.venn_diagram_rq2()
    # f.box_plot_rq1()
    f.box_plot_rq2()
