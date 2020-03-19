package com.github.rafaeldemaio.springwithkafka.usecase.impl;

import com.github.rafaeldemaio.springwithkafka.entity.User;
import com.github.rafaeldemaio.springwithkafka.gateway.KafkaGateway;
import com.github.rafaeldemaio.springwithkafka.usecase.SendUserToKafkaTopic;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SendUserToKafkaTopicImpl implements SendUserToKafkaTopic {

    private final KafkaGateway gateway;
    @Override
    public void execute(User user) {
        gateway.sendToKafkaTopic(user);
    }
}
