import shutil
from datetime import datetime

import utils
from repair_cafe import RepairCafe
from pathlib import Path


class PartialRepairCafe:
    def __init__(self):
        # self.submissions = "/Users/ruizhengu/Experiments/APR-as-AAT/anonymised-submissions"
        self.submissions = "/mnt/parscratch/users/acp22rg/APR-as-AAT/anonymised-submissions"
        self.repair_cafe = RepairCafe(self.submissions)
        self.submission_roots = self.repair_cafe.pre_processing()
        # self.home_repair = Path("/Users/ruizhengu/Projects/APR-as-AAT/repair-generation")
        self.home_repair = Path("/mnt/parscratch/users/acp22rg/APR-as-AAT/APR-as-AAT/repair-generation")
        self._backup_bin = self.home_repair / "lib/test-tmp/bin"
        self._backup_src = self.home_repair / "lib/test-tmp/src"
        self._src_test = "src/test/java/uk/ac/sheffield/com1003/cafe"
        self._bin_test = "build/classes/java/test/uk/ac/sheffield/com1003/cafe"

    def partial_repair(self):
        for index, submission in enumerate(self.submission_roots, start=1):
            negative_tests = utils.gradle_get_failed_tests(submission)
            self.log_progress(index, submission)
            if len(negative_tests) > 0:
                print(f"Number of Negative Tests: {len(negative_tests)}")
                self.empty_backup()
                for test in negative_tests:
                    self.move_test(submission, test, 0)
                for test_index, test in enumerate(negative_tests, start=1):
                    self.move_test(submission, test, 1)
                    self.log_partial_repair(submission, test, test_index, len(negative_tests))
                    patch = self.repair_cafe.repair(submission, index)
                    try:
                        if patch is not None:
                            utils.apply_patch(patch / "astor_output.json")
                    except FileNotFoundError as e:
                        print(f"File Not Found: {e}")
                    utils.empty_directory(Path(submission) / self._src_test)
                    utils.empty_directory(Path(submission) / self._bin_test)
            # Check if partial repair works
            self.repair_cafe.replace_tests(submission)
            patched_negative_tests = utils.gradle_get_failed_tests(submission)
            if len(patched_negative_tests) == 0:
                print(f"Partial Repair - Fixed > Submission {submission}")
            elif len(patched_negative_tests) < len(negative_tests):
                print(f"Partial Repair - Improved > Submission {submission}")

    def log_progress(self, index, submission):
        submission_name = submission.split('/')[-1]
        current_time = datetime.now().strftime("%H:%M:%S")
        print(
            f"Processing Submission > {submission_name} | {index} / {len(self.submission_roots)} | {current_time}")

    @staticmethod
    def log_partial_repair(submission, test, test_index, num_negative_tests):
        submission_name = submission.split('/')[-1]
        print(
            f"Partial Repair Submission > {submission_name} | Test > {test} | {test_index} / {num_negative_tests}")

    def empty_backup(self):
        backup_src = self.home_repair / self._backup_src
        backup_bin = self.home_repair / self._backup_bin
        utils.empty_directory(backup_src)
        utils.empty_directory(backup_bin)

    def move_test(self, submission, test, direction):
        source_src = Path(submission) / self._src_test / f"{test}.java"
        source_bin = Path(submission) / self._bin_test / f"{test}.class"
        destination_src = self.home_repair / self._backup_src / f"{test}.java"
        destination_bin = self.home_repair / self._backup_bin / f"{test}.class"
        if direction == 0:
            shutil.move(source_src, destination_src)
            shutil.move(source_bin, destination_bin)
        if direction == 1:
            shutil.move(destination_src, source_src)
            shutil.move(destination_bin, source_bin)


if __name__ == '__main__':
    repair = PartialRepairCafe()
    repair.partial_repair()
