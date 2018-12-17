package com.example.demo.controller;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@Configuration
public class Controller {
    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

    @GetMapping("getUser/routine")
    public String routine() {
        RestTemplate restTemplate = getRestTemplate();
        String json = restTemplate.getForObject("http://Eureka-client/user/getUser", String.class);
        return json;
    }

    @GetMapping("getUser/routine2")
    public String routine2() {
        RestTemplate restTemplate = getRestTemplate();
        String json = restTemplate.getForObject("http://Eureka-client/user/getUser2", String.class);
        return json;
    }
}
