FROM openjdk:11

ADD target/bet-api-0.0.1-SNAPSHOT.jar  bet.jar

ENTRYPOINT ["java","-jar","bet.jar"]

EXPOSE 8081