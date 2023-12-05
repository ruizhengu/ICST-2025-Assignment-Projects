import glob
import os
import subprocess
import sys


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


def apply_patch(patch):
    pass
