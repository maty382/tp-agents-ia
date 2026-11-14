FROM eclipse-temurin:17-jre
WORKDIR /app
COPY target/classes /app
CMD ["java", "-cp", ".", "Main"]
