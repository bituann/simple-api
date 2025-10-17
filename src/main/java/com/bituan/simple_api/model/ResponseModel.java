package com.bituan.simple_api.model;

import java.util.Date;

public class ResponseModel {
    private String status;
    private User user;
    private Date timestamp;
    private String fact;

    public ResponseModel(String status, User user, Date timestamp, String fact) {
        this.status = status;
        this.user = user;
        this.timestamp = timestamp;
        this.fact = fact;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public String getFact() {
        return fact;
    }

    public void setFact(String fact) {
        this.fact = fact;
    }
}
