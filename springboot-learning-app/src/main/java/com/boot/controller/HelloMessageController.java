package com.boot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloMessageController {

    @GetMapping(path = "/hello")
    public String getMessage(){
        return "Hello Message";
    }
}
