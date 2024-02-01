import shutil
from datetime import datetime

import utils
from repair_cafe import RepairCafe
from pathlib import Path


class PartialRepairCafe:
    def __init__(self):
        # self.submissions = "/Users/ruizhengu/Experiments/APR-as-AAT/anonymised-submissions"
        self.submissions = "/mnt/parscratch/users/acp22rg/APR-as-AAT/anonymised-submissions"

        # self.home_path = Path("/Users/ruizhengu/Projects/APR-as-AAT")
        self.home_path = Path("/mnt/parscratch/users/acp22rg/APR-as-AAT/APR-as-AAT")

        self.repair_cafe = RepairCafe(self.submissions, self.home_path)
        self.submission_roots = self.repair_cafe.pre_processing()

        self.home_repair = self.home_path / "repair-generation"
        self._backup_bin = self.home_repair / "lib/test-tmp/bin"
        self._backup_src = self.home_repair / "lib/test-tmp/src"
        self._src_test = "src/test/java/uk/ac/sheffield/com1003/cafe"
        self._bin_test = "build/classes/java/test/uk/ac/sheffield/com1003/cafe"

        self.patch_results = self.home_path / "repair-generation/results/results_cafe.xlsx"
        utils.create_excel(self.patch_results)

    def partial_repair(self):
        for index, submission in enumerate(self.submission_roots, start=1):
            submission_name = submission.split('/')[-1]
            positive_tests, negative_tests, num_tests = utils.gradle_get_tests(submission)
            initial_positive_tests = len(positive_tests)
            self.log_progress(index, submission_name)
            # If the submission is fixed with a test, keep the test in the list, otherwise drop it
            incremental_test = list(positive_tests)
            if len(negative_tests) > 0:
                print(f"Number of Negative Tests: {len(negative_tests)}")
                self.empty_backup()
                for test in negative_tests:
                    self.test_backup(submission, test)
                for test_index, test in enumerate(negative_tests, start=1):
                    incremental_test.append(test)
                    self.move_test(submission, test)
                    self.log_partial_repair(submission_name, test, test_index, len(negative_tests))
                    patch = self.repair_cafe.repair(submission)
                    if patch == "No suspicious line":
                        continue
                    elif patch is not None:
                        utils.apply_patch(patch / "astor_output.json")
                        self.save_patch_results(submission_name, patch, incremental_test, num_tests)
                    else:
                        incremental_test.pop()
                        self.delete_test(submission, test)
            # Check if partial repair works
            if len(incremental_test) == num_tests:
                print(f"Partial Repair - Fixed > Submission {submission}")
            elif len(incremental_test) > initial_positive_tests:
                print(f"Partial Repair - Improved > Submission {submission}")

    def save_patch_results(self, submission_name, patch, incremental_test, num_tests):
        data = {
            "Project": "Cafe",
            "Submission": submission_name,
            "Patch": str(patch).split('/')[-1],
            "Passed Tests": f"{len(incremental_test)} / {num_tests}"
        }
        utils.append_excel(self.patch_results, data)

    def log_progress(self, index, submission_name):
        current_time = datetime.now().strftime("%H:%M:%S")
        print(
            f"Processing Submission > {submission_name} | {index} / {len(self.submission_roots)} | {current_time}")

    @staticmethod
    def log_partial_repair(submission_name, test, test_index, num_negative_tests):
        print(
            f"Partial Repair Submission > {submission_name} | Test > {test} | {test_index} / {num_negative_tests}")

    def empty_backup(self):
        backup_src = self.home_repair / self._backup_src
        backup_bin = self.home_repair / self._backup_bin
        utils.empty_directory(backup_src)
        utils.empty_directory(backup_bin)

    def test_backup(self, submission, test):
        source_src = Path(submission) / self._src_test / f"{test}.java"
        source_bin = Path(submission) / self._bin_test / f"{test}.class"
        backup_src = self.home_repair / self._backup_src / f"{test}.java"
        backup_bin = self.home_repair / self._backup_bin / f"{test}.class"
        shutil.move(source_src, backup_src)
        shutil.move(source_bin, backup_bin)

    def delete_test(self, submission, test):
        test_src = Path(submission) / self._src_test / f"{test}.java"
        test_bin = Path(submission) / self._bin_test / f"{test}.class"
        test_src.unlink()
        test_bin.unlink()

    def move_test(self, submission, test):
        source_src = Path(submission) / self._src_test / f"{test}.java"
        source_bin = Path(submission) / self._bin_test / f"{test}.class"
        backup_src = self.home_repair / self._backup_src / f"{test}.java"
        backup_bin = self.home_repair / self._backup_bin / f"{test}.class"
        shutil.move(backup_src, source_src)
        shutil.move(backup_bin, source_bin)


if __name__ == '__main__':
    repair = PartialRepairCafe()
    repair.partial_repair()
