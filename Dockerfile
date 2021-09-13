FROM openjdk:15-slim
LABEL maintainer="minseok.lee@sk.com"
EXPOSE 8080
ENV DB_HOST=localhost \
    DB_PORT=3306
COPY build/libs/order-0.0.1-SNAPSHOT.war app.war
CMD java -jar /app.war --spring.datasource.hikari.jdbc-url="jdbc:mysql://${DB_HOST}:${DB_PORT}/order?serverTimezone=UTC&characterEncoding=UTF-8" \
     --spring.datasource.hikari.username="${DB_USERNAME}" --spring.datasource.hikari.password="${DB_PASSWORD}" \
     --spring.flyway.url="jdbc:mysql://${DB_HOST}:${DB_PORT}/order?serverTimezone=UTC&characterEncoding=UTF-8" \
     --spring.flyway.username="${DB_USERNAME}" \
     --spring.flyway.password="${DB_PASSWORD}"