package com.github.rafaeldemaio.springwithkafka.gateway.impl;

import com.github.rafaeldemaio.springwithkafka.entity.User;
import com.github.rafaeldemaio.springwithkafka.gateway.KafkaGateway;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@Log4j2
@RequiredArgsConstructor
public class KafkaGatewayImpl implements KafkaGateway {

    private static final String TOPIC = "users";

    private final KafkaTemplate<String, String> kafkaTemplate;

    @Override
    public void sendToKafkaTopic(User object) {
        log.info(String.format("#### -> Producing Message -> %s", object.toString()));
        kafkaTemplate.send(TOPIC, object.toString());
    }

    @Override
    @KafkaListener(topics = TOPIC)
    public void consumeFromKafkaTopic(String message) {
        log.info(String.format("#### -> Consuming Message -> %s", message));
    }
}
