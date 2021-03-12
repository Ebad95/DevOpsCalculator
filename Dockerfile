FROM openjdk:8
MAINTAINER Ebad Husain
COPY ./target/DevOpsCalculator-1.0-SNAPSHOT-jar-with-dependencies.jar ./
WORKDIR ./
CMD ["java", "-jar", "DevOpsCalculator-1.0-SNAPSHOT-jar-with-dependencies.jar"]