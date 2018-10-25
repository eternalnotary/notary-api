FROM openjdk:11-jdk-slim
COPY target/notary-api*.jar notary-api.jar
CMD java ${JAVA_OPTS} -jar notary-api.jar