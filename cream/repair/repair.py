import logging
import os
from pathlib import Path

from cream import utils


class Repair:
    def __init__(self, submissions):
        self.project_home = Path("/Users/ruizhengu/Projects")
        # self.project_home = Path("/mnt/parscratch/users/acp22rg/APR")
        self.dataset_home = self.project_home / "IntermediateJava/incorrect_submissions"
        self.model_solution = self.project_home / "IntermediateJava/model_solution"
        self.arja_home = self.project_home / "arja"
        self.dependency = self.project_home / "IntermediateJava/dependency"
        self.submission_list = [submission for submission in self.dataset_home.iterdir() if
                                submission.is_dir() and submission.name != ".git"]
        self.model_test_suite = self.model_solution / "src/test/java/uk/ac/sheffield/com1003/cafe"
        self._main_path = Path("src/main/java/uk/ac/sheffield/com1003/cafe")
        self._test_path = Path("src/test/java/uk/ac/sheffield/com1003/cafe")
        self.arja_output = self.logging_init()
        self.submissions = submissions

    def logging_init(self):
        arja_output = self.project_home / "APR4Grade/patches"
        if not arja_output.exists():
            os.mkdir(arja_output)
        arja_output = arja_output / "default"
        if not arja_output.exists():
            os.mkdir(arja_output)
        arja_log = arja_output / "arja.log"
        if arja_log.exists():
            arja_log.unlink()
        logging.basicConfig(filename=arja_log, level=logging.INFO)
        return arja_output

    def arja(self):
        for i in submissions:
            submission = self.dataset_home / str(i)
            # for submission in self.submission_list:
            path_src = submission / "src"
            path_bin_src = submission / "build/classes/java/main"
            path_bin_test = submission / "build/classes/java/test"
            dependencies = [str(file) for file in self.dependency.glob('**/*.jar') if file.name != ".DS_Store"]
            dependencies = ":".join(dependencies)
            arja_output = self.arja_output / submission.name
            if not arja_output.exists():
                os.mkdir(arja_output)
            arja_cmd = f"cd {self.arja_home} && java -cp \"lib/*:bin\" us.msu.cse.repair.Main ArjaE -DsrcJavaDir {path_src} -DbinJavaDir {path_bin_src} -DbinTestDir {path_bin_test} -Ddependences {dependencies} -DpatchOutputRoot {arja_output}"
            arja_output = utils.run_cmd(arja_cmd)
            # print(arja_output)
            self.logging(submission)

    def logging(self, submission):
        arja_output = self.arja_output / submission.name
        if not any(arja_output.iterdir()):
            logging.info(f"Repair {submission.name} completed > No patch generated.")
        else:
            logging.info(f"Repair {submission.name} completed > Patches generated.")


if __name__ == '__main__':
    submissions = [21, 24, 98, 149, 223, 242]
    repair = Repair(submissions)
    repair.arja()
