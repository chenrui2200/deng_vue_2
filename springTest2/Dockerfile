# 基础镜像使用java
FROM openjdk:8-jdk

WORKDIR /app

# 将jar包添加到容器
COPY target/*.jar /app/app.jar

# 暴露端口
EXPOSE 8080

# 入口点
CMD ["/bin/sh","-c","java -jar /app/app.jar"]