package com.prugio.query;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.kafka.KafkaAutoConfiguration;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.client.RestTemplate;

@EnableEurekaClient   // Eureka
@EnableCircuitBreaker // Hystrix
@SpringBootApplication
@EnableFeignClients
//@SpringBootApplication(scanBasePackages = {"com.prugio.query"})
//@EnableJpaRepositories(basePackages = "com.prugio.query.repository")
//@EntityScan(basePackages = "com.prugio.query.entity")
public class QueryApplication {

    @LoadBalanced   // Ribbon
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    public static void main(String[] args) {
        SpringApplication.run(QueryApplication.class);
    }
}
