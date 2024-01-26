import json
import os
import re
import shutil
import subprocess
import time
from pathlib import Path

import utils


class RepairCafe:
    def __init__(self, submissions):
        self.submissions = Path(submissions)
        self.home_path = Path("/Users/ruizhengu/Projects/APR-as-AAT")
        # self.home_path = Path("/mnt/parscratch/users/acp22rg/APR-as-AAT/APR-as-AAT")
        self.ref_path = self.home_path / "com1003_cafe/com1003_cafe_8"
        self.test_suite = self.ref_path / "src/test/java/uk/ac/sheffield/com1003/cafe"
        self._main_path = Path("src/main/java/uk/ac/sheffield/com1003/cafe")
        self._test_path = Path("src/test/java/uk/ac/sheffield/com1003/cafe")
        self._astor_output = utils.ASTOR_OUTPUT
        self.patch_results = self.home_path / "repair-generation/results/results_cafe.xlsx"
        utils.create_excel(self.patch_results)

    def replace_build_gradle(self, submission):
        build_gradle_source = self.ref_path / "build.gradle"
        build_gradle_submission = submission / "build.gradle"
        shutil.copy2(build_gradle_source, build_gradle_submission)

    def replace_tests(self, submission):
        destination = submission / self._test_path
        utils.empty_directory(destination)
        if not destination.exists():
            destination.mkdir(parents=True)
        for item in self.test_suite.iterdir():
            if item.is_dir():
                shutil.copytree(item, destination / item.name)
            else:
                shutil.copy2(item, destination / item.name)

    def pre_processing(self):
        submission_roots = []
        submissions_list = list(filter(lambda p: ".DS_Store" not in str(p), self.submissions.iterdir()))
        # counter = 0
        # for submission in submissions_list:
        #     counter += 1
        #     print(f"Build submission {submission.name} | {counter} / {len(submissions_list)}")
        #     self.replace_tests(submission)
        #     self.replace_build_gradle(submission)
        #     self.copy_ref(submission)
        #     # change the environmental variable JAVA_HOME to 1.8
        #     chmod = f"chmod +x {submission}/gradlew"
        #     cmd = f"{submission}/gradlew build -x test -p {submission}"
        #     try:
        #         utils.run_cmd(chmod)
        #         utils.run_cmd(cmd)
        #         submission_roots.append(str(submission))
        #     except subprocess.CalledProcessError as e:
        #         print(f"{submission} - Error executing {e}")
        for submission in submissions_list:
            submission_roots.append(str(submission))
        return submission_roots

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

    def copy_ref(self, submission):
        """
        Copy the reference solution folder "solution" to each submission

        :param submission:
        """
        ref_solution = self.ref_path / self._main_path / "solution"
        destination = submission / self._main_path / "solution"
        if destination.exists():
            shutil.rmtree(destination)
        shutil.copytree(ref_solution, destination)

    def repair(self, root, root_index):
        submission_name = root.split('/')[-1]
        utils.run_cmd(f"{root}/gradlew build -p {root}")
        astor_command = f"java -cp /Users/ruizhengu/Experiments/APR-as-AAT/astor/target/astor-*-jar-with-dependencies.jar fr.inria.main.evolution.AstorMain -mode jgenprog -srcjavafolder /src/main/java/ -srctestfolder /src/test/java/ -binjavafolder /build/classes/java/main/ -bintestfolder /build/classes/java/test/ -location {root} -scope global -out {self._astor_output}"
        # astor_command = f"java -cp /mnt/parscratch/users/acp22rg/APR-as-AAT/astor/target/astor-*-jar-with-dependencies.jar fr.inria.main.evolution.AstorMain -mode jgenprog -srcjavafolder /src/main/java/ -srctestfolder /src/test/java/ -binjavafolder /build/classes/java/main/ -bintestfolder /build/classes/java/test/ -location {root} -scope global -out {self._astor_output}"
        utils.run_cmd(astor_command)
        time.sleep(60)
        astor_output = Path(self._astor_output) / f"AstorMain-{submission_name}"
        astor_output_json = astor_output / "astor_output.json"
        try:
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
        except FileNotFoundError as e:
            print(f"File not found: {e}")

    def rename_output(self, astor_output):
        pattern = rf"AstorMain-Cafe-1-(\d+)"
        max_digit = 0
        for file in Path(self._astor_output).iterdir():
            match = re.match(pattern, file.name)
            if match:
                digit = int(match.group(1))
                max_digit = max(max_digit, digit)
        if max_digit > 0:
            new_digit = max_digit + 1
        else:
            new_digit = 1
        new_name = Path(self._astor_output) / f"AstorMain-Cafe-1-{new_digit}"

        if astor_output.exists():
            os.rename(astor_output, new_name)
            return new_name
        return None


if __name__ == '__main__':
    submissions = "/Users/ruizhengu/Experiments/APR-as-AAT/anonymised-submissions"
    # submissions = "/mnt/parscratch/users/acp22rg/APR-as-AAT/anonymised-submissions"
    repair_cafe = RepairCafe(submissions)
    submission_roots = repair_cafe.pre_processing()
    print("Start Repairing")
    # for root_index, root in enumerate(submission_roots, start=1):
    #     repair_cafe.repair(root, root_index)
