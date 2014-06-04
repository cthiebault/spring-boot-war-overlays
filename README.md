# Spring Boot & Maven war overlay

Project to test Spring Boot, Maven war overlay and extra dir on classpath:
  
* [http://stackoverflow.com/questions/24025004/spring-boot-maven-war-overlay](http://stackoverflow.com/questions/24025004/spring-boot-maven-war-overlay)

This project has 2 war modules:

* **dependency-webapp**: basic webapp serving just html (/dependency/index.html)
* **main-webapp**: Spring Boot webapp (copied from Spring Guides [gs-serving-web-content](https://github.com/spring-guides/gs-serving-web-content)). This webapp has a dependency on **dependency-webapp**.

Run the webapp:
 
```
mvn install
java -jar main-webapp/target/main-webapp-0.1.0-SNAPSHOT.war  # mvn spring-boot:run does not work with war overlay
```
 