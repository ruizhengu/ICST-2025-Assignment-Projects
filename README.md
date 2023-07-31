# APR-as-AAT

# Search-based Automated Program Repair as Automated Assessment Tools

## ARJA

Repository: https://github.com/yyxhdy/arja

Last commit: Jan 2021

Java version: 11

Executable: **Yes**

Command:

```sh
# Arja
java -cp lib/*:bin us.msu.cse.repair.Main Arja -DsrcJavaDir /home/ruizhen/Projects/SSBSE/Cafe/Cafe_1/src/main/java/uk/ac/sheffield/com1003/cafe -DbinJavaDir /home/ruizhen/Projects/SSBSE/Cafe/Cafe_1/build/classes/java/main -DbinTestDir /home/ruizhen/Projects/SSBSE/Cafe/Cafe_1/build/classes/java/test -Ddependences dependency/javaparser-core-3.24.4.jar:dependency/javaparser-core-serialization-3.24.4.jar:dependency/commons-lang3-3.0.jar
```

**Comments: the process can be ran but can not generate results.**

## Astor

Repository: https://github.com/SpoonLabs/astor

Last commit: Sep 2022

Java version: 11

Executable: **Yes**

Command:

```sh
# jGenProg2
java -cp target/astor-*-jar-with-dependencies.jar fr.inria.main.evolution.AstorMain -mode jgenprog -srcjavafolder /src/main/java/ -srctestfolder /src/test/java/  -binjavafolder /build/classes/java/main/ -bintestfolder  /build/classes/java/test/ -location /home/ruizhen/Projects/SSBSE/Cafe/Cafe_1 -dependencies /home/ruizhen/Projects/SSBSE/Cafe/Cafe_1/dependency
```

**Comments: can generate results (class variants) but some test cases can not run on the update program.**

## kGenProg

Repository: https://github.com/kusumotolab/kGenProg

Last commit: Dec 2022

Java version: 11 *(The problem sheet was built in Java 17, some code has compatibility issue with Java 11)*

JUnit version: 4

Executable: **Yes**

Configuration:

```sh
# kgenprog.toml
# located in the root directory of the student program

# Specifies the path to the root directory of the target project.
root-dir = "./"

# Specifies paths to "product" source code (i.e. main, non-test code),
# or to directories containing them.
src = ["src/main/java"]

# Specifies paths to test source code, or to directories containing them.
test = ["src/test/java"]

# Specifies class paths needed to build the target project.
cp = ["build/classes/java/main", "build/classes/java/test", "dependency/commons-lang3-3.0.jar", "dependency/javaparser-core-3.24.4.jar", "dependency/javaparser-core-serialization-3.24.4.jar", "dependency/junit-4.13.2.jar", "dependency/junit-jupiter-api-5.9.0.jar", "dependency/junit-jupiter-engine-5.9.0.jar", "dependency/junit-vintage-engine-5.9.0.jar", "dependency/apiguardian-api-1.1.2.jar"]
```
