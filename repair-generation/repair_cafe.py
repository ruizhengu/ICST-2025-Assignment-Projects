import re
import shutil
import subprocess
from pathlib import Path

import utils


class RepairCafe:
    def __init__(self, submissions):
        self.submissions = Path(submissions)
        self.test_suite = Path(
            "/Users/ruizhengu/Projects/APR-as-AAT/com1003_cafe/com1003_cafe_8/src/test/java/uk/ac/sheffield/com1003/cafe/junit4")
        self.ref_path = Path("/Users/ruizhengu/Projects/APR-as-AAT/com1003_cafe/com1003_cafe_8")
        self._main_path = Path("src/main/java/uk/ac/sheffield/com1003/cafe")
        self._test_path = Path("src/test/java/uk/ac/sheffield/com1003/cafe")

    def replace_tests(self, submission):
        destination = submission / "src/test/java/uk/ac/sheffield/com1003/cafe"
        utils.empty_directory(destination)

        for item in self.test_suite.iterdir():
            if item.is_dir():
                shutil.copytree(item, destination / item.name)
            else:
                shutil.copy2(item, destination / item.name)

    def build_version(self):
        for submission in self.submissions.iterdir():
            if ".DS_Store" not in str(submission):
                self.replace_tests(submission)
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

    def get_ref(self):
        classes = []
        tests = []
        for clazz in (self.ref_path / self._main_path).rglob('*.java'):
            classes.append(clazz)
        for test in (self.ref_path / self._test_path).rglob('*.java'):
            tests.append(test)
        return classes, tests

    def get_submission(self):
        submissions_main = []
        submissions_test = []
        roots = []
        submission_dirs = [d for d in self.submissions.iterdir() if d.is_dir() and d.name != ".DS_Store"]

        for sub_dir in submission_dirs:
            roots.append(str(sub_dir))
            submissions_main.append(sub_dir / self._main_path)
            submissions_test.append(sub_dir / self._test_path)
        return submissions_main, submissions_test, roots

    def copy_ref(self, ref_classes, submissions_main):
        for ref_class in ref_classes:
            file_name = ref_class.name
            regex = re.compile(r'/(exceptions|ingredients)/[^/]+\.java$')
            match = regex.search(str(ref_class))
            for submission_main in submissions_main:
                solution_dir = submission_main / "solution"
                if not solution_dir.exists():
                    solution_dir.mkdir(parents=True)
                # utils.empty_directory(solution_dir)
                if match:
                    target_name = solution_dir / match.group(1)
                    if not target_name.exists():
                        target_name.mkdir(parents=True)
                    target_name = target_name / file_name
                else:
                    target_name = solution_dir / file_name
                shutil.copy(ref_class, target_name)
                utils.replace_package(target_name, "uk.ac.sheffield.com1003.cafe",
                                      "uk.ac.sheffield.com1003.cafe.solution")


if __name__ == '__main__':
    submissions = "/Users/ruizhengu/Experiments/APR-as-AAT/anonymised-submissions"
    repair_cafe = RepairCafe(submissions)
    ref_classes, ref_tests = repair_cafe.get_ref()
    submissions_main, submissions_test, roots = repair_cafe.get_submission()
    repair_cafe.copy_ref(ref_classes, submissions_main)
    repair_cafe.build_version()
