import json
import os
import re
import shutil
import subprocess
from pathlib import Path

import utils


class RepairCafe:
    def __init__(self, submissions):
        self.submissions = Path(submissions)
        # self.test_suite = Path(
        #     "/Users/ruizhengu/Projects/APR-as-AAT/com1003_cafe/com1003_cafe_8/src/test/java/uk/ac/sheffield/com1003/cafe/junit4")
        self.test_suite = Path(
            "/mnt/parscratch/users/acp22rg/APR-as-AAT/APR-as-AAT/com1003_cafe/com1003_cafe_8/src/test/java/uk/ac/sheffield/com1003/cafe/junit4")
        # self.ref_path = Path("/Users/ruizhengu/Projects/APR-as-AAT/com1003_cafe/com1003_cafe_8")
        self.ref_path = Path("/mnt/parscratch/users/acp22rg/APR-as-AAT/APR-as-AAT/com1003_cafe/com1003_cafe_8")
        self._main_path = Path("src/main/java/uk/ac/sheffield/com1003/cafe")
        self._test_path = Path("src/test/java/uk/ac/sheffield/com1003/cafe")
        self._astor_output = utils.ASTOR_OUTPUT
        # self.patch_results = Path(
        #     "/Users/ruizhengu/Projects/APR-as-AAT/repair-generation/results/results_cafe.xlsx")
        self.patch_results = Path(
            "/mnt/parscratch/users/acp22rg/APR-as-AAT/APR-as-AAT/repair-generation/results/results_cafe.xlsx")
        utils.create_excel(self.patch_results)

    def replace_tests(self, submission):
        destination = submission / "src/test/java/uk/ac/sheffield/com1003/cafe"
        utils.empty_directory(destination)
        destination = destination / "junit4"
        if not destination.exists():
            destination.mkdir(parents=True)
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
                with build_gradle.open("r") as f:
                    content = f.readlines()
                with build_gradle.open("w") as f:
                    for line in content:
                        if "dependencies {" in line:
                            line += "testImplementation 'org.apache.commons:commons-lang3:3.0'\n"
                            line += "testImplementation 'com.github.javaparser:javaparser-core-serialization:3.25.1'\n"
                        f.write(line)

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

    def pre_processing(self):
        ref_classes, ref_tests = self.get_ref()
        submissions_main, submissions_test, roots = self.get_submission()
        self.copy_ref(ref_classes, submissions_main)
        return roots

    def repair(self, root, root_index):
        utils.run_cmd(f"gradle build -p {root}")

        # astor_command = f"java -cp /Users/ruizhengu/Experiments/APR-as-AAT/astor/target/astor-*-jar-with-dependencies.jar fr.inria.main.evolution.AstorMain -mode jgenprog -srcjavafolder /src/main/java/ -srctestfolder /src/test/java/ -binjavafolder /build/classes/java/main/ -bintestfolder /build/classes/java/test/ -location {root} -scope global -out {self._astor_output}"
        astor_command = f"java -cp /mnt/parscratch/users/acp22rg/APR-as-AAT/astor/target/astor-*-jar-with-dependencies.jar fr.inria.main.evolution.AstorMain -mode jgenprog -srcjavafolder /src/main/java/ -srctestfolder /src/test/java/ -binjavafolder /build/classes/java/main/ -bintestfolder /build/classes/java/test/ -location {root} -scope global -out {self._astor_output}"
        utils.run_cmd(astor_command)
        astor_output = self._astor_output / f"AstorMain-{root.split('/')[-1]}"
        astor_output_json = astor_output / "astor_output.json"
        with astor_output_json.open("r") as file:
            patches = json.load(file)["patches"]
        if patches:
            print(f"Patch found - {root}")
            data = {
                # "ID": patch_count,
                "Project": "Cafe",
                "Patch": f"AstorMain-Cafe-{root_index}",
                "Submission": str(root)
            }
            new_path = self.rename_output(astor_output)
            utils.append_excel(self.patch_results, data)
            utils.update_patch_paths(new_path, new_path.name)
            return new_path
        else:
            print(f"No patch found - {root}")
            shutil.rmtree(astor_output)
            return None

    def rename_output(self, astor_output):
        pattern = rf"AstorMain-Cafe-1-(\d+)"
        max_digit = 0
        for file in self._astor_output.iterdir():
            match = re.match(pattern, file.name)
            if match:
                digit = int(match.group(1))
                max_digit = max(max_digit, digit)
        if max_digit > 0:
            new_digit = max_digit + 1
        else:
            new_digit = 1
        new_name = self._astor_output / f"AstorMain-Cafe-1-{new_digit}"

        if astor_output.exists():
            os.rename(astor_output, new_name)
            return new_name
        return None


if __name__ == '__main__':
    # submissions = "/Users/ruizhengu/Experiments/APR-as-AAT/anonymised-submissions"
    submissions = "/mnt/parscratch/users/acp22rg/APR-as-AAT/anonymised-submissions"
    repair_cafe = RepairCafe(submissions)
    roots = repair_cafe.pre_processing()
    repair_cafe.build_version()
    for root_index, root in enumerate(roots, start=1):
        print(f"Processing submission {root_index}/{len(roots)}")
        repair_cafe.repair(root, root_index)
