package com.example.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class ListenerClass {


    @KafkaListener(
            autoStartup = "${kafka.auto.start:true}",
            topics = "${kafka.topic}",
            groupId = "${kafka.groupId}",
            containerFactory = "concurrentKafkaListenerContainerFactory"
    )
    public void message(String message) {
        System.out.println("message received : " + message);
    }

}
