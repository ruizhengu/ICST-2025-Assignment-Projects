import json
import os
import re
import shutil
import subprocess
from pathlib import Path

import pandas as pd
from openpyxl import Workbook

ASTOR_OUTPUT = Path("/Users/ruizhengu/Projects/APR-as-AAT/repair-generation/results/output_astor")
INTRO_CLASS_PATH = Path("/Users/ruizhengu/Experiments/APR-as-AAT/IntroClassJava/dataset")
PATCH_RESULTS = Path("/Users/ruizhengu/Projects/APR-as-AAT/repair-generation/results/results_introclass.xlsx")


def get_intro_class_datasets():
    outputs = {}
    datasets = list(INTRO_CLASS_PATH.glob('*'))
    for dataset in datasets:
        if dataset.is_dir():
            outputs[dataset.name] = dataset
    return outputs


def run_cmd(command):
    return subprocess.Popen(command, shell=True, stdout=subprocess.PIPE).stdout.read()


def add_package(path, package):
    if not os.path.exists(os.path.dirname(path)):
        print("Please enter a valid path")
    else:
        for file in os.listdir(path):
            if file.endswith(".java"):
                with open(os.path.join(path, file), "r+") as f:
                    content = f.read()
                    f.seek(0, 0)
                    # f.write("package uk.ac.sheffield.com1003.cafe.randoop;" + "\n\n" + content)
                    f.write(package + "\n\n" + content)


def replace_package(file, old, new):
    """
    Replacing the package

    :param file: path of the file for replacing
    :param old: the targeted string to be replaced
    :param new: the new string
    :return:
    """
    file_path = Path(file)
    if not is_valid_file(file_path):
        print("Please enter a valid path")
        return
    with file_path.open("r") as f:
        content = f.readlines()
    with file_path.open("w") as f:
        for line in content:
            if line.startswith(old):
                line = f"{new}\n"
            f.write(line)


def import_class(file, line_before, new_line):
    """
    Importing a new class after a specific class

    :param file: path of the file for replacing
    :param line_before: the line before the inserting
    :param new_line: the new line to import
    :return:
    """
    file_path = Path(file)
    if not is_valid_file(file_path):
        print("Please enter a valid path")
        return
    with file_path.open("r") as f:
        content = f.readlines()
    with file_path.open("w") as f:
        for line in content:
            f.write(line)
            if line.startswith(line_before):
                f.write(f"{new_line}\n")


def create_excel(file):
    """
    Create an empty xlsx file

    :param file: the path of the file
    """
    wb = Workbook()
    if len(wb.sheetnames) > 0:
        wb.remove(wb.active)
    wb.create_sheet("workspace")
    wb.save(file)


def append_excel(file, data):
    """
    Append data in the xlsx file

    :param file: the path of the xlsx file
    :param data: the new data to append
    """
    try:
        df = pd.read_excel(file, sheet_name="workspace")
    except FileNotFoundError:
        df = pd.DataFrame()
    df = pd.concat([df, pd.DataFrame(data, index=[0])])
    df.to_excel(file, index=False, sheet_name="workspace")


def get_patches():
    """
    Get all patches in the astor output folder.

    """
    outputs = []
    patches = list(ASTOR_OUTPUT.glob('*'))
    for patch in patches:
        output_json = patch / "astor_output.json"
        if output_json.exists():
            with output_json.open('r') as f:
                data = json.load(f)
                path, modified_path = get_max_suspicious(data)
            output = {
                "patch": patch,
                "original_path": path,
                "modified_path": modified_path
            }
            outputs.append(output)


def apply_patch(file):
    with file.open("r") as f:
        data = json.load(f)
        path, modified_path = get_max_suspicious(data)
    shutil.move(modified_path, path)
    run_cmd(f"mvn -f {path} compile")
    run_cmd(f"mvn -f {path} test")


def get_max_suspicious(data):
    max_suspicious = -1
    path_max = ""
    modified_path_max = ""
    for patch in data["patches"]:
        for patch_hunk in patch["patchhunks"]:
            suspicious = float(patch_hunk["SUSPICIOUNESS"])
            if suspicious > max_suspicious:
                max_suspicious = suspicious
                path_max = patch_hunk["PATH"]
                modified_path_max = patch_hunk["MODIFIED_FILE_PATH"]

    return path_max, modified_path_max


def update_patch_paths(folder, new_path):
    """
    Update the path in the astor_output.json file to the renamed unique path

    :param folder: path of the output folder
    :param new_path: the renamed path
    """
    file_path = Path(folder) / "astor_output.json"
    with file_path.open('r') as f:
        data = json.load(f)
    for patch in data["patches"]:
        for patch_hunk in patch["patchhunks"]:
            path = patch_hunk["PATH"].replace("\\/", "/")
            modified_path = os.path.normpath(patch_hunk["MODIFIED_FILE_PATH"].replace("\\/", "/"))
            path_parts = modified_path.split(os.sep)
            if len(path_parts) > 8 and path_parts[8].startswith('AstorMain-'):
                path_parts[8] = new_path
            modified_path = os.sep.join(path_parts)
            patch_hunk["PATH"] = path
            patch_hunk["MODIFIED_FILE_PATH"] = modified_path
    with file_path.open('w') as f:
        json.dump(data, f, indent=2)


def is_valid_file(file):
    return Path(file).is_file()


def get_class_content(file, class_name):
    with open(file, 'r') as f:
        content = f.read()
    pattern = rf"class\s+{re.escape(class_name)}\s*\{{(.*?)\}}$"
    match = re.search(pattern, content, re.DOTALL)
    if match:
        return match.group(0)
    else:
        print(f"Class '{class_name}' not found in {file}")
        return None


def replace_class(file, class_name, class_content):
    pattern = rf"class\s+{re.escape(class_name)}\s*\{{(.*?)\}}$"
    newline_pattern = r'(?<!\\)\\n'
    with open(file, "r") as f:
        content = f.read()

    class_content = re.sub(newline_pattern, r'\\\\n', class_content)
    modified_content = re.sub(pattern, class_content, content, flags=re.DOTALL)
    print(modified_content)
    with open(file, "w") as f:
        f.write(modified_content)


file = "/Users/ruizhengu/Experiments/APR-as-AAT/test-n/median_fe9d5fb9_000.java"
class_name = "median_fe9d5fb9_000"
content = get_class_content(file, class_name)
file_new = "/Users/ruizhengu/Experiments/APR-as-AAT/test-o/median_fe9d5fb9_000.java"
replace_class(file_new, "median_fe9d5fb9_000", content)
