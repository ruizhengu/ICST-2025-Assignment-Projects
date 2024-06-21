import json
import random
from pathlib import Path

import statistics
from venny4py.venny4py import *
import numpy as np


class Figures:
    def __init__(self):
        self.root = Path("/Users/ruizhengu/Projects")
        self.project_home = self.root / "APR4Grade"
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

    def box_plot_rq3_num_failed_tests(self):
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
        results = {
            "patched solutions": num_tests_patched,
            "unpatched solutions": num_tests_unpatched
        }

        q3_patched = np.percentile(num_tests_patched, 75)
        q3_unpatched = np.percentile(num_tests_unpatched, 75)
        print(f"q3_patched: {q3_patched}")
        print(f"q3_unpatched: {q3_unpatched}")

        print(f"patched solutions - average: {statistics.mean(num_tests_patched)}")
        print(f"patched solutions - test failure rate: {statistics.mean(num_tests_patched) / 60}")
        print(f"unpatched solutions - average: {statistics.mean(num_tests_unpatched)}")
        print(f"unpatched solutions - test failure rate: {statistics.mean(num_tests_unpatched) / 60}")

        plt.boxplot(results.values(), labels=results.keys())
        plt.show()

    def box_plot_rq3_buggy_methods(self):
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
        print(num_methods_patched)
        print(num_methods_unpatched)
        results = {
            "patched solutions": num_methods_patched,
            "unpatched solutions": num_methods_unpatched
        }
        plt.boxplot(results.values(), labels=results.keys())
        plt.show()

    def box_plot_rq3_merged(self):
        patched_programs = self.get_submission_patched()
        unpatched_programs = self.get_submission_unpatched()
        num_tests_patched = []
        num_tests_unpatched = []
        num_methods_patched = []
        num_methods_unpatched = []

        with open(self.failed_tests_json, 'r') as j:
            d = json.load(j)
        for submission, number in d.items():
            if submission in patched_programs:
                num_tests_patched.append(number / 2)
            elif submission in unpatched_programs:
                num_tests_unpatched.append(number / 2)

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

        data = [num_tests_patched, num_tests_unpatched, num_methods_patched, num_methods_unpatched]
        labels = ['Number of Failed Tests', 'Number of Buggy Methods']
        positions = [1, 1.5, 2, 2.5]  # Leave a gap between the two groups
        fig, ax = plt.subplots(figsize=(8, 6))
        box = ax.boxplot(data, positions=positions, widths=0.3, showfliers=False, patch_artist=True)

        colors = ['lightblue', 'lightgreen']
        for patch, color in zip([box['boxes'][0], box['boxes'][2]], [colors[0]] * 2):
            patch.set_facecolor(color)
        for patch, color in zip([box['boxes'][1], box['boxes'][3]], [colors[1]] * 2):
            patch.set_facecolor(color)

        patched_patch = mpatches.Patch(color='lightblue', label='Patched Solutions')
        unpatched_patch = mpatches.Patch(color='lightgreen', label='Unpatched Solutions')
        plt.legend(handles=[patched_patch, unpatched_patch], loc='upper right', fontsize=12)
        plt.xticks([1.25, 2.25], labels, fontsize=14)  # Merge the x-axis labels

        plt.tight_layout()
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


if __name__ == '__main__':
    f = Figures()
    # f.box_plot_rq1()
    # f.box_plot_rq2()
    # f.venn_diagram_rq2()
    # f.box_plot_rq3_num_failed_tests()
    # f.box_plot_rq3_buggy_methods()
    # f.get_below_threshold_unpatched()
    f.box_plot_rq3_merged()
