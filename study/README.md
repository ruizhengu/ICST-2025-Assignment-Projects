# APR for Programming Assignment Projects

**Definition of a "not runnable" tool:** *if the tool can work for reproduction (e.g. can work on Defects4J bugs), then the execution of the tool is correct. If the tool can not work on the programming assignments or the simple example in the correct setup, then the tool is not runnable for the programming assignments.*

A "runnable" tool only means the tool can run and does not guarantee it can generate meaningful results.

## ARJA

Repository: https://github.com/yyxhdy/arja

Java version: 1.7

### Arguments

* **-DdiffFormat:** outputing the patches as files generated by "diff -u".
* **-DingredientMode:** the ingredient mode, set to "Application" to include the model solutions.

### Command

```sh
# IntroClassJava
java -cp "lib/*:bin:target/classes" us.msu.cse.cream.Main Arja -DsrcJavaDir /Users/Experiments/APR-as-AAT/newIntroClass/median/1/src -DbinJavaDir /Users/Experiments/APR-as-AAT/newIntroClass/median/1/target/classes -DbinTestDir /Users/Experiments/APR-as-AAT/newIntroClass/median/1/target/test-classes -Ddependences /Users/Experiments/APR-as-AAT/dependency
```

```shell
# Assignment
java -cp "lib/*:bin" us.msu.cse.cream.Main ArjaE -DsrcJavaDir /Users/Experiments/APR-as-AAT/model_mutants/cafe_java_8/src -DbinJavaDir /Users/Experiments/APR-as-AAT/model_mutants/cafe_java_8/build/classes/java/main -DbinTestDir /Users/Experiments/APR-as-AAT/model_mutants/cafe_java_8/build/classes/java/test -Ddependences /Users/Projects/APR-as-AAT/dependency/evosuite-standalone-runtime-1.0.6.jar:/Users/Projects/APR-as-AAT/dependency/junit-vintage-engine-5.9.0.jar:/Users/Projects/APR-as-AAT/dependency/junit-4.13.2.jar:/Users/Projects/APR-as-AAT/dependency/junit-jupiter-engine-5.9.0.jar:/Users/Projects/APR-as-AAT/dependency/javaparser-core-3.25.1.jar:/Users/Projects/APR-as-AAT/dependency/junit-jupiter-api-5.9.0.jar:/Users/Projects/APR-as-AAT/dependency/javaparser-core-serialization-3.25.1.jar:/Users/Projects/APR-as-AAT/dependency/apiguardian-api-1.1.2.jar:/Users/Projects/APR-as-AAT/dependency/commons-lang3-3.0.jar:/Users/Projects/APR-as-AAT/dependency/opentest4j-1.0.0.jar -DdiffFormat true -DingredientMode Application
```



### Comments

* Can generate patches.

## Astor

Repository: https://github.com/SpoonLabs/astor

Java version: 1.8

### Command

```sh
# gradle
java -cp target/astor-*-jar-with-dependencies.jar fr.inria.main.evolution.AstorMain -mode jgenprog -srcjavafolder /src/main/java/ -srctestfolder /src/test/java/  -binjavafolder /build/classes/java/main/ -bintestfolder /build/classes/java/test/ -location /Users/Experiments/APR-as-AAT/anonymised-submissions/3 -dependencies /Users/Experiments/APR-as-AAT/dependency -scope global
```

```shell
# maven
java -cp target/astor-*-jar-with-dependencies.jar fr.inria.main.evolution.AstorMain -mode jgenprog -srcjavafolder /src/main/java/ -srctestfolder /src/test/java/  -binjavafolder /target/classes/ -bintestfolder /target/test-classes/ -location /Users/Experiments/APR-as-AAT/IntroClassJava/dataset/checksum/2c1556672751734adf9a561fbf88767c32224fca14a81e9d9c719f18d0b21765038acc16ecd8377f74d4f43e8c844538161d869605e3516cf797d0a6a59f1f8e/003 -scope global
```

### Comments

* Can generate patches by jGenProg.

## CapGen

Repository: https://github.com/MingWEN-CS/CapGen

### Configuration

**Properties:** [config_test.txt](./CapGen/config_test.txt)

### Command

```sh
java -jar CapGen.jar config_test.txt 
```

### Error Output

```sh
error happens when writing lines to file /home/Projects/SSBSE/Cafe/Chart_1_buggy/ingredients/ingredientsRank.txt
java.io.FileNotFoundException: /home/Projects/SSBSE/Cafe/Chart_1_buggy/ingredients/ingredientsRank.txt (No such file or directory)
......
error happens when writing lines to file /home/Projects/SSBSE/Cafe/Chart_8_buggy/ingredients/ingredientsRank.txt
java.io.FileNotFoundException: /home/Projects/SSBSE/Cafe/Chart_8_buggy/ingredients/ingredientsRank.txt (No such file or directory)
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
args[2] = "/home/Projects/SSBSE/CapGen/Defects4J/Chart_1_buggy";
args[3] = "-pf";
args[4] = "/home/Projects/SSBSE/GenPat/example/patterns/pattern_file1.pattern";
```

### Error Output

```sh
[INFO ] 2023-08-14 12:05:12,635 /home/Projects/SSBSE/CapGen/Defects4J/Chart_1_buggy, [_name=FakeSubject, _ssrc=, _tsrc=, _sbin=, _tbin=]
TIMEOUT : 7200000ms
[INFO ] 2023-08-14 12:05:12,637 Repair : FakeSubject_1
Failed test file does not exist : /home/Projects/SSBSE/GenPat/resources/d4j-info/failed_tests/FakeSubject/1.txt
```

