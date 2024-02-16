package com.example.demo.config;

import org.springframework.stereotype.Component;

@Component
public class JwtTokenManager {

    private String storedToken;

    public JwtTokenManager(){
        storedToken=" ";
    }

    public void setToken(String token) {
        this.storedToken = token;
    }

    public String getToken() {
        return storedToken;
    }
}
