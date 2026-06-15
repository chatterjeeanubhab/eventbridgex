package com.eventbridgex.producer.kafka;
import org.springframework.kafka.core.KafkaTemplate;
import com.eventbridgex.producer.model.Event;
import org.springframework.stereotype.Component;
@Component
public class KafkaEventProducer {
    private final KafkaTemplate<String, Event> kafkaTemplate;
    public KafkaEventProducer(KafkaTemplate<String, Event> kafkaTemplate){
        this.kafkaTemplate = kafkaTemplate;
    }
    public void send(Event event){
        kafkaTemplate.send("user-events", event);
    }
}
