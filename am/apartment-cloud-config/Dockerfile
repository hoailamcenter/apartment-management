FROM eclipse-temurin:11-jdk-alpine

WORKDIR /app

COPY target/*.jar config.jar

COPY src/main/resources/banner.txt /app/banner.txt

EXPOSE ${CLOUD_CONFIG_PORT}

CMD ["java", "-jar", "config.jar"]
