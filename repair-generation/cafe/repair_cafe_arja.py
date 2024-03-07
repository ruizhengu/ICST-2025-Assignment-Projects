import os
import shutil
from pathlib import Path

import utils


class RepairIntroClass:
    def __init__(self):
        self.home_path = Path("/mnt/parscratch/users/acp22rg/APR-as-AAT/IntermediateJava")
        self.submission_list = [submission for submission in self.home_path.iterdir() if
                                submission.is_dir() and submission.name != ".git"]
        self.model_solution = Path("/mnt/parscratch/users/acp22rg/APR-as-AAT/APR4Grade/resource/cafe_java_8")
        self.model_test_suite = self.model_solution / "src/test/java/uk/ac/sheffield/com1003/cafe"
        self._main_path = Path("src/main/java/uk/ac/sheffield/com1003/cafe")
        self._test_path = Path("src/test/java/uk/ac/sheffield/com1003/cafe")

    def replace_build_gradle(self, submission):
        build_gradle_source = self.model_solution / "build.gradle"
        build_gradle_submission = submission / "build.gradle"
        shutil.copy2(build_gradle_source, build_gradle_submission)

    def replace_tests(self, submission):
        destination = submission / self._test_path
        utils.empty_directory(destination)
        if not destination.exists():
            destination.mkdir(parents=True)
        for item in self.model_test_suite.iterdir():
            if item.is_dir():
                shutil.copytree(item, destination / item.name)
            else:
                shutil.copy2(item, destination / item.name)

    def add_default_tests(self, submission):
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

    def compile_submissions(self):
        for submission in self.submission_list:
            self.replace_build_gradle(submission)
            self.add_default_tests(submission)
            chmod = f"chmod +x {submission}/gradlew"
            cmd = f"{submission}/gradlew build -p {submission}"
            # cmd = f"{submission}/gradlew build -x test -p {submission}"
            # self.replace_tests(submission)
            # self.inject_model_solution(submission)
            # self.inject_aspectj(submission)
            try:
                utils.run_cmd(chmod)
                build_output = utils.run_cmd(cmd)
                if "BUILD SUCCESSFUL" not in build_output and "Execution failed for task ':test'." not in build_output:
                    print(submission.name + " BUILD FAILED")
            except Exception as e:
                print(f"{submission} - Error executing {e}")
            print("*" * 5 + f" {submission} compilation finish " + "*" * 5)

    def arja(self):
        for dataset in self.submission_list:
            arja_path = "/mnt/parscratch/users/acp22rg/APR-as-AAT/APR4Grade/arja"
            path_src = dataset / "src"
            path_bin_src = dataset / "target/classes"
            path_bin_test = dataset / "target/test-classes"
            path_dependency = Path("/mnt/parscratch/users/acp22rg/APR-as-AAT/APR4Grade/dependency")
            dependencies = [str(file) for file in path_dependency.glob('**/*.jar') if file.name != ".DS_Store"]
            dependencies = ":".join(dependencies)
            path_output = Path("/mnt/parscratch/users/acp22rg/APR-as-AAT/cafe_arja_default")
            if not path_output.exists():
                os.mkdir(path_output)
            path_output = path_output / dataset.name
            if not path_output.exists():
                os.mkdir(path_output)
            arja_cmd = f"cd {arja_path} && java -cp \"lib/*:bin\" us.msu.cse.repair.Main ArjaE -DsrcJavaDir {path_src} -DbinJavaDir {path_bin_src} -DbinTestDir {path_bin_test} -Ddependences {dependencies} -DpatchOutputRoot {path_output}"
            print("=" * 10 + f" ARJA -> {dataset} " + "=" * 10)
            # print(arja_cmd)
            arja_output = utils.run_cmd(arja_cmd)
            # print(arja_output)


if __name__ == '__main__':
    repair = RepairIntroClass()
    repair.compile_submissions()
    repair.arja()
