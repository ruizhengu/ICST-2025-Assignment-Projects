import pandas as pd
from cream import utils



class Analysis:
    def __init__(self):
        self.datasets = utils.get_intro_class_datasets()

    def get_distribution(self):
        distribution = {}
        for dataset in self.datasets:
            dataset = utils.INTRO_CLASS_PATH / dataset
            submissions = [d for d in dataset.iterdir() if d.is_dir() and d.name != "ref"]
            distribution[dataset.name] = len(submissions)
        return distribution

    def get_repair_results(self):
        data = pd.read_excel(utils.PATCH_RESULTS, sheet_name='workspace')
        project_counts = data["Project"].value_counts()
        for key, value in self.get_distribution().items():
            if key in project_counts:
                counts = project_counts[key]
                print(f"{key}: {counts} / {value} {round(counts / value * 100, 2)}%")


if __name__ == '__main__':
    analysis = Analysis()
    analysis.get_repair_results()