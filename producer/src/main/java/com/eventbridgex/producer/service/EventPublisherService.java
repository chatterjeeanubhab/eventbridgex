package com.eventbridgex.producer.service;
import java.time.Instant;
import java.util.UUID;
import com.eventbridgex.producer.model.*;
import org.springframework.stereotype.Service;
import com.eventbridgex.producer.kafka.KafkaEventProducer;
@Service
public class EventPublisherService {

    private final KafkaEventProducer kafkaEventProducer;

    public EventPublisherService(KafkaEventProducer kafkaEventProducer) {
        this.kafkaEventProducer = kafkaEventProducer;
    }

    public Event publishUserCreatedEvent(CreateUserRequest request){

        Long userId = Math.abs(UUID.randomUUID().getMostSignificantBits());

        UserPayload payload = new UserPayload(
                userId,
                request.getName(),
                request.getEmail()
        );

        Event event = new Event(
                UUID.randomUUID(),
                Instant.now(),
                EventType.USER_CREATED,
                payload
        );

        kafkaEventProducer.send(event);

        return event;
    }
}