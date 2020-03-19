package com.github.rafaeldemaio.springwithkafka.gateway;

import com.github.rafaeldemaio.springwithkafka.entity.User;

public interface KafkaGateway {
    void sendToKafkaTopic(User object);
    void consumeFromKafkaTopic(String message);
}
