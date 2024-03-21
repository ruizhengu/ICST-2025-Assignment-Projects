import json
import logging
import os
import re
import sys
from pathlib import Path

from cream import utils


class PartialRepair:
    def __init__(self, start, end):
        if sys.platform == "linux":
            self.root = Path("/mnt/parscratch/users/acp22rg/APR")
        else:
            self.root = Path("/Users/ruizhengu/Projects")
        self.project_home = self.root / "APR4Grade"
        self.dataset_home = self.root / "IntermediateJava/incorrect_submissions"
        self.arja_home = self.root / "arja"
        self.dependency = self.root / "IntermediateJava/dependency"

        self.method_coverage_json = self.project_home / "resource/method_coverage.json"
        self.start_index = start
        self.end_index = end
        self.arja_output = self.logging_init()
        self.intermediates_path = self.root / "intermediates"
        self.intermediate_repair_record = self.project_home / "resource/intermediates_repair.json"

    def logging_init(self):
        arja_output = self.project_home / "patches"
        if not arja_output.exists():
            os.mkdir(arja_output)
        # arja_output = arja_output / f"cream_{self.method_ranking_policy}"
        arja_output = arja_output / f"cream"
        if not arja_output.exists():
            os.mkdir(arja_output)
        arja_log = arja_output / "arja.log"
        # if arja_log.exists():
        #     arja_log.unlink()
        logging.basicConfig(filename=arja_log, level=logging.INFO)
        return arja_output

    def repair_intermediates(self):
        # for i in range(self.start_index, self.end_index + 1):
        for i in [227, 228, 229, 230]:
            intermediate = self.intermediates_path / str(i)
            data = {}
            for intermediate_method in intermediate.iterdir():
                if intermediate_method.is_dir():
                    num_failed_tests = self.get_number_failed_tests(intermediate_method, intermediate_method.name)
                    arja_output = self.arja(intermediate_method, intermediate_method.name, intermediate.name)
                    patch = self.patch_selection(arja_output)
                    if patch is not None:
                        patches_generated = True
                        logging.info(f"Repair {str(i)} - Method {intermediate_method.name} > Patch generated.")
                    else:
                        patches_generated = False
                        logging.info(f"Repair {str(i)} - Method {intermediate_method.name} > No Patch generated.")
                    data[intermediate_method.name] = {
                        "number of failed tests": num_failed_tests,
                        "patches generated": patches_generated
                    }
                    self.incremental_record(intermediate.name, data)

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

    def get_number_failed_tests(self, intermediate, method_under_repair):
        chmod = f"chmod +x {intermediate}/gradlew"
        cmd = f"{intermediate}/gradlew build -p {intermediate}"
        try:
            utils.run_cmd(chmod)
            build_output = utils.run_cmd(cmd)
            if "BUILD SUCCESSFUL" not in build_output and "Execution failed for task ':test'." not in build_output:
                print(intermediate.name + " BUILD FAILED")
        except Exception as e:
            print(f"{intermediate} - Error executing {e}")

        list_cmd = f"{intermediate}/gradlew listFailedTests -p {intermediate}"
        output = utils.run_cmd(list_cmd)
        pattern = r"^(.+::\w+)$"
        failed_tests = re.findall(pattern, output, re.MULTILINE)
        print(
            f"Submission {intermediate} - Method under repair {method_under_repair} > Failed number of tests {len(failed_tests)}")
        return len(failed_tests)

    def arja(self, submission, method, intermediate):
        path_src = submission / "src"
        path_bin_src = submission / "build/classes/java/main"
        path_bin_test = submission / "build/classes/java/test"
        dependencies = [str(file) for file in self.dependency.glob('**/*.jar') if file.name != ".DS_Store"]
        dependencies = ":".join(dependencies)
        arja_output = self.arja_output / intermediate
        if not arja_output.exists():
            os.mkdir(arja_output)
        arja_output = self.arja_output / intermediate / method
        if not arja_output.exists():
            os.mkdir(arja_output)
        # Set 10 minutes time limit per execution
        arja_cmd = f"cd {self.arja_home} && java -cp \"lib/*:bin\" us.msu.cse.repair.Main ArjaE -DsrcJavaDir {path_src} -DbinJavaDir {path_bin_src} -DbinTestDir {path_bin_test} -Ddependences {dependencies} -DpatchOutputRoot {arja_output} -DmaxTime 10 -DingredientMode Application -DdiffFormat true"
        arja_results = utils.run_cmd(arja_cmd)
        return arja_output

    def incremental_record(self, submission, data):
        with open(self.intermediate_repair_record, 'r') as f:
            d = json.load(f)
        d[str(submission)] = data
        with open(self.intermediate_repair_record, 'w') as f:
            json.dump(d, f)


if __name__ == '__main__':
    # start_index = int(sys.argv[1])
    # end_index = int(sys.argv[2])

    start_index = 296
    end_index = 296
    p = PartialRepair(start_index, end_index)
    p.repair_intermediates()
