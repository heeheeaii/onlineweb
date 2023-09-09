FROM openjdk:17.0.2


RUN ln -sf /usr/share/zoneinfo/Asia/Shanghai /etc/localtime

RUN mkdir -p /opt/projects/onlineweb

WORKDIR /opt/projects/onlineweb

ADD ./onlineweb-admin/target/onlineweb-admin-0.0.1-SNAPSHOT.jar ./

EXPOSE 8085

CMD java -jar -Xms512m -Xmx512m -Xss256k -XX:SurvivorRatio=8 -XX:+UseConcMarkSweepGC -Dspring.profiles.active=docker onlineweb-admin-0.0.1-SNAPSHOT.jar
