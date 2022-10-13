[![Release](https://jitpack.io/v/umjammer/vavi-archetype.svg)](https://jitpack.io/#umjammer/vavi-archetype)
![Java](https://img.shields.io/badge/Java-8-b07219)

# vavi-archetype

vavi-archetype is a minimul archetype for maven

## Usage

add profile into `~/.m2/settings.xml` ([see](https://maven.apache.org/archetype/maven-archetype-plugin/archetype-repository.html))

```xml
     <profile>
      <id>archetype</id>
      <repositories>
        <repository>
          <id>archetype</id> <!-- id expected by maven-archetype-plugin to avoid fetching from everywhere -->
          <url>https://jitpack.io </url>
        </repository>
      </repositories>
    </profile>
```

run w/ profile name

```shell
 $ mvn -P archetype archetype:generate \
  -DarchetypeGroupId=vavi              \
  -DarchetypeArtifactId=vavi-archetype \
  -DarchetypeVersion=0.0.4             \
  -DgroupId=vavi                       \
  -DartifactId=vavi-test-sample1       \
  -Dversion=0.0.1-SNAPSHOT
```
