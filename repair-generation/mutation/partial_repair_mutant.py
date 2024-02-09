import shutil
from pathlib import Path

import utils
from repair_mutant import RepairMutant


class PartialRepairMutant:
    def __init__(self):
        # self.mutants = "/Users/ruizhengu/Experiments/APR-as-AAT/model_mutants"
        self.mutants = "/mnt/parscratch/users/acp22rg/APR-as-AAT//model_mutants"

        # self.home_path = Path("/Users/ruizhengu/Projects/APR-as-AAT")
        self.home_path = Path("/mnt/parscratch/users/acp22rg/APR-as-AAT/APR-as-AAT")

        # self.astor_output = "/Users/ruizhengu/Projects/APR-as-AAT/repair-generation/results/output_astor"
        self.astor_output = "/mnt/parscratch/users/acp22rg/APR-as-AAT/APR-as-AAT/repair-generation/results/output_astor"

        self.repair_mutant = RepairMutant(self.mutants, self.home_path, self.astor_output)
        self.mutant_roots = self.repair_mutant.pre_processing()

        self.home_repair = self.home_path / "repair-generation"
        self._backup_bin = self.home_repair / "lib/test-tmp/bin"
        self._backup_src = self.home_repair / "lib/test-tmp/src"
        self._src_test = "src/test/java/uk/ac/sheffield/com1003/cafe"
        self._bin_test = "build/classes/java/test/uk/ac/sheffield/com1003/cafe"

        self.patch_results = self.home_path / "repair-generation/results/results_mutant.xlsx"
        utils.create_excel(self.patch_results)

    def partial_repair(self):
        for index, mutant in enumerate(self.mutant_roots, start=1):
            mutant_name = mutant.split('/')[-1]
            positive_tests, negative_tests, num_tests = utils.gradle_get_tests(mutant)
            if len(negative_tests) == 0:
                print("=" * 10 + f" No Negative Tests > {mutant_name} " + "=" * 10)
                continue
            if len(negative_tests) > 0:
                print("=" * 10 + f" Partial Repair Start > {mutant_name} " + "=" * 10)
                print(f"Number of Negative Tests: {len(negative_tests)}")
                self.empty_backup()
                # Put all negative tests in the backup folders
                for test in negative_tests:
                    self.test_backup(mutant, test)
                for test_index, test in enumerate(negative_tests, start=1):
                    # Put negative tests in the proje
                    self.move_test(mutant, test)
                    patch = self.repair_mutant.repair(mutant)
                    if patch == f"No suspicious line > Mutant {mutant_name} > Test {test}":
                        print("No suspicious line")
                        continue
                    elif patch is not None:
                        utils.apply_patch(patch / "astor_output.json")
                    else:
                        # Drop the failed test, put it to the backup,
                        # Checking number of negative tests after partial repair
                        self.test_backup(mutant, test)
                    positive_tests_intermediate, _, _ = utils.gradle_get_tests(mutant)
                    self.save_patch_results(mutant_name, patch, len(positive_tests_intermediate), num_tests)
            # Get the number of negative tests to check if partial repair works
            self.restore_backup(mutant)
            _, negative_tests_repaired, _ = utils.gradle_get_tests(mutant)
            if len(negative_tests_repaired) == 0:
                print(f"Partial Repair - Fixed > Mutant {mutant_name}")
            elif len(negative_tests_repaired) < len(negative_tests):
                print(f"Partial Repair - Improved > Mutant {mutant_name}")
            else:
                print(f"Partial Repair - Failed > Mutant {mutant}")

    def restore_backup(self, mutant):
        backup_src = self.home_repair / self._backup_src
        backup_bin = self.home_repair / self._backup_bin
        for src in backup_src.iterdir():
            if src.name.endswith(".java"):
                source_src = Path(mutant) / self._src_test / src
                shutil.move(backup_src, source_src)
        for _bin in backup_bin.iterdir():
            if _bin.name.endswith(".class"):
                source_bin = Path(mutant) / self._bin_test / _bin
                shutil.move(backup_bin, source_bin)

    def save_patch_results(self, mutant_name, patch, positive_tests, num_tests):
        if patch is None:
            patch = "None"
        data = {
            "Project": "Cafe",
            "Mutant": mutant_name,
            "Patch": str(patch).split('/')[-1],
            "Passed Tests": f"{positive_tests} / {num_tests}"
        }
        utils.append_excel(self.patch_results, data)

    def empty_backup(self):
        backup_src = self.home_repair / self._backup_src
        backup_bin = self.home_repair / self._backup_bin
        utils.empty_directory(backup_src, ".gitkeep")
        utils.empty_directory(backup_bin, ".gitkeep")

    def test_backup(self, mutant, test):
        source_src = Path(mutant) / self._src_test / f"{test}.java"
        source_bin = Path(mutant) / self._bin_test / f"{test}.class"
        backup_src = self.home_repair / self._backup_src / f"{test}.java"
        backup_bin = self.home_repair / self._backup_bin / f"{test}.class"
        shutil.move(source_src, backup_src)
        shutil.move(source_bin, backup_bin)

    def delete_test(self, mutant, test):
        test_src = Path(mutant) / self._src_test / f"{test}.java"
        test_bin = Path(mutant) / self._bin_test / f"{test}.class"
        test_src.unlink()
        test_bin.unlink()

    def move_test(self, mutant, test):
        source_src = Path(mutant) / self._src_test / f"{test}.java"
        source_bin = Path(mutant) / self._bin_test / f"{test}.class"
        backup_src = self.home_repair / self._backup_src / f"{test}.java"
        backup_bin = self.home_repair / self._backup_bin / f"{test}.class"
        shutil.move(backup_src, source_src)
        shutil.move(backup_bin, source_bin)


if __name__ == '__main__':
    repair = PartialRepairMutant()
    repair.partial_repair()
