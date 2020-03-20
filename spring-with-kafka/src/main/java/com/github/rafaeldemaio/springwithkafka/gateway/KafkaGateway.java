package com.github.rafaeldemaio.springwithkafka.gateway;

public interface KafkaGateway<T> {
    void sendToKafkaTopic(T object);
    void consumeFromKafkaTopic(T message);
}
