FROM java

COPY ./target/SpJWT*.jar /usr/app/spjwt.jar

WORKDIR /usr/app

EXPOSE 8090

ENTRYPOINT ["java","-jar","spjwt.jar"]