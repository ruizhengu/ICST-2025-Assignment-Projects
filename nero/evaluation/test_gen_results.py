from pathlib import Path


class TestGen:
    def __init__(self):
        self.root = Path("/Users/ruizhengu/Projects")
        self.project_home = self.root / "NERO"
        self.generated_tests_path = self.project_home / "resource/test_gen"
        self.generated_tests = list(self.generated_tests_path.rglob("*"))
        self.dataset_home = self.root / "IntermediateJava/incorrect_submissions"

    def replace_tests(self):
        pass

if __name__ == '__main__':
    test_gen = TestGen()