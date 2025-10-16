package com.bituan.simple_api.service;

import com.bituan.simple_api.model.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    public User getUser() {
        return new User ("awanebitobi6@gmail.com", "Tobi Awanebi", "Java/SpringBoot");
    }

    public String getUserAsJSONString () {
        return new User("awanebitobi6@gmail.com", "Tobi Awanebi", "Java/SpringBoot").toString();
    }
}
