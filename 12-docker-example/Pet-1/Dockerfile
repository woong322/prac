FROM openjdk:8
ADD target/docker-springboot-demo.jar	docker-springboot-demo.jar
EXPOSE 9015
ENTRYPOINT ["java", "-jar", "docker-springboot-demo.jar"]