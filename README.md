# kafka
kafka producer consumer setup
File:
producer config -> producerFactory bean

consuemr config -> consumerFactory bean


sendMessageController -> to push message to kafka topic


listener -> to read the message from topic

start zookeeper:
./bin/zookeeper-server-start.sh config/zookeeper.properties

start kafka server :
./bin/kafka-server-start.sh config/server.properties

To create the topic: topicName : topicName

kafka_2.13-3.2.0 kafka-topics --create --bootstrap-server localhost:9092 --replication-factor 1 --partitions 1 --topic topicName
 
To list the kafka topics:

./bin/kafka-topics.sh --bootstrap-server=localhost:9092 --list

To listen :

consumerGroupId: hello

./bin/kafka-console-consumer.sh --topic topicName --from-beginning --group hello --bootstrap-server localhost:9092 --consumer.config ./config/config.properties

partitions = 40 , concurrency = 5 , 8 consumers assigned to each partition

make sure your threads are allways lesser than the number of partitions
<img width="1632" alt="Screenshot 2023-04-16 at 7 50 08 PM" src="https://user-images.githubusercontent.com/57263117/232319345-d5da3a89-e4d9-4772-a2b8-3517af15cbcb.png">

<img width="1678" alt="Screenshot 2023-04-16 at 8 23 04 PM" src="https://user-images.githubusercontent.com/57263117/232321312-51e35a7e-5805-4214-b547-e5a0fef33b52.png">


