package com.bituan.simple_api.controller;

import com.bituan.simple_api.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleApiController {

    private final UserService userService;

    @Autowired
    public SimpleApiController (UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/me")
    public String getResponse () {
        return userService.getUserAsJSONString();
    }
}
