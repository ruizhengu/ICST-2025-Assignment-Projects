import os
import shutil
import subprocess
import json
import uuid

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
    classes_path = os.path.join("reference", "src", "main", "java", "introclassJava")
    if os.path.isdir(ref):
        classes = [os.path.join(ref, classes_path, _) for _ in os.listdir(os.path.join(ref, classes_path))]
    return classes

def get_submissions(dataset):
    submissions_main = []
    roots = []
    main_path = os.path.join("src", "main", "java", "introclassJava")
    for sub in os.listdir(dataset):
            sub_dir = os.path.join(dataset, sub)
            if os.path.isdir(sub_dir) and sub != "ref":
                for subsub in os.listdir(sub_dir):
                    subsub_dir = os.path.join(sub_dir, subsub)
                    if os.path.isdir(subsub_dir):
                        roots.append(subsub_dir)
                        submissions_main.append(os.path.join(subsub_dir, main_path))
    return submissions_main, roots

def replace_package(file, extra):
    with open(file, "r") as f:
        content = f.readlines()
        for line in content:
            if line.startswith("package introclassJava;"):
                index = content.index(line)
                content[index] = f"package introclassJava.{extra};\n"
    with open(file, "w") as f:
        f.writelines(content)

def copy_refs(refs, submission):
    if not os.path.exists(os.path.join(submission, "solution")):
        os.mkdir(os.path.join(submission, "solution"))
    for ref in refs:
        file_name = ref.split("/")[-1]
        target_name = os.path.join(submission, "solution", file_name)
        shutil.copy(ref, target_name)
        replace_package(target_name, "solution")

def copy_submissions(total_space, submission):
    if not os.path.exists(os.path.join(submission, "pool")):
        os.mkdir(os.path.join(submission, "pool"))
    for space in total_space:
        package_id = "".join([_ for _ in space.split("/")[8] if not _.isdigit()])
        package_index = "".join([_ for _ in uuid.uuid4().hex if not _.isdigit()])
        if not os.path.exists(os.path.join(submission, "pool", package_id)):
            os.mkdir(os.path.join(submission, "pool", package_id))
        if not os.path.exists(os.path.join(submission, "pool", package_id, package_index)):
            os.mkdir(os.path.join(submission, "pool", package_id, package_index))
        for classes in os.listdir(space):
            if classes.endswith(".java"):
                file_name = classes.split("/")[-1]
                target_name = os.path.join(submission, "pool", package_id, package_index, file_name)
                shutil.copy(os.path.join(space, classes), target_name)
                replace_package(target_name, f"pool.{package_id}.{package_index}")

def create_pool(ref_classes, submissions_main):
    for submission in submissions_main:
        copy_refs(ref_classes, submission)
        copy_submissions(submissions_main, submission)


for dataset in os.listdir(DATA_PATH):
    dataset_path = os.path.join(DATA_PATH, dataset)
    if os.path.isdir(dataset_path):
        # reference solution
        ref_classes = get_ref(dataset_path)
        # individual submissions
        submissions_main, roots = get_submissions(dataset_path)
        # print(submissions_main)
        # create_pool(ref_classes, submissions_main)
        for root in roots:
            # print(run_cmd(f"mvn -f {root} compile"))
            # run_cmd(f"mvn -f {root} test")
            # astor_command = f"java -cp /Users/ruizhengu/Experiments/APR-as-AAT/astor/target/astor-*-jar-with-dependencies.jar fr.inria.main.evolution.AstorMain -mode jgenprog -srcjavafolder /src/main/java/ -srctestfolder /src/test/java/  -binjavafolder /target/classes/ -bintestfolder /target/test-classes/ -location {root} -scope global"
            astor_command = f"java -cp /Users/ruizhengu/Experiments/APR-as-AAT/astor/target/astor-*-jar-with-dependencies.jar fr.inria.main.evolution.AstorMain -mode jgenprog -srcjavafolder /src/main/java/ -srctestfolder /src/test/java/  -binjavafolder /target/classes/ -bintestfolder /target/test-classes/ -location {root} -scope global -mode cardumen"
            run_cmd(astor_command)
            astor_output = os.path.join(ASTOR_OUTPUT_PATH, f"AstorMain-{root.split('/')[-1]}", "astor_output.json")
            patches = json.load(open(astor_output))["patches"]
            if (len(patches) != 0):
                print(f"Patch found - {root}")
                save_results(root)
            else:
                print(f"No patche found - {root}")