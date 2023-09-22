package com.example.prodecer.controller;

import com.example.prodecer.kafka.KafkaProducer;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class KafkaController {

    private KafkaProducer kafkaProducer;

    public KafkaController(KafkaProducer kafkaProducer) {
        this.kafkaProducer = kafkaProducer;
    }

    @GetMapping()
    public ResponseEntity<String> publish(@RequestParam("message") String message) {
        kafkaProducer.sendMessage(message);
        return ResponseEntity.ok("Message sent to the topic");
    }



}
