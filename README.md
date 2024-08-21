This simple project contains 2 parts: kafka producer and kafka consumer in corresponding branches.

This Kafka project uses ZooKeeper as Broker management technique.
Kafka version: 3.8.0
Java logic is written in SpringBoot with the use if JPA to persist messages consumed to MySQL databases.
JDK version: 17.0

To run this application on Windows Environment:
1. Start ZooKeeper: bin\windows\zookeeper-server-start.bat config\zookeeper.properties
2. Start Kafka Server: bin\windows\kafka-server-start.bat config\server.properties
3. Run Producer App in IDE
4. Run Consumer App in IDE
5. Use Postman to trigger the RESTful API to start the message production. Access http://localhost:8082/location

Results:
100 consumed messages are written into MySQL database
