From openjdk:17-oracle
COPY build/libs/calculatot-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["jave", "-jar", "app.jar"]