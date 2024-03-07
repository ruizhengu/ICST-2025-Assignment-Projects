### Build ARJA-e

```shell
./gradlew build
```

Build the external projecrt

```shell
cd external
mkdir bin
javac -cp lib/*: -d bin $(find src -name '*.java')
```

### Run ARJA-e with arguments

```shell
./gradlew run --args='ArjaE -DsrcJavaDir /Users/ruizhengu/Experiments/APR-as-AAT/newIntroClass/checksum/checksum_1/src -DbinJavaDir /Users/ruizhengu/Experiments/APR-as-AAT/newIntroClass/checksum/checksum_1/target/classes -DbinTestDir /Users/ruizhengu/Experiments/APR-as-AAT/newIntroClass/checksum/checksum_1/target/test-classes -Ddependences /Users/ruizhengu/Experiments/APR-as-AAT/dependency/junit-4.13.2.jar'
```

