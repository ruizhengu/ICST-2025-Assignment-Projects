import json
from pathlib import Path

import ollama


class LLMRepair:
    def __init__(self):
        self.root = Path("/Users/ruizhengu/Projects")
        self.project_home = self.root / "NERO"
        self.dataset = Path("/Users/ruizhengu/Experiments/intermediates_llm")
        self.method_file_json = self.project_home / "resource/method_files.json"


    def repair_results(self):
        response = ollama.generate(
            model="qwen2.5-coder:7b-instruct",
            prompt="why is the sky blue?"
        )

        print(response["response"])

    def get_class_content(self, solution, method_path):
        with open(solution / method_path, "r") as f:
            class_content = f.read()
        return class_content

    def get_failing_tests(self):
        pass

    def get_error_message(self):
        pass

    def get_model_solutions(self):
        pass

    def generate_prompt(self, intermediate):
        method_path = self.get_method_path(intermediate.name)
        class_content = self.get_class_content(intermediate, method_path)

    def get_method_path(self, method_name):
        with open(self.method_file_json) as f:
            d = json.load(f)
        return d[method_name]

    def repair(self, submission):
        intermediate_submission = self.dataset / submission
        for intermediate in intermediate_submission.iterdir():
            if intermediate.is_dir():
                self.generate_prompt(intermediate)
                # method_path = self.get_method_path(intermediate.name)
                # self.generate_prompt(submission, method_path)

    def count_repairs(self):
        purged_count = 0
        fixed_submissions = 0
        fixed_bugs = 0
        purged_path = Path("/Users/ruizhengu/Experiments/intermediates")
        purged_submissions = (_ for _ in purged_path.iterdir() if _.is_dir())
        for submission in purged_submissions:
            fully_patched = True
            fix_tmps = (_ for _ in submission.iterdir() if _.is_dir())
            for tmp in fix_tmps:
                purged_count += 1
                # check if there is any patch within the buggy method
                if not any(tmp.iterdir()):
                    fully_patched = False
                # count how many methods have a patch
                else:
                    fixed_bugs += 1
            if fully_patched:
                fixed_submissions += 1
        print(f"number of purged solutions: {purged_count}")
        print(f"number of fully fixed submissions: {fixed_submissions}")
        print(f"number of fixed buggy methods: {fixed_bugs}")


if __name__ == '__main__':
    l = LLMRepair()
    # l.repair_results()
    # l.count_repairs()
    l.repair("1")