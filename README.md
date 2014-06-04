# Spring Boot & Maven war overlay

Project to show Spring Boot & Maven war overlay errors:   
[http://stackoverflow.com/questions/24025004/spring-boot-maven-war-overlay](http://stackoverflow.com/questions/24025004/spring-boot-maven-war-overlay)

This project has 2 war modules:

* **dependency-webapp**: basic webapp serving just html (/dependency/index.html)
* **main-webapp**: Spring Boot webapp (copied from Spring Guides [gs-serving-web-content](https://github.com/spring-guides/gs-serving-web-content)). This webapp has a dependency on **dependency-webapp**.

Run the webapp:
 
 ```
 mvn install
 cd main-webapp
 mvn spring-boot:run
 ```
 
 Go to 
 * [http://localhost:8080/index.html](http://localhost:8080/index.html) --> OK
 * [http://localhost:8080/main/index.html](http://localhost:8080/main/index.html) --> OK
 * [http://localhost:8080/dependency/index.html](http://localhost:8080/dependency/index.html) --> ERROR 404


## I'm not able to access HTML files from the war dependency... 

Even if these HTML files are packaged in the war file:

**main-webapp-0.1.0-SNAPSHOT.war**

```
- dependency    (from dependency-webapp)
  \- index.html
- main          (from main-webapp)
  \- index.html
- META-INF
- WEB-INF
- index.html
```
