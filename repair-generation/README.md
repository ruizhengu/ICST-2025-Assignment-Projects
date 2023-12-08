# Partial Repair
### Get failed tests

* Maven

```sh
mvn -f /Users/ruizhengu/Experiments/APR-as-AAT/IntroClassJava/dataset/checksum/2c1556672751734adf9a561fbf88767c32224fca14a81e9d9c719f18d0b21765038acc16ecd8377f74d4f43e8c844538161d869605e3516cf797d0a6a59f1f8e/003 test | grep "Tests run:.*Failures:.*Errors:"
```

### Execute a single test method

* Maven

```sh
mvn -f /Users/ruizhengu/Experiments/APR-as-AAT/IntroClassJava/dataset/checksum/2c1556672751734adf9a561fbf88767c32224fca14a81e9d9c719f18d0b21765038acc16ecd8377f74d4f43e8c844538161d869605e3516cf797d0a6a59f1f8e/003 -Dtest=Checksum_WhiteboxTest#test1 test
```
## IntroClassJavaResults
### Benchmark
* jGenProg: 4 / 297
### WithRef
Fix IntroClassJava submissions with the reference solutions by jGenProg2.
* WithRef_1
  * jGenProg2: 23 / 297
  * Without the tests for the reference

* WithoutRef_1
  * jGenProg2: 4 / 297
  * Without the tests for the reference

* WithRef_2
  * jGenProg2: 23 / 297
  * With the tests for the reference

* WithPool_1
  * jGenProg2: 15 / 297
  * Without the tests for the reference
  * With a pool of every submission in each assignment

* WithPool_2
  * Cardumen: 15 / 297
  * With a pool of every submission in each assignment

* WithRef_3
  * Cardumen: 23 / 297
  * Without the tests for the reference

### Partial Repair

* WithRef_1

  * jGenProg2: 37 / 297

    | Project  | Patches | Total | Percentage |
    | -------- | ------- | ----- | ---------- |
    | median   | 3       | 36    | 8.33%      |
    | smallest | 10      | 32    | 31.25%     |
    | grade    | 20      | 47    | 42.55%     |
    | digits   | 4       | 40    | 10.0%      |
