### Build ARJA-e

```shell
./gradlew build
```

Build the external projecrt

```shell
cd external
mkdir bin
javac -cp "lib/*:" -d bin $(find src -name '*.java')
```

### Run ARJA-e with arguments

```shell
./gradlew run --args="ArjaE -DsrcJavaDir /Users/ruizhengu/Experiments/APR-as-AAT/model_mutants/cafe_java_8/src -DbinJavaDir /Users/ruizhengu/Experiments/APR-as-AAT/model_mutants/cafe_java_8/build/classes/java/main -DbinTestDir /Users/ruizhengu/Experiments/APR-as-AAT/model_mutants/cafe_java_8/build/classes/java/test -Ddependences /Users/ruizhengu/Projects/APR-as-AAT/dependency/evosuite-standalone-runtime-1.0.6.jar:/Users/ruizhengu/Projects/APR-as-AAT/dependency/junit-vintage-engine-5.9.0.jar:/Users/ruizhengu/Projects/APR-as-AAT/dependency/junit-4.13.2.jar:/Users/ruizhengu/Projects/APR-as-AAT/dependency/junit-jupiter-engine-5.9.0.jar:/Users/ruizhengu/Projects/APR-as-AAT/dependency/javaparser-core-3.25.1.jar:/Users/ruizhengu/Projects/APR-as-AAT/dependency/junit-jupiter-api-5.9.0.jar:/Users/ruizhengu/Projects/APR-as-AAT/dependency/javaparser-core-serialization-3.25.1.jar:/Users/ruizhengu/Projects/APR-as-AAT/dependency/apiguardian-api-1.1.2.jar:/Users/ruizhengu/Projects/APR-as-AAT/dependency/commons-lang3-3.0.jar:/Users/ruizhengu/Projects/APR-as-AAT/dependency/opentest4j-1.0.0.jar -DdiffFormat true"
```

