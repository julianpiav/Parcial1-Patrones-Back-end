# Dockerfile para el Back-end
FROM openjdk:17-jdk-slim

WORKDIR /app

COPY build/libs/Parcial1.jar .

EXPOSE 8080

CMD ["java", "-jar", "Parcial1.jar"]
