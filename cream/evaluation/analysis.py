from pathlib import Path

import pandas as pd
from cream import utils


class Analysis:
    def __init__(self):
        pass


patches = Path("/Users/ruizhengu/Downloads/default")
submissions = [221, 124, 83]
for i in submissions:
    patch = patches / str(i)
    for file in patch.iterdir():
        if not file.name.startswith("."):
            with open(file, "r") as f:
                d = f.read()
            if "System.exit(0);" not in d:
                print(patch)
                break
