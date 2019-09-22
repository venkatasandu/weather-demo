
FROM openjdk:8-jdk-alpine

MAINTAINER venkat

#VOLUME /f/projects/weather-api-demo/tmp

EXPOSE 127.0.0.1:80:8082

#ARG JAR_FILE=./target/weather-api-demo-0.0.1-SNAPSHOT.jar

ADD target/weather-api-demo-0.0.1-SNAPSHOT.jar weather-demo.jar

#run the jar file
ENTRYPOINT ["java", "-jar", "/weather-demo.jar"]
