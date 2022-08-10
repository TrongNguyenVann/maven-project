This project is a Java sample project that use Maven tool to manange dependencies and build tool.

Check Maven version: `mvn -v`
Another option we could use is Maven Wrapper: mvnw
By default, Maven will download jar packages from Maven central to .m2/repository

The structure of one Maven/Gradle project is as bellow:

project-name
    pom.xml
    README.md
    src
        main
            java
                package_name
                    Source1.java
                    Source2.java
        test
            java
                package_name
                    Test1.java
                    Test2.java

All project dependencies and task are specified in pom.xml file. Basically, it should includes:
```xml
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
    xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">

    <modelVersion>4.0.0</modelVersion> <!--POM model version, always 4.0.0-->
    <groupId>trongnv</groupId> <!--Group or organization that the project belong to-->
    <artifactId>maven-project</artifactId> <!--Name to the jar/war file-->
    <packaging>jar</packaging> <!--How to package project-->
    <version>0.1.0</version> <!--Version-->

    <properties>
        <maven.compiler.source>1.8</maven.compiler.source> <!--Compiler version-->
        <maven.compiler.target>1.8</maven.compiler.target> <!--Binary target-->
    </properties>

    <dependencies>
        <dependency>
            <groupId>junit</groupId>
            <artifactId>junit</artifactId>
            <version>4.12</version>
            <scope>test</scope> <!--Scope: compile(default): compile and jar packaged/provided: compile only/test: compile and test only-->
        </dependency>

</project>
```

Maven command:
1. To build project: `mvn compile`
This will compile project, all class file is generated at target/classes folder


2. To package project: `mvn package`
This will compile project, run tests and package, jar/war file is generated at target/ folder


3. To test project: `mvn test`
Run all classes ending with Test in src/test/java folder

4. To install: `mvn install`

Note: To create Maven template folder, we could use archetype: `mvn archetype:generate`