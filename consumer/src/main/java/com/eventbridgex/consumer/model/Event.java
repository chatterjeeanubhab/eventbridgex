package com.eventbridgex.consumer.model;

import lombok.Data;
import java.time.Instant;
import java.util.UUID;

public class Event {

    private UUID eventId;
    private Instant timestamp;
    private EventType eventType;
    private UserPayload payload;

    public Event() {
    }

    public Event(UUID eventId,
                 Instant timestamp,
                 EventType eventType,
                 UserPayload payload) {
        this.eventId = eventId;
        this.timestamp = timestamp;
        this.eventType = eventType;
        this.payload = payload;
    }

    public UUID getEventId() {
        return eventId;
    }

    public void setEventId(UUID eventId) {
        this.eventId = eventId;
    }

    public Instant getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Instant timestamp) {
        this.timestamp = timestamp;
    }

    public EventType getEventType() {
        return eventType;
    }

    public void setEventType(EventType eventType) {
        this.eventType = eventType;
    }

    public UserPayload getPayload() {
        return payload;
    }

    public void setPayload(UserPayload payload) {
        this.payload = payload;
    }
    @Override
    public String toString() {
        return "Event{" +
            "eventId=" + eventId +
            ", timestamp=" + timestamp +
            ", eventType=" + eventType +
            ", payload=" + payload +
            '}';
         }
}