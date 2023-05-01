# Backend

This is a sample Spring Boot application (2.7.11) backed by JDK 17. It uses Postgresql as the database, with configuration specified in the application.properties file. CORS settings are also available in the application.properties file, with the following values needing to be configured:

- `spring.datasource.url=${DB_URL}`
- `spring.datasource.username=${DB_USER}`
- `spring.datasource.password=${DB_PASS}`
- `allowed.origins=${ALLOWED_ORIGIN}`

## Building and Running

To build the application into a single jar file, run the following command:
`mvn clean install`

To run the application locally, use the following command:
`mv spring-boot:run`

## Docker Image
To build a Docker image for the application, use the included Dockerfile. The following arguments need to be passed while running the image:
- `DB_URL`: the URL of the Postgresql database
- `DB_USER`: the username for the Postgresql database
- `DB_PASS`: the password for the Postgresql database
- `ALLOWED_ORIGIN`: the allowed origin for CORS settings

To build the Docker image, use the following command:

`docker build -t my-app-image .`

To run the Docker image, use the following command, replacing the values for the arguments with your own:

```docker run -e DB_URL=my-db-url -e DB_USER=my-db-user -e DB_PASS=my-db-pass -e ALLOWED_ORIGIN=my-allowed-origin -p 8080:8080 my-app-image```
