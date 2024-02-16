package com.example.demo.controller;

import com.example.demo.dto.request.LoginRequest;
import com.example.demo.dto.request.TransactionDetailsRequest;
import com.example.demo.dto.request.TransactionListRequest;
import com.example.demo.dto.request.TransactionReportsRequest;
import com.example.demo.dto.response.LoginResponse;
import com.example.demo.dto.response.TransactionDetailsResponse;
import com.example.demo.dto.response.TransactionListResponse;
import com.example.demo.dto.response.TransactionReportsResponse;
import com.example.demo.service.MerchantUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/merchant")
public class MerchantUserController {

    private final MerchantUserService merchantUserService;

    @Autowired
    public MerchantUserController(MerchantUserService merchantUserService) {
        this.merchantUserService = merchantUserService;
    }

    @PostMapping("/loginMerchant")
    public ResponseEntity<LoginResponse> loginUser(@RequestBody LoginRequest loginRequest) {
        try {

            return merchantUserService.loginUser(loginRequest);
        } catch (Exception e) {
            return null;
        }
    }

    @PostMapping("/transactionReports")
    public ResponseEntity<TransactionReportsResponse> transactionReports(@RequestBody TransactionReportsRequest request) {
        try {
            ResponseEntity<TransactionReportsResponse> responseEntity = merchantUserService.getTransactionReports(request);

            return responseEntity;
        } catch (Exception e) {
            return null;
        }
    }

    @PostMapping("/transactionList")
    public ResponseEntity<TransactionListResponse> transactionList(@RequestBody TransactionListRequest request) {
        try {
            ResponseEntity<TransactionListResponse> responseEntity = merchantUserService.getTransactionList(request);

            return responseEntity;
        } catch (Exception e) {
            return null;
        }
    }

    @PostMapping("/getOneTransaction")
    public ResponseEntity<TransactionDetailsResponse> getOneTransaction(@RequestBody TransactionDetailsRequest request) {
        try {
            ResponseEntity<TransactionDetailsResponse> responseEntity = merchantUserService.getOneTransaction(request);

            return responseEntity;
        } catch (Exception e) {
            return null;
        }
    }
}
