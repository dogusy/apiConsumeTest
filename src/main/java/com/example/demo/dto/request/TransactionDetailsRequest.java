package com.example.demo.dto.request;

public class TransactionDetailsRequest {

    private String transactionId;

    public TransactionDetailsRequest() {
    }

    public TransactionDetailsRequest(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

}
