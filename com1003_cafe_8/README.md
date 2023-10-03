# APR-as-AAT

# com1003_cafe

This is the orignal version of the **com1003_cafe** project, only changing the Java version from 17 to 8.

# Randoop

```shell
java -Xmx3000m -classpath com1003_cafe_8/build/classes/java/main:randoop-all-4.3.2.jar randoop.main.Main gentests --classlist=classes.txt --no-error-revealing-tests=true --time-limit=60 --junit-output-dir=randoop-output
```

