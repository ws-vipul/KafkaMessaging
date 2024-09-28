package com.vk.KafkaMessaging.controller;

import com.vk.KafkaMessaging.constants.ApiConstants;
import com.vk.KafkaMessaging.service.KafkaProducerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KafkaController {

    private final KafkaProducerService kafkaProducerService;

    public KafkaController(KafkaProducerService kafkaProducerService) {
        this.kafkaProducerService = kafkaProducerService;
    }

    @GetMapping(ApiConstants.SEND_MESSAGE)
    public String broadcastMessage(@PathVariable("message") String message) {
        kafkaProducerService.sendMessage(message);
        return "Message has been send successfully";
    };
}
