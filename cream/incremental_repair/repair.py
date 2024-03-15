import json
import logging
import os
import random
import re
import shutil
import sys
from pathlib import Path

from cream import utils


class PartialRepair:
    def __init__(self, start, end):
        self.root = Path("/Users/ruizhengu/Projects")
        # self.root = Path("/mnt/parscratch/users/acp22rg/APR")
        self.project_home = self.root / "APR4Grade"
        self.dataset_home = self.root / "IntermediateJava/incorrect_submissions"
        # self.model_solution = self.root / "IntermediateJava/model_solution"
        self.arja_home = self.project_home / "arja"
        self.dependency = self.project_home / "IntermediateJava/dependency"

        self._main_path = Path("main/java/uk/ac/sheffield/com1003/cafe")
        # self.model_test_suite = self.model_solution / "src/test/java/uk/ac/sheffield/com1003/cafe"
        # self.method_file_json = self.project_home / "resource/method_files.json"
        self.method_coverage_json = self.project_home / "resource/method_coverage.json"
        self.method_ranking_policy = "ASCENT"
        # self.method_ranking_policy = "DESCENT"
        # self.method_ranking_policy = "RANDOM"
        self.start_index = start
        self.end_index = end
        self.arja_output = self.logging_init()
        self.intermediate_repairs = Path("/Users/ruizhengu/Experiments/APR4Grade/intermediate_repairs")

    def logging_init(self):
        arja_output = self.project_home / "patches"
        if not arja_output.exists():
            os.mkdir(arja_output)
        arja_output = arja_output / f"cream_{self.method_ranking_policy}"
        if not arja_output.exists():
            os.mkdir(arja_output)
        arja_log = arja_output / "arja.log"
        if arja_log.exists():
            arja_log.unlink()
        logging.basicConfig(filename=arja_log, level=logging.INFO)
        return arja_output

    def repair(self):
        for i in range(self.start_index, self.end_index + 1):
            submission = self.dataset_home / str(i)
            intermediate = self.intermediate_repairs / str(i)
            if intermediate.exists():
                shutil.rmtree(intermediate)
            shutil.copytree(submission, intermediate)
            buggy_methods = self.method_ranking(str(i))
            for m in range(len(buggy_methods) - 1):
                print(buggy_methods[m + 1:])

    def apply_patch(self, submission, patches):
        patches = Path("/Users/ruizhengu/Downloads/patches_ctxr")
        submission = Path("/Users/ruizhengu/Experiments/APR4Grade/212")
        for patch in patches.iterdir():
            if patch.is_dir():
                patch_classes = patch / "patched" / self._main_path
                for clazz in patch_classes.iterdir():
                    if clazz.is_file() and clazz.name.endswith(".java"):
                        submission_clazz = submission / "src" / self._main_path / clazz.name
                        submission_clazz.unlink()
                        shutil.copy(clazz, submission_clazz)
                        print(submission_clazz)
                    elif clazz.is_dir():
                        for sub_clazz in clazz.iterdir():
                            if sub_clazz.name.endswith(".java"):
                                submission_clazz = submission / "src" / self._main_path / clazz.name / sub_clazz.name
                                submission_clazz.unlink()
                                shutil.copy(sub_clazz, submission_clazz)
                                print(submission_clazz)
            # break

    def method_ranking(self, submission):
        with open(self.method_coverage_json) as f:
            d = json.load(f)
        coverage = d[submission]
        methods_with_coverage = [(method, detail["num"]) for method, detail in coverage.items() if detail["num"] > 0]
        if self.method_ranking_policy == "ASCENT":  # sort from high to low
            sorted_methods = sorted(methods_with_coverage, key=lambda x: x[1], reverse=True)
            sorted_methods = [x[0] for x in sorted_methods]
            return sorted_methods
        elif self.method_ranking_policy == "DESCENT":  # sort from low to high
            sorted_methods = sorted(methods_with_coverage, key=lambda x: x[1], reverse=False)
            sorted_methods = [x[0] for x in sorted_methods]
            return sorted_methods
        elif self.method_ranking_policy == "RANDOM":  # random shuffle methods
            random.shuffle(methods_with_coverage)
            shuffled_methods = [x[0] for x in methods_with_coverage]
            return shuffled_methods

    def patch_selection(self):
        patches = Path("/Users/ruizhengu/Downloads/patches_ctxr")
        patches_filtered = []
        for patch in patches.iterdir():
            if patch.is_dir():
                diff = patch / "diff"
                with open(diff, "r") as f:
                    d = f.read()
            if "System.exit(0);" not in d:
                print(patch)
                patches_filtered.append(patch)
        min_lines = None
        min_file = None
        for patch in patches_filtered:
            diff = patch / "diff"
            with open(diff, "r") as f:
                lines = f.readlines()
                number_of_lines = len(lines)
                if min_lines is None or number_of_lines < min_lines:
                    min_lines = number_of_lines
                    min_file = patch
        return min_file

    def arja(self, submission):
        path_src = submission / "src"
        path_bin_src = submission / "build/classes/java/main"
        path_bin_test = submission / "build/classes/java/test"
        dependencies = [str(file) for file in self.dependency.glob('**/*.jar') if file.name != ".DS_Store"]
        dependencies = ":".join(dependencies)
        arja_output = self.arja_output / submission.name
        if not arja_output.exists():
            os.mkdir(arja_output)
        arja_cmd = f"cd {self.arja_home} && java -cp \"lib/*:bin\" us.msu.cse.repair.Main ArjaE -DsrcJavaDir {path_src} -DbinJavaDir {path_bin_src} -DbinTestDir {path_bin_test} -Ddependences {dependencies} -DpatchOutputRoot {arja_output} -DdiffFormat true"
        arja_output = utils.run_cmd(arja_cmd)
        # print(arja_output)
        # self.logging(submission)

    def logging(self, submission):
        arja_output = self.arja_output / submission.name
        if not any(arja_output.iterdir()):
            logging.info(f"Repair {submission.name} completed > No patch generated.")
        else:
            logging.info(f"Repair {submission.name} completed > Patches generated.")


if __name__ == '__main__':
    # start_index = int(sys.argv[1])
    # end_index = int(sys.argv[2])

    start_index = 212
    end_index = 212
    p = PartialRepair(start_index, end_index)
    # p.method_ranking("212")
    p.repair()