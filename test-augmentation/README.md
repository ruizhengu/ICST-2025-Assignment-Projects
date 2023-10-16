# Test Augumentation

## fix_introclass.py

This is a sanity check of the hypothesis of expanding the search space can help search-based APR tools for fixing programming assignments.

IntroClassJava dataset: https://github.com/Spirals-Team/IntroClassJava

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
