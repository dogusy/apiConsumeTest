package com.example.demo.dto.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class TransactionReportsResponse {
    @JsonProperty("status")
    private String status;

    @JsonProperty("response")
    private List<TransactionDetails> response;

    public TransactionReportsResponse() {
    }

    public TransactionReportsResponse(String status, List<TransactionDetails> response) {
        this.status = status;
        this.response = response;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<TransactionDetails> getResponse() {
        return response;
    }

    public void setResponse(List<TransactionDetails> response) {
        this.response = response;
    }

    public static class TransactionDetails {

        private int count;
        private int total;
        private String currency;

        public TransactionDetails() {
        }

        public TransactionDetails(int count, int total, String currency) {
            this.count = count;
            this.total = total;
            this.currency = currency;
        }

        public int getCount() {
            return count;
        }

        public void setCount(int count) {
            this.count = count;
        }

        public int getTotal() {
            return total;
        }

        public void setTotal(int total) {
            this.total = total;
        }

        public String getCurrency() {
            return currency;
        }

        public void setCurrency(String currency) {
            this.currency = currency;
        }
    }
}
