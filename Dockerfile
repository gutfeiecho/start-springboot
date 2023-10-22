# set java version
FROM java:17.0.2

# set volume
VOLUME /tmp

# copy and run jar
ADD  start_springboot_maven-0.0.1-SNAPSHOT.jar /start_springboot_maven.jar

# create start_springboot_maven.jar
RUN bash -c "touch /start_springboot_maven.jar"

# set JVM
ENV JAVA_OPTS="\
-server \
-Xms256m \
-Xms512m \
-XX:MetaspaceSize=256m \
-XX:MaxMetaspaceSize=512m"

# set params
ENV PARAMS=""

# entry
ENTRYPOINT ["java -jar $JAVA_OPTS start_springboot_maven.jar $PARAMS"]