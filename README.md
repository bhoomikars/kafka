# kafka
kafka producer consumer setup
File:
producer config -> producerFactory bean
consuemr config -> consumerFactory bean
sendMessageController -> to push message to kafka topic
listener -> to read the message from topic

start zookeeper:
bin/zookeeper-server-start.sh config/zookeeper.properties

start kafka server :
bin/kafka-server-start  config/server.properties

To create the topic: topicName : topicName

kafka_2.13-3.2.0 kafka-topics --create --bootstrap-server localhost:9092 --replication-factor 1 --partitions 1 --topic topicName
 
 

To listen :

consumerGroupId: hello

/bin/kafka-console-consumer.sh --topic topicName --from-beginning --group hello --bootstrap-server localhost:9092 --consumer.config ./config/config.properties
