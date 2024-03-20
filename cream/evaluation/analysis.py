import json
import math
from pathlib import Path

import pandas as pd
from cream import utils


class Analysis:
    def __init__(self):
        self.root = Path("/Users/ruizhengu/Projects")
        self.project_home = self.root / "APR4Grade"
        self.method_weighting_json = self.project_home / "resource/method_weighting.json"

    def calculate_weights(self):
        with open(self.method_weighting_json, 'r') as file:
            data = json.load(file)
        weighted_data = {}
        num_tests = []
        for name, tests in data.items():
            num_tests.append(tests["num"])
        total_tests = sum(num_tests)
        for name, tests in data.items():
            weighted_data[name] = {
                "tests": tests["tests"],
                "num": tests["num"],
                "weight": round(tests["num"] * 100.00 / total_tests, 2)
            }
        with open(self.method_weighting_json, "w") as f:
            f.write(json.dumps(weighted_data, indent=4))


if __name__ == '__main__':
    a = Analysis()
    a.calculate_weights()
