# Use a base image with JDK 24
FROM openjdk:24-slim

# Set the working directory
WORKDIR /app

# Copy the jar file to the container
COPY target/test-hello-0.0.1-SNAPSHOT.jar app.jar

# Expose the port defined in application.properties
EXPOSE 6380

# Command to run the application
ENTRYPOINT ["java", "-jar", "app.jar"]
