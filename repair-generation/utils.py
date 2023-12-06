import json
import os
import subprocess
from pathlib import Path

import pandas as pd
from openpyxl import Workbook


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
    if not os.path.isfile(file):
        print("Please enter a valid path")
    else:
        with open(file, "r") as f:
            content = f.readlines()
        with open(file, "w") as f:
            for line in content:
                if line.startswith(old):
                    line = f"{new}\n"
                f.write(line)


def import_class(file, line_before, new_line):
    if not os.path.isfile(file):
        print("Please enter a valid path")
    else:
        with open(file, "r") as f:
            content = f.readlines()
        with open(file, "w") as f:
            for line in content:
                f.write(line)
                if line.startswith(line_before):
                    f.write(f"{new_line}\n")


def save_results(path, submission):
    with open(path, "a") as f:
        f.write(submission + "\n")
        f.close()


def append_excel(file, data):
    try:
        df = pd.read_excel(file, sheet_name="workspace")
    except FileNotFoundError:
        df = pd.DataFrame()
    df = pd.concat([df, pd.DataFrame(data, index=[0])])
    df.to_excel(file, index=False, sheet_name="workspace")


def create_excel(file):
    wb = Workbook()
    if len(wb.sheetnames) > 0:
        wb.remove(wb.active)
    wb.create_sheet("workspace")
    wb.save(file)


def apply_patch(file):
    file_path = Path(file) / "astor_output.json"
    with file_path.open('r') as f:
        data = json.load(f)
        for patch in data["patches"]:
            for patch_hunk in patch["patchhunks"]:
                path = patch_hunk["PATH"]
                modified_path = patch_hunk["MODIFIED_FILE_PATH"]
                print(path, modified_path)


def update_patch_paths(file, new_path):
    file_path = Path(file) / "astor_output.json"
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
