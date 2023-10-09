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
