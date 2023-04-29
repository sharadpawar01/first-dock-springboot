FROM openjdk:17-jdk-alpine3.14

RUN mkdir /app

WORKDIR /app

COPY build/libs/first-dock-springboot-*.jar app.jar

EXPOSE 8080


ENTRYPOINT ["java","-jar","app.jar"]