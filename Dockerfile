FROM openjdk:11
EXPOSE 8081
ADD target/spring-boot-img.jar spring-boot-img.jar
ENTRYPOINT ["java","-jar","/spring-boot-img.jar"]


