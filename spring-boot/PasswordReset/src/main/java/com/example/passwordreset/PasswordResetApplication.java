package com.example.passwordreset;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableWebSecurity
@CrossOrigin(origins = "*",maxAge = 3600)
public class PasswordResetApplication {

    private static final Logger log =
            LoggerFactory.getLogger(PasswordResetApplication.class);

    @GetMapping
    public String getMe() {
        log.info("welcome to springboot");
        return "Welcome to springboot";
    }

    public static void main(String[] args) {
        SpringApplication.run(PasswordResetApplication.class, args);
    }

}
