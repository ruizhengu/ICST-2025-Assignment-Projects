import os
import shutil
from pathlib import Path

import utils


class RepairIntroClass:
    def __init__(self):
        self.home_path = Path("/Users/ruizhengu/Experiments/APR-as-AAT/model_mutants/Java_7")
        self.submission = [submission for submission in self.home_path.iterdir() if submission.is_dir()]

    def arja(self):
        for dataset in self.submission:
            arja_path = "/Users/ruizhengu/Experiments/APR-as-AAT/arja"
            path_src = dataset / "src"
            path_bin_src = dataset / "target/classes"
            path_bin_test = dataset / "target/test-classes"
            path_dependency = "/Users/ruizhengu/Experiments/APR-as-AAT/dependency/junit-4.11.jar"
            path_output = Path("/Users/ruizhengu/Experiments/APR-as-AAT/arja_cafe_7") / dataset.name
            if not path_output.exists():
                os.mkdir(path_output)
            arja_cmd = f"cd {arja_path} && java -cp \"lib/*:bin\" us.msu.cse.repair.Main ArjaE -DsrcJavaDir {path_src} -DbinJavaDir {path_bin_src} -DbinTestDir {path_bin_test} -Ddependences {path_dependency} -DpatchOutputRoot {path_output}"
            print("=" * 10 + f" ARJA -> {dataset} " + "=" * 10)
            # print(arja_cmd)
            arja_output = utils.run_cmd(arja_cmd)
            # print(arja_output)


if __name__ == '__main__':
    repair = RepairIntroClass()
    repair.arja()
