import logging
import os
import shutil
from pathlib import Path

from cream import utils


class Repair:
    def __init__(self):
        self.project_home = Path("/")
        self.dataset_home = Path("/Users/ruizhengu/Experiments/APR4Grade/IntermediateJava/incorrect_submissions")
        self.arja_home = Path("/Users/ruizhengu/Projects/arja")
        self.submission_list = [submission for submission in self.dataset_home.iterdir() if
                                submission.is_dir() and submission.name != ".git"]
        self.model_solution = Path("/Users/ruizhengu/Experiments/APR4Grade/IntermediateJava/model_solution")
        self.dependency = Path("/Users/ruizhengu/Experiments/APR4Grade/IntermediateJava/dependency")
        self.model_test_suite = self.model_solution / "src/test/java/uk/ac/sheffield/com1003/cafe"
        self._main_path = Path("src/main/java/uk/ac/sheffield/com1003/cafe")
        self._test_path = Path("src/test/java/uk/ac/sheffield/com1003/cafe")
        self.arja_output = self.logging_init()

    def logging_init(self):
        arja_output = self.project_home / "patches/default"
        if not arja_output.exists():
            os.mkdir(arja_output)
        arja_log = arja_output / "arja.log"
        if arja_log.exists():
            arja_log.unlink()
        logging.basicConfig(filename=arja_log, level=logging.INFO)
        return arja_output

    def arja(self):
        for submission in self.submission_list:
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
    repair = RepairCafe()
    repair.arja()
