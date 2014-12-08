# *quasar-maven-archetype*

A [Parallel Universe Quasar](http://www.paralleluniverse.co/quasar/) Maven archetype for standalone Java 1.7+ applications.

## Getting started

```
git clone https://github.com/circlespainter/quasar-maven-archetype
cd quasar-maven-archetype
mvn install
cd ..
mvn archetype:generate -DarchetypeGroupId=quasar-maven-archetype -DarchetypeArtifactId=quasar-maven-archetype -DarchetypeVersion=0.1.0-SNAPSHOT -DgroupId=testgroup -DartifactId=test
cd test
mvn test
mvn clean compile dependency:properties exec:exec
```