run-mvn:
	mvn spring-boot:run


run-java:
	mvn install
	java -Dloader.path=config,main-webapp/target/main-webapp-0.1.0-SNAPSHOT.jar -jar main-webapp/target/main-webapp-0.1.0-SNAPSHOT.jar
