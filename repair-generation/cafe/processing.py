import shutil
import subprocess
from pathlib import Path

import utils


class CafeProcessing:
    def __init__(self):
        self.submission_path = Path("/Users/ruizhengu/Experiments/APR-as-AAT/anonymised-submissions")
        self.model_solution = Path("/Users/ruizhengu/Projects/APR-as-AAT/resource/cafe_java_8")

    def replace_build_gradle(self, submission):
        build_gradle_source = self.model_solution / "build.gradle"
        build_gradle_submission = submission / "build.gradle"
        shutil.copy2(build_gradle_source, build_gradle_submission)

    def compile_submissions(self):
        submissions_list = list(filter(lambda p: ".DS_Store" not in str(p), self.submission_path.iterdir()))

        for submission in submissions_list:
            print(submission)
            self.replace_build_gradle(submission)
            chmod = f"chmod +x {submission}/gradlew"
            cmd = f"{submission}/gradlew build -x test -p {submission}"
            try:
                utils.run_cmd(chmod)
                build_output = utils.run_cmd(cmd)
                if "BUILD SUCCESSFUL" not in build_output:
                    print(submission.name + " BUILD FAILED")
            except Exception as e:
                print(f"{submission} - Error executing {e}")

    def get_failed_tests(self, submission):
        test_cmd = f"{submission}/gradlew build -p {submission}"
        list_cmd = f"{submission}/gradlew listFailedTests -p {submission}"


if __name__ == '__main__':
    p = CafeProcessing()
    p.compile_submissions()
