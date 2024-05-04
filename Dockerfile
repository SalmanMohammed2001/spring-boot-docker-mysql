FROM openjdk:17
ADD target/springboot-mysql-docker-mysql.jar springboot-mysql-docker-mysql.jar
ENTRYPOINT ["java","-jar","/springboot-mysql-docker-mysql.jar"]