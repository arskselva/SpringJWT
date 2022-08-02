FROM java

COPY ./target/spjwt*.jar /usr/app/spjwt.jar

WORKDIR /usr/app

EXPOSE 8090

ENTRYPOINT ["java","-jar","spjwt.jar"]