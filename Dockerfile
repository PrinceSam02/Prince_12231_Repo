FROM openjdk:18
WORKDIR /app
COPY ./target/Handicraft-0.0.1-SNAPSHOT.jar /app
EXPOSE 8080
CMD ["java", "-jar", "Handicraft-0.0.1-SNAPSHOT.jar"]
