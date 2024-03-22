import json
from pathlib import Path

import matplotlib.pyplot as plt


class Figures:
    def __init__(self):
        self.root = Path("/Users/ruizhengu/Projects")
        self.project_home = self.root / "APR4Grade"
        self.results_json = self.project_home / "resource/results.json"
        self.model = "m"

    def get_results(self):
        with open(self.results_json, 'r') as f:
            d = json.load(f)[self.model]
        dps = []
        for submission, result in d.items():
            dps.append(result["degree of patchness"])
        dp_len = len(dps)
        dp_max = max(dps)
        dp_min = min(dps)
        dp_avg = sum(dps) / dp_len
        print(f"Number of patched programs: {dp_len}")
        print(f"Maximum dp: {dp_max}")
        print(f"Minimum dp: {dp_min}")
        print(f"Average dp: {round(dp_avg, 2)}")
        return dps

    def box_plot(self):
        results = self.get_results()
        fig = plt.figure(figsize=(10, 7))
        plt.boxplot(results)
        plt.show()


if __name__ == '__main__':
    f = Figures()
    f.box_plot()
