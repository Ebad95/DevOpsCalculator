FROM openjdk:8
MAINTAINER Ebad Husain
COPY ./target/DevOpsCalculator-1.0-SNAPSHOT.jar ./
WORKDIR ./
CMD ["java", "-cp", "DevOpsCalculator-1.0-SNAPSHOT.jar", "Calculator"]