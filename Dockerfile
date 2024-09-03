# 使用官方Java运行时环境作为基础镜像  
FROM openjdk:17-alpine   
  
# 设置工作目录为/app  
WORKDIR /app
  
# 将jar包复制到容器的/app目录下  
# 注意：这里假设你的jar包已经通过Maven或Gradle构建好了，并且位于构建目录（如target）中  
# 你需要将这个jar包复制到Dockerfile所在的目录，或者修改COPY指令的路径  
# 将本地 jar 包添加到容器中 /app  
ARG JAR_FILE=target/*.jar  
COPY ${JAR_FILE} /app/app.jar  
  
# 暴露容器的8080端口（或者你的Spring Boot应用实际监听的端口）  
EXPOSE 8080  
  
# 定义容器启动时执行的命令  
ENTRYPOINT ["java","-jar","/app/app.jar"]
