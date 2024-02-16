package com.example.demo.service;

import com.example.demo.config.JwtTokenManager;
import com.example.demo.dto.request.LoginRequest;
import com.example.demo.dto.request.TransactionDetailsRequest;
import com.example.demo.dto.request.TransactionListRequest;
import com.example.demo.dto.request.TransactionReportsRequest;
import com.example.demo.dto.response.LoginResponse;
import com.example.demo.dto.response.TransactionDetailsResponse;
import com.example.demo.dto.response.TransactionListResponse;
import com.example.demo.dto.response.TransactionReportsResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class MerchantUserService {

    private final RestTemplate restTemplate;
    private final JwtTokenManager jwtTokenManager;
    private final String apiUrl;

    private final HttpHeaders headers;

    public MerchantUserService(RestTemplate restTemplate, JwtTokenManager jwtTokenManager, @Value("${external.api.url}") String apiUrl) {
        this.restTemplate = restTemplate;
        this.jwtTokenManager=jwtTokenManager;
        this.apiUrl = apiUrl;

        this.headers = new HttpHeaders();
        this.headers.set("Content-Type", "application/json");
    }

    public ResponseEntity<LoginResponse> loginUser(LoginRequest loginRequest) {
        try {
            HttpEntity<LoginRequest> requestEntity = new HttpEntity<>(loginRequest, headers);
            ResponseEntity<LoginResponse> response = restTemplate.exchange(
                    apiUrl + "merchant/user/login",
                    HttpMethod.POST,
                    requestEntity,
                    LoginResponse.class);
            if (response.getStatusCode().is2xxSuccessful()){
                String token = response.getBody().getToken();
                jwtTokenManager.setToken(token);
            }
            return response;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ResponseEntity.status(500).build();
    }

    public ResponseEntity<TransactionReportsResponse> getTransactionReports(TransactionReportsRequest transactionReportsRequest) {
        try {
            HttpEntity<TransactionReportsRequest> requestEntity = new HttpEntity<>(transactionReportsRequest, headers);

            return restTemplate.exchange(
                    apiUrl + "transactions/report",
                    HttpMethod.POST,
                    requestEntity,
                    TransactionReportsResponse.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ResponseEntity.status(500).build();
    }

    public ResponseEntity<TransactionListResponse> getTransactionList(TransactionListRequest request) {
        try {
            HttpEntity<TransactionListRequest> requestEntity = new HttpEntity<>(request, headers);

            return restTemplate.exchange(
                    apiUrl + "transaction/list",
                    HttpMethod.POST,
                    requestEntity,
                    TransactionListResponse.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ResponseEntity.status(500).build();
    }

    public ResponseEntity<TransactionDetailsResponse> getOneTransaction(TransactionDetailsRequest request) {
        try {
            HttpEntity<TransactionDetailsRequest> requestEntity = new HttpEntity<>(request, headers);

            return restTemplate.exchange(
                    apiUrl + "transaction",
                    HttpMethod.POST,
                    requestEntity,
                    TransactionDetailsResponse.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ResponseEntity.status(500).build();
    }
}
