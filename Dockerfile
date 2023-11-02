# Use uma imagem base com suporte ao Java 17
FROM openjdk:17-jdk

# Copie o JAR da sua aplicação para o contêiner
COPY target/auth-0.0.1-SNAPSHOT.jar /app/app.jar

# Exponha a porta em que a aplicação vai rodar
EXPOSE 8080

# Comando para iniciar a aplicação Spring Boot
CMD ["java", "-jar", "/app/app.jar"]
