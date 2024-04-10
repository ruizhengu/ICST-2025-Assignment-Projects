import json
import os.path
import re
import shutil
import sys
from pathlib import Path
from cream import utils


class Processing:
    def __init__(self):
        if sys.platform == "linux":
            self.root = Path("/mnt/parscratch/users/acp22rg/APR")
        else:
            self.root = Path("/Users/ruizhengu/Projects")
        self.project_home = self.root / "APR4Grade"
        self.dataset_home = self.root / "IntermediateJava/incorrect_submissions"
        self.model_solution = self.root / "IntermediateJava/model_solution"
        self.model_test_suite = self.model_solution / "src/test/java/uk/ac/sheffield/com1003/cafe"
        self.submission_list = [submission for submission in self.dataset_home.iterdir() if
                                submission.is_dir() and submission.name != ".git"]
        self._main_path = Path("src/main/java/uk/ac/sheffield/com1003/cafe")
        self._test_path = Path("src/test/java/uk/ac/sheffield/com1003/cafe")
        self.failed_tests_json = self.project_home / "resource/failed_tests.json"
        self.failed_tests_data = {}

    def replace_build_gradle(self, submission):
        build_gradle_source = self.model_solution / "build.gradle"
        build_gradle_submission = submission / "build.gradle"
        shutil.copy2(build_gradle_source, build_gradle_submission)

    def compile_submissions(self):
        for submission in self.submission_list:
            # self.replace_build_gradle(submission)
            self.replace_tests(submission)
            # self.replace_tests_with_solution(submission)
            chmod = f"chmod +x {submission}/gradlew"
            cmd = f"{submission}/gradlew build -p {submission}"
            # self.inject_model_solution(submission)
            # self.inject_aspectj(submission)
            try:
                utils.run_cmd(chmod)
                build_output = utils.run_cmd(cmd)
                if "BUILD SUCCESSFUL" not in build_output and "Execution failed for task ':test'." not in build_output:
                    print(submission.name + " BUILD FAILED")
                # else:
                #     self.get_failed_tests_gradle(submission, build_output)
            except Exception as e:
                print(f"{submission} - Error executing {e}")

    def replace_tests_with_solution(self, submission):
        destination = submission / self._test_path
        utils.empty_directory(destination)
        if not destination.exists():
            destination.mkdir(parents=True)
        for item in self.model_test_suite.iterdir():
            if item.is_dir():
                shutil.copytree(item, destination / item.name)
            else:
                shutil.copy2(item, destination / item.name)

    def replace_tests(self, submission):
        destination = submission / self._test_path
        utils.empty_directory(destination)
        if not destination.exists():
            destination.mkdir(parents=True)
        for item in self.model_test_suite.iterdir():
            if item.is_file():
                shutil.copy2(item, destination / item.name)

    def inject_model_solution(self, submission):
        model_solution = self.model_solution / self._main_path / "solution"
        destination = submission / self._main_path / "solution"
        if destination.exists():
            shutil.rmtree(destination)
        shutil.copytree(model_solution, destination)

    def inject_aspectj(self, submission):
        model_solution = self.model_solution / "src/main/java/aspect"
        destination = submission / "src/main/java/aspect"
        if destination.exists():
            shutil.rmtree(destination)
        shutil.copytree(model_solution, destination)

    def get_failed_tests_gradle(self, submission, gradle_output):
        pattern = r"(\d+) tests completed, (\d+) failed"
        match = re.search(pattern, gradle_output)
        if match:
            failed_tests = int(match.group(2))
            self.failed_tests_data[submission.name] = failed_tests
            with open(self.failed_tests_json, "w") as f:
                f.write(json.dumps(self.failed_tests_data, indent=4))
        else:
            print(f"{submission.name} pattern was not found in the text.")

    def add_missed_classes(self):
        for submission in self.submission_list:
            classes = {
                "app": {
                    "submission": submission / "src/main/java/uk/ac/sheffield/com1003/cafe/App.java",
                    "model": self.model_solution / "src/main/java/uk/ac/sheffield/com1003/cafe/App.java"
                },
                "syrup": {
                    "submission": submission / "src/main/java/uk/ac/sheffield/com1003/cafe/ingredients/Syrup.java",
                    "model": self.model_solution / "src/main/java/uk/ac/sheffield/com1003/cafe/ingredients/Syrup.java"
                },
                "exception_cafe": {
                    "submission": submission / "src/main/java/uk/ac/sheffield/com1003/cafe/exceptions/CafeOutOfCapacityException.java",
                    "model": self.model_solution / "src/main/java/uk/ac/sheffield/com1003/cafe/exceptions/CafeOutOfCapacityException.java"
                },
                "exception_recipe": {
                    "submission": submission / "src/main/java/uk/ac/sheffield/com1003/cafe/exceptions/RecipeNotFoundException.java",
                    "model": self.model_solution / "src/main/java/uk/ac/sheffield/com1003/cafe/exceptions/RecipeNotFoundException.java"
                },
                "exception_ingredients": {
                    "submission": submission / "src/main/java/uk/ac/sheffield/com1003/cafe/exceptions/TooManyIngredientsException.java",
                    "model": self.model_solution / "src/main/java/uk/ac/sheffield/com1003/cafe/exceptions/TooManyIngredientsException.java"
                }
            }

            for clazz, clazz_path in classes.items():
                if not clazz_path["submission"].exists():
                    print(f"Submission {submission.name} > class {clazz} not exist")
                    shutil.copy2(clazz_path["model"], clazz_path["submission"])

    def replace_exception_classes(self):
        for submission in self.submission_list:
            exceptions = {
                "exception_cafe": {
                    "submission": submission / "src/main/java/uk/ac/sheffield/com1003/cafe/exceptions/CafeOutOfCapacityException.java",
                    "model": self.model_solution / "src/main/java/uk/ac/sheffield/com1003/cafe/exceptions/CafeOutOfCapacityException.java"
                },
                "exception_recipe": {
                    "submission": submission / "src/main/java/uk/ac/sheffield/com1003/cafe/exceptions/RecipeNotFoundException.java",
                    "model": self.model_solution / "src/main/java/uk/ac/sheffield/com1003/cafe/exceptions/RecipeNotFoundException.java"
                },
                "exception_ingredients": {
                    "submission": submission / "src/main/java/uk/ac/sheffield/com1003/cafe/exceptions/TooManyIngredientsException.java",
                    "model": self.model_solution / "src/main/java/uk/ac/sheffield/com1003/cafe/exceptions/TooManyIngredientsException.java"
                }
            }
            for clazz, clazz_path in exceptions.items():
                if clazz_path["submission"].exists():
                    clazz_path["submission"].unlink()
                    shutil.copy2(clazz_path["model"], clazz_path["submission"])

    def replace_exceptions(self):
        for submission in self.submission_list:
            files = [
                submission / "src/main/java/uk/ac/sheffield/com1003/cafe/App.java",
                submission / "src/main/java/uk/ac/sheffield/com1003/cafe/Cafe.java",
                submission / "src/main/java/uk/ac/sheffield/com1003/cafe/Order.java",
                submission / "src/main/java/uk/ac/sheffield/com1003/cafe/Recipe.java",
            ]
            exception_pattern = re.compile(
                r'(CafeOutOfCapacityException|RecipeNotFoundException|TooManyIngredientsException)\([^)]*\)')
            for file in files:
                with open(file) as f:
                    code = f.read()
                modified_code_string = re.sub(exception_pattern, r'\1()', code)
                if modified_code_string != code:
                    with open(file, "w") as f:
                        f.write(modified_code_string)
                    print(f"Updated exceptions in {file}")

    def reset_submission(self):
        """
        Remove the model solution
        Remove the model test suite
        Remove AspectJ and method-executions.log
        """
        for submission in self.submission_list:
            # Remove the model solution
            model_solution = submission / self._main_path / "solution"
            if model_solution.exists():
                shutil.rmtree(model_solution)
            # Remove the model test suite
            model_test = submission / self._test_path / "solution"
            if model_test.exists():
                shutil.rmtree(model_test)
            # Remove AspectJ
            aspect_j = submission / "src/main/java/aspect"
            if aspect_j.exists():
                shutil.rmtree(aspect_j)
            # remove method execution log
            log = submission / "method-executions.log"
            if os.path.exists(log):
                os.remove(log)
            test_cmd = f"{submission}/gradlew build -p {submission}"
            # utils.run_cmd(test_cmd)
            # try:
            #     build_output = utils.run_cmd(test_cmd)
            #     if "BUILD SUCCESSFUL" not in build_output and "Execution failed for task ':test'." not in build_output:
            #         print(submission.name + " BUILD FAILED")
            # except Exception as e:
            #     print(f"{submission} - Error executing {e}")

    def replace_gitignore(self):
        for submission in self.submission_list:
            model_gitignore = self.model_solution / ".gitignore"
            submission_gitignore = submission / ".gitignore"
            if submission_gitignore.exists():
                submission_gitignore.unlink()
            shutil.copy(model_gitignore, submission_gitignore)


if __name__ == '__main__':
    p = Processing()
    # p.compile_submissions()
    p.reset_submission()
