class PartialRepair:
    def __init__(self, root):
        self.root = root

    def get_tests(self):
        cmd = f"mvn -f {self.root} test | grep 'Tests run:.*Failures:.*Errors:'"


if __name__ == '__main__':
    root = "/Users/ruizhengu/Experiments/APR-as-AAT/IntroClassJava/dataset/checksum/2c1556672751734adf9a561fbf88767c32224fca14a81e9d9c719f18d0b21765038acc16ecd8377f74d4f43e8c844538161d869605e3516cf797d0a6a59f1f8e/003"
