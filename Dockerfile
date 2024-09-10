FROM openjdk:17-alpine
VOLUME /tmp
ADD ./servicio-websocket.jar servicio-websocket.jar
ENTRYPOINT ["java","-jar","/servicio-websocket.jar"]
