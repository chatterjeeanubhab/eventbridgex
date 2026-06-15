package com.eventbridgex.producer.controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
import com.eventbridgex.producer.service.EventPublisherService;
import com.eventbridgex.producer.model.Event;
import com.eventbridgex.producer.model.CreateUserRequest;
@RestController
@RequestMapping("/users")
public class UserController {
    private final EventPublisherService eventPublisherService;
    public UserController(EventPublisherService eventPublisherService){
        this.eventPublisherService = eventPublisherService;
    }
    @PostMapping
    public ResponseEntity<Event> createUser(@RequestBody CreateUserRequest request){
        Event event = eventPublisherService.publishUserCreatedEvent(request);
        return ResponseEntity.status(HttpStatus.CREATED).body(event);
    }
}