FROM openjdk:8-jre-alpine

COPY build/libs/search-0.0.1-SNAPSHOT.jar /opt/search-service/
COPY config/application.yml /opt/search-service/config/

WORKDIR /opt/

RUN mkdir appConfig

WORKDIR /opt/search-service/

RUN mkdir logs


ENTRYPOINT java -Dloader.path=file:/opt/search-service/config/*  -jar ./search-0.0.1-SNAPSHOT.jar org.springframework.boot.loader.PropertiesLauncher --spring.config.location=/opt/search-service/config/application.yml

EXPOSE 9090