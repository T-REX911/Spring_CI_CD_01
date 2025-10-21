# Use a base image with JDK 24
FROM openjdk:24-slim

# Set the working directory
#WORKDIR /app

# Copy the jar file to the container
ADD target/spring_ci_cd_01.jar spring_ci_cd_01.jar

# Expose the port defined in application.properties
EXPOSE 6380

# Command to run the application
ENTRYPOINT ["java", "-jar", "spring_ci_cd_01.jar"]
