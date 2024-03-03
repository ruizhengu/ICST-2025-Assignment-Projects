import subprocess
from pathlib import Path

import utils


class CafeProcessing:
    def __init__(self):
        self.submission_path = Path("/Users/ruizhengu/Experiments/APR-as-AAT/anonymised-submissions")

    def compile_submissions(self):
        for submission in self.submission_path.iterdir():
            print(submission)
            chmod = f"chmod +x {submission}/gradlew"
            cmd = f"{submission}/gradlew build -x test -p {submission}"
            try:
                utils.run_cmd(chmod)
                utils.run_cmd(cmd)
            except subprocess.CalledProcessError as e:
                print(f"{submission} - Error executing {e}")


if __name__ == '__main__':
    p = CafeProcessing()
    p.compile_submissions()
