FROM openjdk:17-jdk-slim

ARG DB_URL
ARG DB_USER
ARG DB_PASS
ARG ALLOWED_ORIGIN

WORKDIR /app

COPY . /app

RUN chmod +x mvnw

RUN ./mvnw package

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "/app/target/aabir-0.0.1-SNAPSHOT.jar"]

ENV DB_URL=$DB_URL \
    DB_USER=$DB_USER \
    DB_PASS=$DB_PASS \
    ALLOWED_ORIGIN=$ALLOWED_ORIGIN
