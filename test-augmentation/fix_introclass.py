import os
import shutil
import subprocess
import json

DATA_PATH = "/Users/ruizhengu/Experiments/APR-as-AAT/IntroClassJava/dataset"
ASTOR_OUTPUT_PATH = "/Users/ruizhengu/Projects/APR-as-AAT/test-augmentation/output_astor"
FIX_OUTPUT = "/Users/ruizhengu/Projects/APR-as-AAT/test-augmentation/results_introclass.txt"

def run_cmd(command):
    return subprocess.Popen(command, shell=True, stdout=subprocess.PIPE).stdout.read()

def save_results(submission):
    with open(FIX_OUTPUT, "a") as f:
        f.write(submission + "\n")
        f.close()

def get_ref(dataset):
    ref = os.path.join(dataset, "ref")
    classes = []
    tests = []
    classes_path = os.path.join("reference", "src", "main", "java", "introclassJava")
    tests_path = os.path.join("reference", "src", "test", "java", "introclassJava")
    if os.path.isdir(ref):
        classes = [os.path.join(ref, classes_path, _) for _ in os.listdir(os.path.join(ref, classes_path))]
        tests = [os.path.join(ref, tests_path, _) for _ in os.listdir(os.path.join(ref, tests_path))]
    return classes, tests

def replace_package(file):
    with open(file, "r") as f:
        content = f.readlines()
        for line in content:
            if line.startswith("package introclassJava;"):
                index = content.index(line)
                content[index] = "package introclassJava.solution;\n"
    with open(file, "w") as f:
        f.writelines(content)

def import_package(file):
    with open(file, "r") as f:
        content = f.readlines()
        for line in content:
            if line.startswith("import org.junit.Test;"):
                index = content.index(line)
                content[index] = "import org.junit.Test;\nimport introclassJava.solution.*;\n"
    with open(file, "w") as f:
        f.writelines(content)

def get_submissions(dataset):
    submissions_main = []
    submissions_test = []
    roots = []
    main_path = os.path.join("src", "main", "java", "introclassJava")
    test_path = os.path.join("src", "test", "java", "introclassJava")
    for sub in os.listdir(dataset):
            sub_dir = os.path.join(dataset, sub)
            if os.path.isdir(sub_dir) and sub != "ref":
                for subsub in os.listdir(sub_dir):
                    subsub_dir = os.path.join(sub_dir, subsub)
                    if os.path.isdir(subsub_dir):
                        roots.append(subsub_dir)
                        submissions_main.append(os.path.join(subsub_dir, main_path))
                        submissions_test.append(os.path.join(subsub_dir, test_path))
    return submissions_main, submissions_test, roots

def copy_ref(ref_classes, ref_tests, submissions_main, submissions_test):
    # classes
    for ref_class in ref_classes:
        file_name = ref_class.split("/")[-1]
        for submission_main in submissions_main:
            if not os.path.exists(os.path.join(submission_main, "solution")):
                os.mkdir(os.path.join(submission_main, "solution"))
            target_name = os.path.join(submission_main, "solution", file_name)
            shutil.copy(ref_class, target_name)
            replace_package(target_name)
    # test classes
    for ref_test in ref_tests:
        file_name = ref_test.split("/")[-1]
        for submission_test in submissions_test:
            target_name = os.path.join(submission_test, file_name)
            shutil.copy(ref_test, target_name)
            import_package(target_name)


for dataset in os.listdir(DATA_PATH):
    dataset_path = os.path.join(DATA_PATH, dataset)
    if os.path.isdir(dataset_path):
        # reference solution
        ref_classes, ref_tests = get_ref(dataset_path)
        # individual submissions
        submissions_main, submissions_test, roots = get_submissions(dataset_path)
        # copy reference solution to each individual submission
        # copy_ref(ref_classes, ref_tests, submissions_main, submissions_test)
        # build and test submissions
        for root in roots:
            # print(run_cmd(f"mvn -f {root} compile"))
            # print(run_cmd(f"mvn -f {root} test"))
            astor_command = f"java -cp /Users/ruizhengu/Experiments/APR-as-AAT/astor/target/astor-*-jar-with-dependencies.jar fr.inria.main.evolution.AstorMain -mode jgenprog -srcjavafolder /src/main/java/ -srctestfolder /src/test/java/  -binjavafolder /target/classes/ -bintestfolder /target/test-classes/ -location {root} -scope global"
            # print(astor_command)
            # print(run_cmd(astor_command))
            run_cmd(astor_command)
            astor_output = os.path.join(ASTOR_OUTPUT_PATH, f"AstorMain-{root.split('/')[-1]}", "astor_output.json")
            patches = json.load(open(astor_output))["patches"]
            if (len(patches) != 0):
                print(f"Patch found - {root}")
                save_results(root)
            else:
                print(f"No patche found - {root}")

