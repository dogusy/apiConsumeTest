package com.example.demo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.web.client.RestTemplate;

import java.util.Collections;
import java.util.List;

@Configuration
public class RestTemplateConfig {

    private final JwtTokenManager jwtTokenManager;

    @Autowired
    public RestTemplateConfig(JwtTokenManager jwtTokenManager) {
        this.jwtTokenManager = jwtTokenManager;
    }

    @Bean
    public RestTemplate restTemplate() {
        RestTemplate restTemplate = new RestTemplate();

        restTemplate.getInterceptors().add((request, body, execution) -> {
            request.getHeaders().add("Authorization", jwtTokenManager.getToken());
            return execution.execute(request, body);
        });

        return restTemplate;
    }
}
