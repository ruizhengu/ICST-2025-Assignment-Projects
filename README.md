# APR-as-AAT

# Search-based Automated Program Repair as Automated Assessment Tools

**Definition of a "not runnable tool":** *if the tool can work for reproduction (e.g. can work on Defects4J bugs), then the execution of the tool is correct. If the tool can not work on the programming assignments in the correct setup, then the tool is not runnable for the programming assignments.*

## ARJA

Repository: https://github.com/yyxhdy/arja

Java version: 1.8

JUnit version: 4

### Command

**Ubuntu**

```sh
# Arja
java -cp lib/*:bin us.msu.cse.repair.Main Arja -DsrcJavaDir /home/ruizhen/Projects/SSBSE/Cafe/com1003_cafe -DbinJavaDir /home/ruizhen/Projects/SSBSE/Cafe/com1003_cafe/build/classes/java/main -DbinTestDir /home/ruizhen/Projects/SSBSE/Cafe/com1003_cafe/build/classes/java/test -Ddependences /home/ruizhen/Projects/SSBSE/Cafe/dependency/javaparser-core-3.25.1.jar:/home/ruizhen/Projects/SSBSE/Cafe/dependency/javaparser-core-serialization-3.25.1.jar:/home/ruizhen/Projects/SSBSE/Cafe/dependency/commons-lang3-3.0.jar
```

**Mac**

```sh
java -cp lib/\*:bin us.msu.cse.repair.Main Arja -DsrcJavaDir /Users/ray/Project/PhD/SSBSE/Cafe/com1003_cafe -DbinJavaDir /Users/ray/Project/PhD/SSBSE/Cafe/com1003_cafe/build/classes/java/main -DbinTestDir /Users/ray/Project/PhD/SSBSE/Cafe/com1003_cafe/build/classes/java/test -Ddependences /Users/ray/Project/PhD/SSBSE/Cafe/dependency/javaparser-core-3.25.1.jar:/Users/ray/Project/PhD/SSBSE/Cafe/dependency/javaparser-core-serialization-3.25.1.jar:/Users/ray/Project/PhD/SSBSE/Cafe/dependency/commons-lang3-3.0.jar
```

### Comments

* Fault localisation works for the problem sheet with Java 1.8.
* Can not generate any result.

## Astor

Repository: https://github.com/SpoonLabs/astor

Java version: 1.8

JUnit version: 4

### Command

```sh
# jGenProg2
java -cp target/astor-*-jar-with-dependencies.jar fr.inria.main.evolution.AstorMain -mode jgenprog -srcjavafolder /src/main/java/ -srctestfolder /src/test/java/  -binjavafolder /build/classes/java/main/ -bintestfolder /build/classes/java/test/ -location /home/ruizhen/Projects/SSBSE/Cafe/com1003_cafe -dependencies /home/ruizhen/Projects/SSBSE/Cafe/dependency
```

### Comments

* Can localise faults in the problem sheet with Java 1.8 (GZoltar & flacoco).
* Can generate repairs for the problem sheet, but the repairs are not valid.

## CapGen

Repository: https://github.com/MingWEN-CS/CapGen

### Configuration

```
#[REQUIRED]the required options you need to set
#1. The work directory, where to find the required libraries. The default one is the current directory "."
workLoc=.
#2. The bug location, where stores the bug repository
bugLoc = /home/ruizhen/Projects/SSBSE/Cafe
#3. the location of JDK 7. Bug Lang 57 requires JDK7 to run it
JDK7 = /usr/lib/jvm/jdk1.7.0_80/bin/
#4. The task you want to run [RQ1/RQ3/RepairABug]
task = RQ1
##. RQ1 and RQ3 reproduce the results for RQ1 and RQ3

##. If the task is RepairABug, you need further specify the following parameters
#5. The project 
project = Cafe
#6. The bug ID
bid = 1
# the specific task you want to run {faultLocation, ingredientsExtraction, patchPrioritization, patchValidation, resultsAnalysis}
#1. faultLocation: run GZoltar to produce the fault space [true/false]
#2. ingredientsExtraction: to extract the fixing ingredients together with their contexts [true/false]
#3. patchPrioritization: to generate candidate patches and rank them [true/false]
#4. patchValidation: validate the patches generated [true/false]
#5: resultsAnalysis: analyze the results [true/false]
faultLocation = false
ingredientsExtraction = true
patchPrioritization = false
patchValidation = false
resultsAnalysis = false
```

