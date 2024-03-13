from pathlib import Path


class MethodCoverage:
    def __init__(self):
        self.root = Path("/Users/ruizhengu/Projects")
        # self.root = Path("/mnt/parscratch/users/acp22rg/APR")
        self.project_home = self.root / "APR4Grade"
        self.dataset_home = self.root / "IntermediateJava/incorrect_submissions"
        self.model_solution = self.root / "IntermediateJava/model_solution"
        self.model_test_suite = self.model_solution / "src/test/java/uk/ac/sheffield/com1003/cafe"
        self.submission_list = [submission for submission in self.dataset_home.iterdir() if
                                submission.is_dir() and submission.name != ".git"]

        self.methods = self.get_model_methods()

        self.method_file_json = self.project_home / "resource/method_files.json"
        self.method_coverage_json = self.project_home / "resource/lib/method_coverage.json"

    def get_model_methods(self):
        methods_txt = self.project_home / "resource/methods.txt"
        with open(methods_txt, "r") as f:
            methods = f.readlines()
        deduplicate = set(methods)
        return [m.replace("\n", "") for m in deduplicate]

    def get_method_coverage(self, test_method_calls):
        method_coverage = {}
        for method in self.methods:
            data = {}
            tests = []
            for test, method_calls in test_method_calls.items():
                for call in method_calls:
                    if method in call:
                        tests.append(test)
            data["tests"] = tests
            data["num"] = len(tests)
            method_coverage[method] = data
        return method_coverage