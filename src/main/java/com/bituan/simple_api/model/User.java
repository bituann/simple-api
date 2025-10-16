package com.bituan.simple_api.model;

public class User {
    private String email;
    private String name;
    private String stack;


    public User(String email, String name, String stack) {
        this.email = email;
        this.name = name;
        this.stack = stack;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStack() {
        return stack;
    }

    public void setStack(String stack) {
        this.stack = stack;
    }
}
