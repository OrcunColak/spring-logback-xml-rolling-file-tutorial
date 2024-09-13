package com.colak.springtutorial.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class HelloWorldController {

    // http://localhost:8080/hello
    @GetMapping("/hello")
    public String hello() {
        log.info("Received request");
        return "Hello, World!";
    }
}

