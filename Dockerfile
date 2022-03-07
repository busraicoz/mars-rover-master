#
# Build stage
#
FROM maven:3.8.4-jdk-8-slim AS build
ADD . ./marsrover
WORKDIR /marsrover
RUN mvn clean install -DskipTests

#
# Package stage
#
FROM openjdk:8-jre-alpine
COPY --from=build ./marsrover/target/*.jar marsrover.jar
ENTRYPOINT ["java","-jar","/marsrover.jar"]