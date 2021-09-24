FROM azul/zulu-openjdk:11

ARG JAR_FILE=build/libs/springboot-azure-kubernetes-0.0.1-SNAPSHOT.jar

COPY ${JAR_FILE} springboot-azure-kubernetes.jar

ENTRYPOINT ["java","-jar","/springboot-azure-kubernetes.jar"]