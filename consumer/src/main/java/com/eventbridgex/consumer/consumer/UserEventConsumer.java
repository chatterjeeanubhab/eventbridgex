package com.eventbridgex.consumer.consumer;

import com.eventbridgex.consumer.model.Event;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class UserEventConsumer {

    @KafkaListener(
            topics = "user-events",
            groupId = "user-group"
    )
    public void consume(Event event) {
        System.out.println("Received Event: " + event);
    }
}