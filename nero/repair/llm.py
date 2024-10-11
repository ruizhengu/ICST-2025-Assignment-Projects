from pathlib import Path

import ollama


class LLMRepair:
    def __init__(self):
        pass

    def repair_results(self):
        response = ollama.generate(
            model="qwen2.5-coder:7b-instruct",
            prompt="why is the sky blue?"
        )

        print(response["response"])

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
    l.count_repairs()
