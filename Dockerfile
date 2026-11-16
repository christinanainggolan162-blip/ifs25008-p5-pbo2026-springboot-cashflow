FROM eclipse-temurin:25-jre
WORKDIR /app
# JAR dibuat dengan: ./mvnw clean package -Pproduction
COPY target/*-SNAPSHOT.jar app.jar
ENV APP_PORT=8080 UPLOAD_DIR=/app/uploads
VOLUME /app/uploads
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/app/app.jar"]
