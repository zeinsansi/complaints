FROM openjdk:21
VOLUME /tmp
EXPOSE 8001
ARG JAR_FILE=target/complaints-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]