FROM maven:3-openjdk-18-slim AS build

# fetch maven dependencies
WORKDIR /home/app
COPY pom.xml pom.xml
RUN mvn dependency:go-offline

# build
COPY src src
RUN mvn clean package

# get result from build stage
FROM eclipse-temurin:18.0.1_10-jre
WORKDIR /home/app
COPY --from=build /home/app/target/*.jar /usr/local/lib/alm-vg.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/usr/local/lib/alm-vg.jar"]