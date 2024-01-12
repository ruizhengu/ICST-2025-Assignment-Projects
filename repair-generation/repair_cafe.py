import re
import subprocess
from pathlib import Path


class RepairCafe:
    def __init__(self, submissions):
        self.submissions = Path(submissions)

    def build_version(self):
        for submission in self.submissions.iterdir():
            if ".DS_Store" not in str(submission):
                build_gradle = submission / "build.gradle"
                try:
                    with open(build_gradle, "r") as f:
                        lines = f.readlines()
                except FileNotFoundError as e:
                    print(f"{submission} - Error executing {e}")
                pattern_source = re.compile(r'sourceCompatibility\s*=\s*JavaVersion\.VERSION_(\d+(_\d+)?)')
                replacement_source = 'sourceCompatibility = JavaVersion.VERSION_1_8'
                pattern_target = re.compile(r'targetCompatibility\s*=\s*JavaVersion\.VERSION_(\d+(_\d+)?)')
                replacement_target = 'targetCompatibility = JavaVersion.VERSION_1_8'

                for i, line in enumerate(lines):
                    if pattern_source.search(line):
                        lines[i] = pattern_source.sub(replacement_source, line)
                    if pattern_target.search(line):
                        lines[i] = pattern_target.sub(replacement_target, line)

                with open(build_gradle, "w") as f:
                    f.writelines(lines)

                # change the environmental variable JAVA_HOME to 1.8
                cmd = f"gradle build -x test -p {submission}"
                try:
                    output = subprocess.check_output(cmd, shell=True, text=True)
                except subprocess.CalledProcessError as e:
                    print(f"{submission} - Error executing {e}")


if __name__ == '__main__':
    submissions = "/Users/ruizhengu/Experiments/APR-as-AAT/anonymised-submissions"
    repair_cafe = RepairCafe(submissions)
    repair_cafe.build_version()