### Command

```sh
java -jar CapGen.jar config_test.txt 
```

### Error Output

```sh
error happens when writing lines to file /home/ruizhen/Projects/SSBSE/Cafe/Chart_1_buggy/ingredients/ingredientsRank.txt
java.io.FileNotFoundException: /home/ruizhen/Projects/SSBSE/Cafe/Chart_1_buggy/ingredients/ingredientsRank.txt (No such file or directory)
......
error happens when writing lines to file /home/ruizhen/Projects/SSBSE/Cafe/Chart_8_buggy/ingredients/ingredientsRank.txt
java.io.FileNotFoundException: /home/ruizhen/Projects/SSBSE/Cafe/Chart_8_buggy/ingredients/ingredientsRank.txt (No such file or directory)
......
```

### Comments

* Can work on provided Defects4J bugs.
* Assume this tool is fixed for Defects4J bugs.

## ConFix

Repository: https://github.com/thwak/ConFix

### Comments

* Unclear how to generate coverage information.

  ```sh
  java.io.FileNotFoundException: coverage-info.obj (No such file or directory)
  ```

## GenPat

Repository: https://github.com/xgdsmileboy/GenPat

### Configuration

```java
// Main.java
args = new String[5];
args[0] = "repair";
args[1] = "-bp";
args[2] = "/home/ruizhen/Projects/SSBSE/CapGen/Defects4J/Chart_1_buggy";
args[3] = "-pf";
args[4] = "/home/ruizhen/Projects/SSBSE/GenPat/example/patterns/pattern_file1.pattern";
```

### Error Output

```sh
[INFO ] 2023-08-14 12:05:12,635 /home/ruizhen/Projects/SSBSE/CapGen/Defects4J/Chart_1_buggy, [_name=FakeSubject, _ssrc=, _tsrc=, _sbin=, _tbin=]
TIMEOUT : 7200000ms
[INFO ] 2023-08-14 12:05:12,637 Repair : FakeSubject_1
Failed test file does not exist : /home/ruizhen/Projects/SSBSE/GenPat/resources/d4j-info/failed_tests/FakeSubject/1.txt
```

### Comments

* Not sure how to run.

## Genesis



## kGenProg

Repository: https://github.com/kusumotolab/kGenProg

Java version: 11

JUnit version: 4

### Configuration

```toml
# kgenprog.toml
# placed in the root directory of the problem sheet

# Specifies the path to the root directory of the target project.
root-dir = "./"

# Specifies paths to "product" source code (i.e. main, non-test code),
# or to directories containing them.
src = ["src/main/java"]

# Specifies paths to test source code, or to directories containing them.
test = ["src/test/java"]

# Specifies class paths needed to build the target project.
cp = ["build/classes/java/main", "build/classes/java/test", "../dependency/commons-lang3-3.0.jar", "../dependency/javaparser-core-3.25.1.jar", "../dependency/javaparser-core-serialization-3.25.1.jar", "../dependency/junit-4.13.2.jar", "../dependency/junit-jupiter-api-5.9.0.jar", "../dependency/junit-jupiter-engine-5.9.0.jar", "../dependency/junit-vintage-engine-5.9.0.jar", "../dependency/apiguardian-api-1.1.2.jar"]
```

### Command

```sh
# execute in the root directory of the problem sheet
java -jar kGenProg-1.8.2.jar 
```

### Comments

No result is generated.
