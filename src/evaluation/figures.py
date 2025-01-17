import json
import random
from pathlib import Path

import statistics

import matplotlib.pyplot as plt
from venny4py.venny4py import *
import numpy as np


class Figures:
    def __init__(self):
        self.root = Path("/Users/ruizhengu/Projects")
        self.project_home = self.root / "ICST-2025-Assignment-Projects"
        self.results_json = self.project_home / "resource/results.json"
        self.failed_tests_json = self.project_home / "resource/failed_tests.json"
        self.method_coverage_json = self.project_home / "resource/method_coverage.json"
        # self.failed_tests_buggy_methods = self.project_home / "resource/failed_tests_buggy_methods.json"
        self.intermediates_path = self.root / "intermediates"
        self.dp_m = self.get_dp("m")
        self.dp_1 = self.get_dp("1")
        self.dp_2 = self.get_dp("2")
        self.dp_3 = self.get_dp("3")

    def box_plot_rq2(self):
        results = {
            "TS": self.dp_m,
            "CS1": self.dp_1,
            "CS2": self.dp_2,
            "CS3": self.dp_3,
        }
        print(f"TS: {statistics.mean(self.dp_m)}, {statistics.median(self.dp_m)}")
        print(f"CS1: {statistics.mean(self.dp_1)}, {statistics.median(self.dp_1)}")
        print(f"CS2: {statistics.mean(self.dp_2)}, {statistics.median(self.dp_2)}")
        print(f"CS3: {statistics.mean(self.dp_3)}, {statistics.median(self.dp_3)}")
        plt.boxplot(results.values(), labels=results.keys())
        plt.ylabel("Degree of patchedness")
        plt.show()

    def venn_diagram_rq2(self):
        set_m = self.results_get_submission("m")
        set_1 = self.results_get_submission("1")
        set_2 = self.results_get_submission("2")
        set_3 = self.results_get_submission("3")
        sets = {
            'TS': set_m,
            'CS1': set_1,
            'CS2': set_2,
            'CS3': set_3
        }
        venny4py(sets=sets)
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

    def get_below_threshold_unpatched(self):
        unpatched_programs = self.get_submission_unpatched()
        unpatched_below_threshold = []

        with open(self.failed_tests_json, 'r') as j:
            d = json.load(j)
        for submission, number in d.items():
            if submission in unpatched_programs and number < 18:
                unpatched_below_threshold.append(submission)
        print(f"Unpatched programs below threshold: {unpatched_below_threshold}", len(unpatched_below_threshold))
        random_samples = random.sample(unpatched_below_threshold, 10)
        print(f"Random samples: {random_samples}")

    def histogram_rq3_buggy_methods(self):
        patched_programs = self.get_submission_patched()
        unpatched_programs = self.get_submission_unpatched()
        num_methods_patched = []
        num_methods_unpatched = []

        with open(self.method_coverage_json, 'r') as j:
            d = json.load(j)
        for submission, methods in d.items():
            if submission in patched_programs:
                count_buggy_methods = 0
                for method, tests in methods.items():
                    if tests["num"] > 0:
                        count_buggy_methods += 1
                num_methods_patched.append(count_buggy_methods)
            elif submission in unpatched_programs:
                count_buggy_methods = 0
                for method, tests in methods.items():
                    if tests["num"] > 0:
                        count_buggy_methods += 1
                num_methods_unpatched.append(count_buggy_methods)

        print(f"Max num of buggy methods - patched {max(num_methods_patched)}, unpatched {max(num_methods_unpatched)}")
        print(f"Min num of buggy methods - patched {min(num_methods_patched)}, unpatched {min(num_methods_unpatched)}")

        plt.figure(figsize=(8, 3.5))
        plt.hist(num_methods_patched, bins=20, alpha=0.7, label='Repaired Submissions', color='blue')
        plt.hist(num_methods_unpatched, bins=20, alpha=0.7, label='Unrepaired Submissions', color='orange')

        plt.yscale("log")
        plt.ylabel('number of submissions', fontsize=16)
        plt.legend(fontsize=13)
        plt.tight_layout()
        plt.show()

    def histogram_rq3_num_failed_tests(self):
        patched_programs = self.get_submission_patched()
        unpatched_programs = self.get_submission_unpatched()
        num_tests_patched = []
        num_tests_unpatched = []

        with open(self.failed_tests_json, 'r') as j:
            d = json.load(j)
        for submission, number in d.items():
            if submission in patched_programs:
                num_tests_patched.append(number / 2)
            elif submission in unpatched_programs:
                num_tests_unpatched.append(number / 2)

        q3_patched = np.percentile(num_tests_patched, 75)
        q3_unpatched = np.percentile(num_tests_unpatched, 75)
        print(f"q3_patched: {q3_patched}")
        print(f"q3_unpatched: {q3_unpatched}")

        print(f"patched solutions - failed test: [{min(num_tests_patched)}, {max(num_tests_patched)}]")
        print(f"unpatched solutions - failed test: [{min(num_tests_unpatched)}, {max(num_tests_unpatched)}]")

        print(f"patched solutions - average: {statistics.mean(num_tests_patched)}")
        print(f"patched solutions - test failure rate: {statistics.mean(num_tests_patched) / 60}")
        print(f"unpatched solutions - average: {statistics.mean(num_tests_unpatched)}")
        print(f"unpatched solutions - test failure rate: {statistics.mean(num_tests_unpatched) / 60}")

        plt.figure(figsize=(8, 3.5))
        plt.hist(num_tests_patched, bins=20, alpha=0.7, label='Repaired Submissions', color='blue')
        plt.hist(num_tests_unpatched, bins=20, alpha=0.7, label='Unrepaired Submissions', color='orange')

        plt.yscale("log")
        plt.ylabel('number of submissions', fontsize=16)
        plt.legend(fontsize=13)
        plt.tight_layout()
        plt.show()


if __name__ == '__main__':
    f = Figures()
    # f.box_plot_rq2()
    # f.venn_diagram_rq2()
    # f.histogram_rq3_buggy_methods()
    f.histogram_rq3_num_failed_tests()
    # f.get_below_threshold_unpatched()
