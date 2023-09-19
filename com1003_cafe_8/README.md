# APR-as-AAT

# Test Augmentation with EvoSuite

## Working with existing tests

**Coverage Measurement**

```sh
$EVOSUITE -measureCoverage -class uk.ac.sheffield.com1003.cafe.Cafe -Djunit=uk.ac.sheffield.com1003.cafe.junit4.TestCafeTask1 -criterion branch -projectCP build/classes/java/main:build/classes/java/test
```

**Results**

```
* Finished: ClassName: uk.ac.sheffield.com1003.cafe.junit4.TestCafeTask1, MethodName: testCoffeeConstructor
* Number of test cases executed: 10
* Executed 10 unit test(s)
* Target class uk.ac.sheffield.com1003.cafe.Cafe
* Coverage of criterion BRANCH: 27%
* Number of covered goals: 12 / 45
* Total number of covered goals: 12 / 45
* Total coverage: 27%
* Computation finished
* Writing statistics
```



### EvoSuite<sub>amp</sub>

```sh
sh evosuite.sh
```

