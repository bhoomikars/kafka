package com.example.kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KafkaSendMessageController {

    @Autowired
    KafkaTemplate kafkaTemplate;

    @PostMapping("/sendMessage/{message}")
    public ResponseEntity<String> sendMessage(@PathVariable("message") String message) {
        kafkaTemplate.send("topicName", message);
        return ResponseEntity.status(HttpStatus.OK).body("sent");
    }
}
