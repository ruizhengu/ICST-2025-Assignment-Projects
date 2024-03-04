import re
import shutil
import subprocess
from pathlib import Path
import xml.etree.ElementTree as ET
import utils


class CafeProcessing:
    def __init__(self):
        self.submission_path = Path("/Users/ruizhengu/Experiments/APR-as-AAT/anonymised-submissions")
        self.model_solution = Path("/Users/ruizhengu/Projects/APR-as-AAT/resource/cafe_java_8")
        self.model_test_suite = self.model_solution / "src/test/java/uk/ac/sheffield/com1003/cafe"
        self.submission_list = list(filter(lambda p: ".DS_Store" not in str(p), self.submission_path.iterdir()))
        self._main_path = Path("src/main/java/uk/ac/sheffield/com1003/cafe")
        self._test_path = Path("src/test/java/uk/ac/sheffield/com1003/cafe")

    def replace_build_gradle(self, submission):
        build_gradle_source = self.model_solution / "build.gradle"
        build_gradle_submission = submission / "build.gradle"
        shutil.copy2(build_gradle_source, build_gradle_submission)

    def compile_submissions(self):
        for submission in self.submission_list:
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

    def replace_tests(self):
        for submission in self.submission_list:
            destination = submission / self._test_path
            utils.empty_directory(destination)
            if not destination.exists():
                destination.mkdir(parents=True)
            for item in self.model_test_suite.iterdir():
                if item.is_dir():
                    shutil.copytree(item, destination / item.name)
                else:
                    shutil.copy2(item, destination / item.name)
            print(submission)
            break

    def inject_model_solution(self):
        for submission in self.submission_list:
            model_solution = self.model_solution / self._main_path / "solution"
            destination = submission / self._main_path / "solution"
            if destination.exists():
                shutil.rmtree(destination)
            shutil.copytree(model_solution, destination)
            break

    def get_failed_tests(self):
        for submission in self.submission_list:
            # test_cmd = f"{submission}/gradlew build -p {submission}"
            # output = utils.run_cmd(test_cmd)
            # print(output)
            # break
            test_cmd = f"{submission}/gradlew build -p {submission}"
            test_output = utils.run_cmd(test_cmd)
            list_cmd = f"{submission}/gradlew listFailedTests -p {submission}"
            output = utils.run_cmd(list_cmd)
            pattern = r"^(.+::\w+)$"
            # Extracting all matches
            failed_tests = re.findall(pattern, output, re.MULTILINE)
            print(failed_tests)
            print(len(failed_tests))
            break

    def parse_jacoco_report(self, report):
        tree = ET.parse(report)
        root = tree.getroot()

        # Define a dictionary to hold coverage data
        coverage_data = {}

        # Iterate over all classes in the report
        for class_element in root.findall(".//class"):
            class_name = class_element.get('name').replace('/', '.')
            methods = class_element.findall('method')
            coverage_data[class_name] = []

            # Iterate over all methods in the class
            for method in methods:
                method_name = method.get('name')
                line_coverage = method.find('counter[@type="LINE"]')

                if line_coverage is not None:
                    covered_lines = line_coverage.get('covered')
                    total_lines = line_coverage.get('missed') + covered_lines
                    coverage_data[class_name].append({
                        'method_name': method_name,
                        'covered_lines': covered_lines,
                        'total_lines': total_lines
                    })
        print(coverage_data)
        # return coverage_data


if __name__ == '__main__':
    p = CafeProcessing()
    # p.compile_submissions()
    # p.replace_tests()
    # p.inject_model_solution()
    # p.get_failed_tests()
    p.parse_jacoco_report("/Users/ruizhengu/Projects/APR-as-AAT/resource/cafe_java_8/build/JacocoReport/test/html/index.html")
