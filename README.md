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

**Properties:** [config_test.txt](/properties/CapGen/config_test.txt)

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

***Can not compile, will try on a VM later.***

## JAID

Repository: https://bitbucket.org/maxpei/jaid/src/master/

### Configuration

**Properties:** [problem_sheet.properties](https://github.com/ruizhengu/APR-as-AAT/blob/main/properties/jaid/problem_sheet.properties)

**Program arguments**

```
--JaidSettingFile $MODULE_DIR$/example/af_test/problem_sheet.properties
```

### Comments

* Can work on Defects4J bugs.
* Can not work on the problem sheet.

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
