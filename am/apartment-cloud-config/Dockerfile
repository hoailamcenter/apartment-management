FROM openjdk:11-jre-slim

WORKDIR /app

COPY target/*.jar config.jar

EXPOSE ${CLOUD_CONFIG_PORT}

ENV CLOUD_CONFIG_PORT=${CLOUD_CONFIG_PORT}
ENV EUREKA_ZONE_URI=${EUREKA_ZONE_URI}

CMD ["java", "-jar", "config.jar"]
