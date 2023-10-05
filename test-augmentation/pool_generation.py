import os
import shutil
import threading
import time
import fileinput

SUBMISSION_PATH = "/Users/ruizhengu/Experiments/APR-as-AAT/anonymised-submissions"

# TARGET_PATH = "/Users/ruizhengu/Experiments/APR-as-AAT/com1003_cafe_8"
TARGET_PATH = "/Users/ruizhengu/Experiments/APR-as-AAT/anonymised-submissions/1"

CLASS_PATH = "src/main/java/uk/ac/sheffield/com1003/cafe"

if not os.path.exists(os.path.dirname(SUBMISSION_PATH)) or not os.path.exists(os.path.dirname(TARGET_PATH)):
    print("Please enter a valid path")
else:
    for file in os.listdir(SUBMISSION_PATH):
        if file.isnumeric():
            print(file)
            package_name = "solution_" + file
            package_path = os.path.join(TARGET_PATH, CLASS_PATH, package_name)
            if os.path.exists(package_path):
                shutil.rmtree(package_path)
            try:
                shutil.copytree(os.path.join(SUBMISSION_PATH, file, CLASS_PATH), package_path)
                source = []
                for (dir_path, dir_names, file_names) in os.walk(package_path):
                    for file_name in file_names:
                        if file_name.endswith(".java"):
                            with open(os.path.join(dir_path, file_name), "r") as f:
                                content = f.readlines()
                                for line in content:
                                    if line.endswith("package uk.ac.sheffield.com1003.cafe.exceptions;\n"):
                                        index = content.index(line)
                                        content[index] = f"package uk.ac.sheffield.com1003.cafe.{package_name}.exceptions;\n"
                                    elif line.endswith("package uk.ac.sheffield.com1003.cafe.ingredients;\n"):
                                        index = content.index(line)
                                        content[index] = f"package uk.ac.sheffield.com1003.cafe.{package_name}.ingredients;\n"
                                    elif line.endswith("package uk.ac.sheffield.com1003.cafe;\n"):
                                        index = content.index(line)
                                        content[index] = f"package uk.ac.sheffield.com1003.cafe.{package_name};\n"
                                    # elif line.endswith("if (!(object instanceof Recipe recipe)) return false;\n"):
                                    #     index = content.index(line)
                                    #     content[index] = "if (!(o instanceof Recipe))\nreturn false;\nRecipe recipe = (Recipe) o;\n"
                                    # elif line.endswith("if (!(object instanceof Milk milk)) return false;\n"):
                                    #     index = content.index(line)
                                    #     content[index] = "if (!(object instanceof Milk))\nreturn false;\nMilk milk = (Milk) object;\n"
                            with open(os.path.join(dir_path, file_name), "w") as f:
                                f.writelines(content)
            except FileNotFoundError:
                print(f"Submission {file} can not be parsed.")
                continue