### Comments

* Not sure how to run.
* **Can not work on the simple example.**
* **Can not work on the problem sheet.**

## Genesis

### Comments

* Can not compile.

## JAID

Repository: https://bitbucket.org/maxpei/jaid/src/master/

### Configuration

**Properties:** [problem_sheet.properties](./jaid/problem_sheet.properties)

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

Repository: https://github.com/TruX-DTF/LSRepair

### Procedure

1. Start with the **DataPreparer** directory.

2. Following the guide of **A.1**.

3. Move **DataPreparer-0.0.1-SNAPSHOT.jar** from *DataProparer/target* to *DataProparer/target/dependency*.

4. Execute the command

   ```sh
   java -cp "target/dependency/*" -Xmx1g data.javaFile.getter.MainProcess /home/Projects/SSBSE/LSRepair /home/Projects/SSBSE/LSRepair/ 2
   ```

   This command will generate **JavaFiles.txt** in */home/Projects/SSBSE/LSRepair*.

5. Create a **Output** folder at */home/Projects/SSBSE/LSRepair*.

6. Execute the command

   ```sh
   java -cp "target/dependency/*" -Xmx1g data.javaCode.akka.parser.MainParser /home/Projects/SSBSE/LSRepair/JavaFiles.txt /home/Projects/SSBSE/LSRepair/Output/ 2 2
   ```

   The command fail with the error

   ```sh
   java.io.FileNotFoundException: /home/Projects/SSBSE/LSRepair/Output/Metric/MethodBodyTokens.txt (No such file or directory)
   ```

### Comments

* Unclear instructions, failed with unknown reasons.

## SimFix

Repository: https://github.com/xgdsmileboy/SimFix

**Properties(attempted):** [d4j-info](./SimFix/d4j-info)

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

### Comments

* The off-the-shelf version is fixed to Defects4J bugs (required bug information located in */SimFix/d4j-info*).
* It may be possible to manually add bug information for the simple example or the problem sheet, but the effort remains unknown.

## SketchFix

Repository: https://github.com/SketchFix/SketchFix

**Properties (simple example):** [SimpleConfig.txt](./SketchFix/SimpleConfig.txt)

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

## kGenProg

Repository: https://github.com/kusumotolab/kGenProg

Java version: 11

### Command

```sh
java -jar /Users/Experiments/APR-as-AAT/kGenProg-1.8.2.jar -r /Users/Experiments/APR-as-AAT/newIntroClass/median/median_1 -s /Users/Experiments/APR-as-AAT/newIntroClass/median/median_1/src/main -t /Users/Experiments/APR-as-AAT/newIntroClass/median/median_1/src/test --max-generation 50
```

### Comments

* 14 patches generated from IntroClassJava.

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

## ssFix

Repository: https://github.com/qixin5/ssFix

**Properties (simple example):** [testsuite_classes](./ssFix/simpleExample_1_buggy/testsuite_classes)

**Properties (problem sheet):** [testsuite_classes](./ssFix/com1003_cafe_8/testsuite_classes)

### Command

```sh
# simple example
./run -bugid s1 -dependjpath /home/Projects/SSBSE/ssFix/test/Lang_21_buggy/all0.jar -projdpath /home/Projects/SSBSE/ssFix/test/simpleExample_1_buggy -projsrcdpath /home/Projects/SSBSE/ssFix/test/simpleExample_1_buggy/src/main/java -projbuilddpath /home/Projects/SSBSE/ssFix/test/simpleExample_1_buggy/target/classes -projtestbuilddpath /home/Projects/SSBSE/ssFix/test/simpleExample_1_buggy/target/test-classes -outputdpath /home/Projects/SSBSE/ssFix/test/rslt -ssfixdpath /home/Projects/SSBSE/ssFix -tsuitefpath /home/Projects/SSBSE/ssFix/test/simpleExample_1_buggy/testsuite_classes -faulocaddstacktrace -parallelgranularity 8 &> simpleExample1_log
```

```sh
# problem sheet 
./run -bugid c8 -dependjpath /home/Projects/SSBSE/Cafe/dependency/ -projdpath /home/Projects/SSBSE/ssFix/test/com1003_cafe_8 -projsrcdpath /home/Projects/SSBSE/ssFix/test/com1003_cafe_8/src/main/java -projbuilddpath /home/Projects/SSBSE/ssFix/test/com1003_cafe_8/build/classes -projtestbuilddpath /home/Projects/SSBSE/ssFix/test/com1003_cafe_8/build/test-classes -outputdpath /home/Projects/SSBSE/ssFix/test/rslt -ssfixdpath /home/Projects/SSBSE/ssFix -tsuitefpath /home/Projects/SSBSE/ssFix/test/com1003_cafe_8/testsuite_classes -faulocaddstacktrace -parallelgranularity 8 &> cafe8_log
```

### Comments

* The tool can work on the provided Lang_21_buggy example, but no patch is generated.

* The tool can not work on the simple example and the problem sheet because there is no fault localization result found.

  ```
  # simpleExample1_log
  
  No Fault Localization Result Found!
  Fault Localization Failure.
  Repair execution time: 8
  ```

  
