import json
import logging
import os
import random
import re
import shutil
import sys
from pathlib import Path

from cream import utils
from cream.incremental_repair.intermediate import Intermediate


class PartialRepair:
    def __init__(self, start, end):
        self.root = Path("/Users/ruizhengu/Projects")
        # self.root = Path("/mnt/parscratch/users/acp22rg/APR")
        self.project_home = self.root / "APR4Grade"
        self.dataset_home = self.root / "IntermediateJava/incorrect_submissions"
        self.arja_home = self.root / "arja"
        self.dependency = self.root / "IntermediateJava/dependency"

        self._main_path = Path("main/java/uk/ac/sheffield/com1003/cafe")
        self.method_coverage_json = self.project_home / "resource/method_coverage.json"
        self.method_ranking_policy = "DESCENT"
        # self.method_ranking_policy = "ASCENT"
        # self.method_ranking_policy = "RANDOM"
        self.incremental_repair_record = {
            "DESCENT": self.project_home / "resource/incremental_repair_descent.json",
            "ASCENT": self.project_home / "resource/incremental_repair_ascent.json",
            "RANDOM": self.project_home / "resource/incremental_repair_random.json"
        }
        self.start_index = start
        self.end_index = end
        self.arja_output = self.logging_init()
        self.intermediate = Intermediate(self.root)
        self.intermediate_repairs = Path("/Users/ruizhengu/Experiments/APR4Grade/intermediate_repairs")
        # self.intermediate_repairs = Path("/mnt/parscratch/users/acp22rg/APR/intermediate_repairs")
        self.intermediates_path = self.root / "IntermediateJava/intermediates"


    def logging_init(self):
        arja_output = self.project_home / "patches"
        if not arja_output.exists():
            os.mkdir(arja_output)
        arja_output = arja_output / f"cream_{self.method_ranking_policy}"
        if not arja_output.exists():
            os.mkdir(arja_output)
        arja_log = arja_output / "arja.log"
        # if arja_log.exists():
        #     arja_log.unlink()
        logging.basicConfig(filename=arja_log, level=logging.INFO)
        return arja_output

    def repair(self):
        for i in range(self.start_index, self.end_index + 1):
            submission = self.dataset_home / str(i)
            intermediate = self.intermediate_repairs / str(i)
            buggy_methods = self.method_ranking(str(i))
            successful_patches = []
            data = {}
            for m in range(len(buggy_methods)):
                # Restore the intermediate program
                if intermediate.exists():
                    shutil.rmtree(intermediate)
                shutil.copytree(submission, intermediate)
                # Apply the successful patches to the intermediate program
                if len(successful_patches) != 0:
                    for successful_patch in successful_patches:
                        self.apply_patch(intermediate, successful_patch)
                    self.compile_intermediate(intermediate)
                method_under_repair = buggy_methods[m]
                methods_to_replace = buggy_methods[m + 1:]

                print(f"Repair submission {str(i)} - Method under repair {method_under_repair}")
                num_failed_tests_patched = self.get_number_failed_tests(intermediate, method_under_repair)
                if num_failed_tests_patched == 0:
                    # If the program has no failed tests after applying the patches, go to the next submission
                    data[method_under_repair] = "The program is fully patched."
                    self.incremental_record(submission.name, data)
                    break
                else:
                    num_failed_tests_replaced = num_failed_tests_patched
                    if len(methods_to_replace) > 0:
                        self.intermediate.update_intermediate(intermediate, methods_to_replace)
                        # Compile the program when the intermediate is updated
                        self.compile_intermediate(intermediate)
                        num_failed_tests_replaced = self.get_number_failed_tests(intermediate, method_under_repair)
                        if num_failed_tests_replaced == 0:
                            # If the program has no failed tests after replacing incorrect methods,
                            # means there is no bugs in the current method under repair
                            data[method_under_repair] = "Intermediate program does not have failed tests."
                            self.incremental_record(submission.name, data)
                            continue
                    arja_output = self.arja(intermediate, method_under_repair)
                    patch = self.patch_selection(arja_output)
                    if patch is not None:
                        self.apply_patch(intermediate, patch)
                        successful_patches.append(patch)
                        patches_generated = True
                        logging.info(f"Repair {str(i)} - Method {method_under_repair} > Patch generated.")
                    else:
                        patches_generated = False
                        logging.info(f"Repair {str(i)} - Method {method_under_repair} > No Patch generated.")

                    data[method_under_repair] = {
                        "number of failed tests - patched": num_failed_tests_patched,
                        "number of failed tests - intermediate": num_failed_tests_replaced,
                        "patches generated": patches_generated
                    }
                    self.incremental_record(submission.name, data)

    def repair_intermediates(self, start_index, end_index):
        for i in range(start_index, end_index + 1):
            # submission = self.dataset_home / str(i)
            intermediate = self.intermediates_path / str(i)
            for intermediate_method in intermediate.iterdir():
                if intermediate.is_dir():
                    arja_output = self.arja(intermediate, intermediate_method.name)
                    patch = self.patch_selection(arja_output)
                    if patch is not None:
                        logging.info(f"Repair {str(i)} - Method {intermediate_method.name} > Patch generated.")
                    else:
                        logging.info(f"Repair {str(i)} - Method {intermediate_method.name} > No Patch generated.")

    def apply_patch(self, intermediate, patch):
        patch_classes = patch / "patched" / self._main_path
        for clazz in patch_classes.iterdir():
            if clazz.is_file() and clazz.name.endswith(".java"):
                submission_clazz = intermediate / "src" / self._main_path / clazz.name
                submission_clazz.unlink()
                shutil.copy(clazz, submission_clazz)
            elif clazz.is_dir():
                for sub_clazz in clazz.iterdir():
                    if sub_clazz.name.endswith(".java"):
                        submission_clazz = intermediate / "src" / self._main_path / clazz.name / sub_clazz.name
                        submission_clazz.unlink()
                        shutil.copy(sub_clazz, submission_clazz)

    def method_ranking(self, submission):
        with open(self.method_coverage_json) as f:
            d = json.load(f)
        coverage = d[submission]
        methods_with_coverage = [(method, detail["num"]) for method, detail in coverage.items() if detail["num"] > 0]
        if self.method_ranking_policy == "DESCENT":  # sort from high to low
            sorted_methods = sorted(methods_with_coverage, key=lambda x: x[1], reverse=True)
            sorted_methods = [x[0] for x in sorted_methods]
            return sorted_methods
        elif self.method_ranking_policy == "ASCENT":  # sort from low to high
            sorted_methods = sorted(methods_with_coverage, key=lambda x: x[1], reverse=False)
            sorted_methods = [x[0] for x in sorted_methods]
            return sorted_methods
        elif self.method_ranking_policy == "RANDOM":  # random shuffle methods
            random.shuffle(methods_with_coverage)
            shuffled_methods = [x[0] for x in methods_with_coverage]
            return shuffled_methods

    def patch_selection(self, patches):
        patches_filtered = []
        if not any(patches.iterdir()):
            return None
        for patch in patches.iterdir():
            if patch.is_dir():
                diff = patch / "diff"
                with open(diff, "r") as f:
                    d = f.read()
                if "System.exit(0);" not in d:
                    patches_filtered.append(patch)
        # Get the patch with the minimal edits (lowest number of lines in the diff file)
        min_lines = None
        min_file = None
        for filtered_patch in patches_filtered:
            diff = filtered_patch / "diff"
            with open(diff, "r") as f:
                lines = f.readlines()
                number_of_lines = len(lines)
                if min_lines is None or number_of_lines < min_lines:
                    min_lines = number_of_lines
                    min_file = filtered_patch
        return min_file

    def compile_intermediate(self, intermediate):
        chmod = f"chmod +x {intermediate}/gradlew"
        cmd = f"{intermediate}/gradlew build -p {intermediate} --parallel"
        try:
            utils.run_cmd(chmod)
            build_output = utils.run_cmd(cmd)
            if "BUILD SUCCESSFUL" not in build_output and "Execution failed for task ':test'." not in build_output:
                print(intermediate.name + " BUILD FAILED")
        except Exception as e:
            print(f"{intermediate} - Error executing {e}")

    def get_number_failed_tests(self, intermediate, method_under_repair):
        # self.compile_intermediate(intermediate)
        list_cmd = f"{intermediate}/gradlew listFailedTests -p {intermediate} --parallel"
        output = utils.run_cmd(list_cmd)
        pattern = r"^(.+::\w+)$"
        failed_tests = re.findall(pattern, output, re.MULTILINE)
        print(
            f"Submission {intermediate} - Method under repair {method_under_repair} > Failed number of tests {len(failed_tests)}")
        return len(failed_tests)

    def arja(self, submission, method):
        path_src = submission / "src"
        path_bin_src = submission / "build/classes/java/main"
        path_bin_test = submission / "build/classes/java/test"
        dependencies = [str(file) for file in self.dependency.glob('**/*.jar') if file.name != ".DS_Store"]
        dependencies = ":".join(dependencies)
        arja_output = self.arja_output / submission.name
        if not arja_output.exists():
            os.mkdir(arja_output)
        arja_output = self.arja_output / submission.name / method
        if not arja_output.exists():
            os.mkdir(arja_output)
        # Set 10 minutes time limit per execution
        arja_cmd = f"cd {self.arja_home} && java -cp \"lib/*:bin\" us.msu.cse.repair.Main ArjaE -DsrcJavaDir {path_src} -DbinJavaDir {path_bin_src} -DbinTestDir {path_bin_test} -Ddependences {dependencies} -DpatchOutputRoot {arja_output} -DmaxTime 10 -DingredientMode Application -DdiffFormat true"
        arja_results = utils.run_cmd(arja_cmd)
        return arja_output

    def incremental_record(self, submission, data):
        with open(self.incremental_repair_record[self.method_ranking_policy], 'r') as f:
            d = json.load(f)
        d[str(submission)] = data
        with open(self.incremental_repair_record[self.method_ranking_policy], 'w') as f:
            json.dump(d, f)


if __name__ == '__main__':
    start_index = int(sys.argv[1])
    end_index = int(sys.argv[2])

    # start_index = 1
    # end_index = 10
    p = PartialRepair(start_index, end_index)
    p.repair()
