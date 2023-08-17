# APR-as-AAT

# Search-based Automated Program Repair as Automated Assessment Tools

**Definition of a "not runnable" tool:** *if the tool can work for reproduction (e.g. can work on Defects4J bugs), then the execution of the tool is correct. If the tool can not work on the programming assignments or the simple example in the correct setup, then the tool is not runnable for the programming assignments.*

A "runnable" tool only means the tool can run and does not guarantee it can generate meaningful results.

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
* **Can not work on the simple example.**
* **Can not work on the problem sheet.**

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
* **Can not work on the simple example.**
* **Can not work on the problem sheet.**

## Genesis

***Can not compile, will try on a VM later.***

## JAID

Repository: https://bitbucket.org/maxpei/jaid/src/master/

### Configuration

**Properties:** [problem_sheet.properties](/properties/jaid/problem_sheet.properties)

**Program arguments**

```
--JaidSettingFile $MODULE_DIR$/example/af_test/problem_sheet.properties
```

### Comments

* Can work on Defects4J bugs.
* Can generate repairs for the problem sheet and the simple example, but the repairs are not valid. 

## JaRFly

Repository: https://github.com/squaresLab/genprog4java

### Comments

* Can not run the provided example.

## LSRepair

### Procedure

1. Start with the **DataPreparer** directory.

2. Following the guide of **A.1**.

3. Move **DataPreparer-0.0.1-SNAPSHOT.jar** from *DataProparer/target* to *DataProparer/target/dependency*.

4. Execute the command

   ```sh
   java -cp "target/dependency/*" -Xmx1g data.javaFile.getter.MainProcess /home/ruizhen/Projects/SSBSE/LSRepair /home/ruizhen/Projects/SSBSE/LSRepair/ 2
   ```

   This command will generate **JavaFiles.txt** in */home/ruizhen/Projects/SSBSE/LSRepair*.

5. Create a **Output** folder at */home/ruizhen/Projects/SSBSE/LSRepair*.

6. Execute the command

   ```sh
   java -cp "target/dependency/*" -Xmx1g data.javaCode.akka.parser.MainParser /home/ruizhen/Projects/SSBSE/LSRepair/JavaFiles.txt /home/ruizhen/Projects/SSBSE/LSRepair/Output/ 2 2
   ```

   The command fail with the error

   ```sh
   java.io.FileNotFoundException: /home/ruizhen/Projects/SSBSE/LSRepair/Output/Metric/MethodBodyTokens.txt (No such file or directory)
   ```

### Comments

* Unclear instructions, failed with unknown reasons.

## SimFix

Repository: https://github.com/xgdsmileboy/SimFix

**Properties(attempted):** [d4j-info](/properties/SimFix/d4j-info)

**Program arguments**

```
# Defects4J lang
--proj_home=/Users/ray/Project/PhD/SSBSE/SimFix/bugs --proj_name=lang --bug_id=1
```

```
# simple example
--proj_home=/Users/ray/Project/PhD/SSBSE/Cafe --proj_name=example --bug_id=1
```

### Error Output

```
Cannot get suspicious statement for non-existing file : /Users/ray/Project/PhD/SSBSE/SimFix/sbfl/ochiai/lang/1/stmt-susps.txt
org.apache.commons.lang3.math.NumberUtils,462
Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
```

Missing */SimFix/sbfl/ochiai* directory.

### Comments

* The off-the-shelf version is fixed to Defects4J bugs (required bug information located in */SimFix/d4j-info*).
* It may be possible to manually add bug information for the simple example or the problem sheet, but the effort remains unknown.

## SketchFix

Repository: https://github.com/SketchFix/SketchFix

**Properties (simple example):** [SimpleConfig.txt](/properties/SketchFix/SimpleConfig.txt)

### Procedure (simple example)

1. Place **Test1.java** and **test11.java** in */SketchFix/HelloWorld/src*.
2. Replace **SimpleConfig.txt** in */SketchFix/Helloworld*.
3. Run **PatchGenerationRunner.java**.

### Comments

* The HelloWorld example works on the provided fault.
* The HelloWorld example can generate repair with the simple example but the repair is invalid.
* No clear instruction about how to use the tool on Defects4J or other real world bugs.

## TBar

Repository: https://github.com/TruX-DTF/TBar

### Comments

* The tool is fixed to Defects4J bugs (the program is executing defects4j command).

  ```java
  // AbstractFixer.java
  TestUtils.compileProjectWithDefects4j(fullBuggyProjectPath, defects4jPath);
  // TestUtils.java
  String result = ShellUtils.shellRun(Arrays.asList("cd " + projectName + "\n", defects4jPath + "framework/bin/defects4j " + cmdType + "\n"), buggyProject, cmdType.equals("test") ? 2 : 1);
  ```

## kPAR

Repository: https://github.com/TruX-DTF/FL-VS-APR

### Comments

* The tool is fixed to Defects4J bugs (the program is executing defects4j command).

  ```java
  // AbstractFixer.java
  if (FileHelper.getAllFiles(path + buggyProject + PathUtils.getSrcPath(buggyProject).get(0), ".class").isEmpty()) {
      TestUtils.compileProjectWithDefects4j(path + buggyProject, defects4jPath);
  }
  ```

## kGenProg

Repository: https://github.com/kusumotolab/kGenProg

Java version: 11

JUnit version: 4

### Configuration

**Properties:** [kgenprog.toml](/properties/kGenProg/kgenprog.toml)

### Command

```sh
# execute in the root directory of the problem sheet
java -jar kGenProg-1.8.2.jar 
```

### Comments

* No result is generated.
