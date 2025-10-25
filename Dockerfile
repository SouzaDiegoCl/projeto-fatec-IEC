# Dockerfile simples para display no render
FROM maven:3.9.9-eclipse-temurin-21 AS build

WORKDIR /app

COPY . .

# Compila e gera o JAR
RUN mvn clean package -DskipTests

FROM eclipse-temurin:21-jre

WORKDIR /app

#Copia o jar
COPY --from=build /app/target/*.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar"]