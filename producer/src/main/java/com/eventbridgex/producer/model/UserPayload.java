package com.eventbridgex.producer.model;
public class UserPayload {
    private Long userId;
    private String username;
    private String email;
    public UserPayload() {}
    public UserPayload(Long userId, String username, String email) {
        this.userId = userId;
        this.username = username;
        this.email = email;
    }
    public Long getUserId() {
        return userId;
    }
    public String getUsername() {
        return username;
    }
    public String getEmail() {
        return email;
    }
    public void setUserId(Long userId) {
        this.userId = userId;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public void setEmail(String email) {
        this.email = email;
    }
}