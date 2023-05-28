FROM maven:3.8.4-openjdk-17-slim AS build

COPY . /app
WORKDIR /app


RUN mvn javadoc:javadoc
RUN mvn clean package -DskipTests


EXPOSE 8080
CMD ["java", "-jar", "target/smartmenu-0.0.1-SNAPSHOT.jar"]


