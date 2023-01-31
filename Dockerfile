FROM java:11-jdk
RUN mkdir/app
WORKDIR /app
COPY target/docker-demo-0.0.1-SNAPSHOT.jar /app
EXPOSE 8110

ENTRYPOINT ["java", "-jar", "docker-demo-0.0.1-SNAPSHOT.jar"]