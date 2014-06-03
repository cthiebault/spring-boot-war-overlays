# Spring Boot & Maven war overlay

This project try to use Spring Boot with Maven war overlay feature.

This project has 2 war modules:

* **dependency-webapp**: basic webapp serving just html (/dependency/index.html)
* **main-webapp**: Spring Boot webapp (copied from Spring Guides [gs-serving-web-content](https://github.com/spring-guides/gs-serving-web-content)). This webapp has a dependency on **dependency-webapp**.
 
Run the webapp:
 
 ```
 mvn install
 cd main-webapp
 mvn spring-boot:run
 ```
