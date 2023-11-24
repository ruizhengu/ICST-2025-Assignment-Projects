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
