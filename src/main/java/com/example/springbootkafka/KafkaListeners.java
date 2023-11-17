package com.example.springbootkafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    @KafkaListener(
            topics = "amigoscode",
            groupId = "group_id"
    )
    void listener(Message data){
        // yellow system.out.println : received data from kafka
        System.out.println("\u001B[33m" + "Received data from Kafka:" + data.message().toUpperCase() +  " 🎉" + "\u001B[0m");

    }
}
