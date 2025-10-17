package com.bituan.simple_api.controller;

import com.bituan.simple_api.service.CatFactService;
import com.bituan.simple_api.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleApiController {

    private final UserService userService;
    private final CatFactService catFactService;

    @Autowired
    public SimpleApiController (UserService userService, CatFactService catFactService) {
        this.userService = userService;
        this.catFactService = catFactService;
    }

    @GetMapping("/me")
    public ResponseEntity<String> getResponse () {
        return ResponseEntity
                .ok()
                .header("Content-Type", "application/json")
                .body("%s\n%s".formatted(userService.getUserAsJSONString(), catFactService.getCatFact()));
    }
}
