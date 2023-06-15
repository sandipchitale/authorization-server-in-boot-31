package com.example.authclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@SpringBootApplication
public class AuthclientApplication {

    @RestController
    public static class GreetController {

        @GetMapping("/")
        public Map<String, String> greet() {
            return Map.of("message", "Hello World");
        }
    }

    public static void main(String[] args) {
        SpringApplication.run(AuthclientApplication.class, args);
    }
}

