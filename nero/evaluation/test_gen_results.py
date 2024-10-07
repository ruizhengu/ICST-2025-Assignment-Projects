from pathlib import Path
from utils import *


class TestGen:
    def __init__(self):
        self.root = Path("/Users/ruizhengu/Projects")
        self.project_home = self.root / "NERO"
        self.generated_tests_path = self.project_home / "resource/test_gen"
        self.generated_tests = list(self.generated_tests_path.rglob("*"))
        self.dataset_home = Path("/Users/ruizhengu/Experiments/incorrect_submissions")

    def replace_tests(self):
        for submission in self.dataset_home.iterdir():
            if submission.is_dir():
                submission_test = submission / "src/test/java"
                empty_directory(submission_test)

                for generated_test in self.generated_tests_path.rglob("*"):
                    target_path = submission_test / generated_test.relative_to(self.generated_tests_path)

                    if generated_test.is_dir():
                        target_path.mkdir(parents=True, exist_ok=True)
                    else:
                        target_path.parent.mkdir(parents=True, exist_ok=True)
                        shutil.copy2(generated_test, target_path)

    def check_compilation(self):
        for submission in self.dataset_home.iterdir():
            if submission.is_dir():
                chmod = f"chmod +x {submission}/gradlew"
                cmd = f"{submission}/gradlew clean build -p {submission}"
                try:
                    run_cmd(chmod)
                    build_output = run_cmd(cmd)
                    if "BUILD SUCCESSFUL" not in build_output and "Execution failed for task ':test'." not in build_output:
                        print(f"{submission} - BUILD FAILED")
                    elif "BUILD SUCCESSFUL" in build_output and "Execution failed for task ':test'." not in build_output:
                        shutil.rmtree(submission)
                except Exception as e:
                    print(f"{submission} - Error executing {e}")

    def get_buggy_methods(self):
        pass


if __name__ == '__main__':
    test_gen = TestGen()
    test_gen.replace_tests()
    test_gen.check_compilation()
