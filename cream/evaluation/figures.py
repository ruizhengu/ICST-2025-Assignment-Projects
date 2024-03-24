import json
from pathlib import Path

import matplotlib.pyplot as plt


class Figures:
    def __init__(self):
        self.root = Path("/Users/ruizhengu/Projects")
        self.project_home = self.root / "APR4Grade"
        self.results_json = self.project_home / "resource/results.json"

    def get_results(self, model):
        with open(self.results_json, 'r') as f:
            d = json.load(f)[model]
        dps = []
        for submission, result in d.items():
            dps.append(result["degree of patchness"])
        return dps

    def box_plot(self):
        results_m = self.get_results("m")
        results_1 = self.get_results("1")
        results_2 = []
        results_3 = []
        results = {
            "MS": results_m,
            "CS 1": results_1,
            "CS 2": results_2,
            "CS 3": results_3,
        }
        plt.boxplot(results.values(), labels=results.keys())
        plt.ylabel("Degree of patchedness")
        plt.show()


if __name__ == '__main__':
    f = Figures()
    f.box_plot()
