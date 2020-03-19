package com.github.rafaeldemaio.springwithkafka.usecase;

import com.github.rafaeldemaio.springwithkafka.entity.User;

public interface SendUserToKafkaTopic {
    void execute(User user);
}