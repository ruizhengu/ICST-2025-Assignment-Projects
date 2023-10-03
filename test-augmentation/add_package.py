import os

# TEST_PATH = "/Users/ruizhengu/Projects/APR-as-AAT/com1003_cafe_8/src/test/java/uk/ac/sheffield/com1003/cafe/randoop"
TEST_PATH = "/Users/ruizhengu/Experiments/APR-as-AAT/anonymised-submissions/1/src/test/java/uk/ac/sheffield/com1003/cafe/randoop"

for file in os.listdir(TEST_PATH):
    if file.endswith(".java"):
        with open(os.path.join(TEST_PATH, file), "r+") as f:
            content = f.read()
            f.seek(0, 0)
            f.write("package uk.ac.sheffield.com1003.cafe.randoop;" + "\n\n" + content)