# NERO

## About

### Authors

### Publication

## Study

### APR Tool Selection

We perform the APR tool selection process based on the existing APR tools from [program-repair.org](https://program-repair.org/tools.html).

Inclusion criteria:

1. applicable for Java program repair
2. publicly available
3. not aimed at repairing *only* specific types of faults, e.g., concurrency
4. unrestricted repair scopes/operators (e.g., not limited to only repairing conditional statements)
5. not built exclusively for existing benchmarks (e.g., Defects4J)
6. use a redundancy-based approach, (i.e., able to use existing code as repair ingredients)
7. executable without compilation errors (or errors solvable with reasonable efforts)

| Tool          | I1   | I2   | I3   | I4   | I5   | I6   | I7   |
| ------------- | ---- | ---- | ---- | ---- | ---- | ---- | ---- |
| ACS           | ✅    |      |      | ❌    |      |      |      |
| ARJA          | ✅    | ✅    | ✅    | ✅    | ✅    | ✅    | ✅    |
| AVATAR        | ✅    |      |      |      | ❌    | ❌    |      |
| jGenProg2     | ✅    | ✅    | ✅    | ✅    | ✅    | ✅    | ✅    |
| jKali         | ✅    |      |      | ❌    |      |      |      |
| jMutRepair    | ✅    |      |      | ❌    |      |      |      |
| Cardumen      | ✅    | ✅    | ✅    | ✅    | ✅    | ✅    | ✅    |
| DeepRepair    | ✅    |      |      |      |      |      | ❌    |
| CapGen        | ✅    |      |      |      | ❌    |      |      |
| ConFix        | ✅    |      |      |      |      |      | ❌    |
| GenPat        | ✅    |      |      |      |      |      | ❌    |
| Genesis       | ✅    |      |      |      |      |      | ❌    |
| HIPPODROME    | ✅    |      | ❌    |      |      |      |      |
| HistoricalFix | ✅    |      |      |      |      |      | ❌    |
| JAID          | ✅    |      |      |      | ❌    |      |      |
| JFix          | ✅    |      |      | ❌    |      | ❌    | ❌    |
| JaRFly        | ✅    |      |      |      |      |      | ❌    |
| LSRepair      | ✅    |      |      |      | ❌    |      | ❌    |
| NPEFix        | ✅    |      |      |      |      | ❌    |      |
| Nopol         | ✅    |      |      |      |      | ❌    |      |
| QACrashFix    | ✅    | ❌    |      |      |      |      |      |
| Repairnator   | ✅    |      | ❌    |      |      |      |      |
| SimFix        | ✅    |      |      |      | ❌    |      |      |
| SketchFix     | ✅    |      |      |      |      |      | ❌    |
| TBar          | ✅    |      |      |      | ❌    |      |      |
| kGenProg      | ✅    | ✅    | ✅    | ✅    | ✅    | ✅    | ✅    |
| kPAR          | ✅    |      |      |      | ❌    |      |      |
| ssFix         | ✅    |      |      |      |      |      | ❌    |

## Test Generation

Java type and method descriptors: https://asm.ow2.io/asm4-guide.pdf

**Cafe**

`Cafe.greeting`: `greeting()Ljava/lang/String;`

`Cafe.placeOrder`: `placeOrder(Ljava/lang/String;Ljava/lang/String;D)Z`

`Cafe.printPendingOrders`: `printPendingOrders()V`

`Cafe.removeRecipe`: `removeRecipe(Ljava/lang/String;)V`

`Cafe.serveOrder`: `serveOrder()Luk/ac/sheffield/com1003/cafe/Order;`

`Cafe.printMenu`: `printMenu()V`

```
java -jar evosuite-1.2.0.jar -Dtarget_method_list="printMenu()V" -class uk.ac.sheffield.com1003.cafe.Cafe -projectCP build/classes/java/main -criterion branch
```

**Coffee**

`Coffee.equals`

**Milk**

**Water**

**Recipe**

