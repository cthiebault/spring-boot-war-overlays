# Spring Boot & Maven war overlay

Project to test Spring Boot, Maven war overlay and extra dir on classpath:
* [https://github.com/spring-projects/spring-boot/issues/1030](https://github.com/spring-projects/spring-boot/issues/1030)
* [http://stackoverflow.com/questions/24025004/spring-boot-maven-war-overlay](http://stackoverflow.com/questions/24025004/spring-boot-maven-war-overlay)

This project has 2 war modules:

* **dependency-webapp**: basic webapp serving just html (/dependency/index.html)
* **main-webapp**: Spring Boot webapp (copied from Spring Guides [gs-serving-web-content](https://github.com/spring-guides/gs-serving-web-content)). This webapp has a dependency on **dependency-webapp**.

Run the webapp:
 
```
mvn install
java -jar main-webapp/target/main-webapp-0.1.0-SNAPSHOT.war  # mvn spring-boot:run does not work with war overlay
```
 
```
Caused by: java.io.FileNotFoundException: class path resource [config-ext.properties] cannot be opened because it does not exist
	at org.springframework.core.io.ClassPathResource.getInputStream(ClassPathResource.java:158)
	at org.springframework.core.io.support.EncodedResource.getInputStream(EncodedResource.java:143)
	at org.springframework.core.io.support.PropertiesLoaderUtils.fillProperties(PropertiesLoaderUtils.java:98)
	at org.springframework.core.io.support.PropertiesLoaderUtils.fillProperties(PropertiesLoaderUtils.java:72)
	at org.springframework.core.io.support.PropertiesLoaderUtils.loadProperties(PropertiesLoaderUtils.java:58)
	at org.springframework.core.io.support.ResourcePropertySource.<init>(ResourcePropertySource.java:64)
	at org.springframework.core.io.support.ResourcePropertySource.<init>(ResourcePropertySource.java:73)
	at org.springframework.context.annotation.ConfigurationClassParser.processPropertySource(ConfigurationClassParser.java:319)
	at org.springframework.context.annotation.ConfigurationClassParser.doProcessConfigurationClass(ConfigurationClassParser.java:227)
	at org.springframework.context.annotation.ConfigurationClassParser.processConfigurationClass(ConfigurationClassParser.java:205)
	at org.springframework.context.annotation.ConfigurationClassParser.parse(ConfigurationClassParser.java:173)
	at org.springframework.context.annotation.ConfigurationClassParser.doProcessConfigurationClass(ConfigurationClassParser.java:241)
	at org.springframework.context.annotation.ConfigurationClassParser.processConfigurationClass(ConfigurationClassParser.java:205)
	at org.springframework.context.annotation.ConfigurationClassParser.parse(ConfigurationClassParser.java:182)
	at org.springframework.context.annotation.ConfigurationClassParser.parse(ConfigurationClassParser.java:152)
	... 18 more
```