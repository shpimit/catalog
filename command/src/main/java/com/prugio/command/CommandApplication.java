package com.prugio.command;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient   // Eureka
@SpringBootApplication
public class CommandApplication {
    public static void main(String[] args) {
        SpringApplication.run(CommandApplication.class);
    }
}
