# APR-as-AAT

# Search-based Automated Program Repair as Automated Assessment Tools

## ARJA

Repository: https://github.com/yyxhdy/arja

Command:

```sh
java -cp lib/*:bin us.msu.cse.repair.Main Arja -DsrcJavaDir /home/ruizhen/Projects/SSBSE/anonymised-submissions/1/src/main/java/uk/ac/sheffield/com1003/cafe -DbinJavaDir /home/ruizhen/Projects/SSBSE/anonymised-submissions/1/build/classes/java/main -DbinTestDir /home/ruizhen/Projects/SSBSE/anonymised-submissions/1/build/classes/java/test -Ddependences dependency/javaparser-core-3.25.1.jar:dependency/javaparser-core-serialization-3.25.1.jar:dependency/commons-lang3-3.0.jar
```

## Astro

Repository: https://github.com/SpoonLabs/astor

Command:

```
java -cp target/astor-*-jar-with-dependencies.jar fr.inria.main.evolution.AstorMain -mode jgenprog -srcjavafolder /src/main/java/ -srctestfolder /src/test/java/  -binjavafolder /build/classes/java/main/ -bintestfolder  /build/classes/java/test/ -location /home/ruizhen/Projects/SSBSE/anonymised-submissions/1/ -dependencies /home/ruizhen/Projects/SSBSE/dependency
```

