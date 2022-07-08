#FROM adoptopenjdk/openjdk15:ubi
#ENV APP_HOME=/USR/APP/
#WORKDIR $APP_HOME
#COPY .mvn/ ./mvn
#COPY mvnw pom.xml ./
#RUN ./mvnw dependency:go-offline
#COPY src  ./src
#EXPOSE 8080
#CMD ["./mvnw", "spring-boot:run"]

FROM openjdk:11
ADD target/firstprod.jar firstprod.jar
ENTRYPOINT ["java", "-jar","firstprod.jar"]
EXPOSE 8080