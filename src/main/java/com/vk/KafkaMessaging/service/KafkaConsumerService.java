package com.vk.KafkaMessaging.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerService {
    @KafkaListener(topics = "messages", groupId = "kafka-users")
    public void consume(String message) {
        System.out.println("Message received: " + message);
    }
}
