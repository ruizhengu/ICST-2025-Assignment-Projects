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
java -cp lib/*:bin us.msu.cse.repair.Main Arja -DsrcJavaDir /home/ruizhen/Projects/SSBSE/anonymised-submissions/1/src/main/java/uk/ac/sheffield/com1003/cafe -DbinJavaDir /home/ruizhen/Projects/SSBSE/anonymised-submissions/1/build/classes/java/main -DbinTestDir /home/ruizhen/Projects/SSBSE/anonymised-submissions/1/build/classes/java/test -Ddependences dependency/javaparser-core-3.25.1.jar:dependency/javaparser-core-serialization-3.25.1.jar:dependency/commons-lang3-3.0.jar
```

## Astro

Repository: https://github.com/SpoonLabs/astor

Last commit: Sep 2022

Java version: 11

Executable: **Yes**

Command:

```sh
# jGenProg2
java -cp target/astor-*-jar-with-dependencies.jar fr.inria.main.evolution.AstorMain -mode jgenprog -srcjavafolder /src/main/java/ -srctestfolder /src/test/java/  -binjavafolder /build/classes/java/main/ -bintestfolder  /build/classes/java/test/ -location /home/ruizhen/Projects/SSBSE/anonymised-submissions/1/ -dependencies /home/ruizhen/Projects/SSBSE/dependency
```

## kGenProg

Repository: https://github.com/kusumotolab/kGenProg

Last commit: Dec 2022

Java version: 11

Executable: **No**

Configuration:

```json
// kgenprog.toml
// located in the root directory of the student program

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

When executing the provided jar file, shows:

```sh
2023-07-28 17:17:19 [main] [ERROR] KGenProgMain - cannot infer type arguments for com.github.javaparser.ast.visitor.VoidVisitorAdapter<A>
  reason: '<>' with anonymous inner classes is not supported in -source 8
    (use -source 9 or higher to enable '<>' with anonymous inner classes)cannot infer type arguments for com.github.javaparser.ast.visitor.VoidVisitorAdapter<A>
  reason: '<>' with anonymous inner classes is not supported in -source 8
    (use -source 9 or higher to enable '<>' with anonymous inner classes)
```

Presumably the jar file was built by Java 1.8. When tried to manually built the project with Java 11, shows:

```sh
class file has wrong version 61.0, should be 55.0
```

