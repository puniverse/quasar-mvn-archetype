# *quasar-mvn-archetype*

A [Parallel Universe Quasar](http://www.paralleluniverse.co/quasar/) Maven archetype for standalone Java 1.7+ applications.

## Getting started

```
git clone https://github.com/circlespainter/quasar-mvn-archetype
cd quasar-mvn-archetype
mvn install
cd ..
mvn archetype:generate -DarchetypeGroupId=co.paralleluniverse -DarchetypeArtifactId=quasar-mvn-archetype -DarchetypeVersion=0.1.0 -DgroupId=testgrp -DartifactId=testprj
cd testprj
mvn test
mvn clean compile dependency:properties exec:exec

Other useful properties to set during project generation are `-DjavaVersion=<1.7|1.8> -DquasarVersion=<quasarVersion, e.g. 0.6.2> -DinstrumentationMethod=<agent|aot|classloader>`.
```
