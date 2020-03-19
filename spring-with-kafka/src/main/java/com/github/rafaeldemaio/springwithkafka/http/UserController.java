package com.github.rafaeldemaio.springwithkafka.http;

import com.github.rafaeldemaio.springwithkafka.entity.User;
import com.github.rafaeldemaio.springwithkafka.usecase.SendUserToKafkaTopic;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {

    private final SendUserToKafkaTopic sendUserToKafkaTopic;

    @PostMapping
    public void sendUserToKafka(@RequestBody User user) {
        sendUserToKafkaTopic.execute(user);
    }
}
