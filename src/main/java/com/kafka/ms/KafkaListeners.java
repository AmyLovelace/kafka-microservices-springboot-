package com.kafka.ms;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    @KafkaListener(
            topics = "amy",
            groupId = "groupId"
    )
    void listener(String data ){
        System.out.println("listener " + data + " \uD83D\uDE0E");

    }
}
