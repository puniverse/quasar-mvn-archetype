# *quasar-mvn-archetype*

A [Parallel Universe Quasar](http://www.paralleluniverse.co/quasar/) Maven archetype for standalone Java 1.7+ applications.

## Getting started

```
git clone https://github.com/circlespainter/quasar-mvn-archetype
cd quasar-mvn-archetype
mvn install
cd ..
mvn archetype:generate -DarchetypeGroupId=co.paralleluniverse -DarchetypeArtifactId=quasar-mvn-archetype -DarchetypeVersion=0.1.0-SNAPSHOT -DgroupId=testgrp -DartifactId=testprj
cd test
mvn test
mvn clean compile dependency:properties exec:exec
```