# APR-as-AAT

# Search-based Automated Program Repair as Automated Assessment Tools

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

## kGenProg

Repository: https://github.com/kusumotolab/kGenProg

Java version: 11

JUnit version: 4

### Configuration

```sh
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
