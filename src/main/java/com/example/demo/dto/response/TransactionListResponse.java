package com.example.demo.dto.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class TransactionListResponse {

    @JsonProperty("per_page")
    private int perPage;

    @JsonProperty("current_page")
    private int currentPage;

    @JsonProperty("next_page_url")
    private String nextPageUrl;

    @JsonProperty("prev_page_url")
    private String prevPageUrl;

    @JsonProperty("from")
    private int from;

    @JsonProperty("to")
    private int to;

    @JsonProperty("data")
    private List<TransactionData> data;

    public TransactionListResponse() {
    }

    public TransactionListResponse(
            int perPage, int currentPage, String nextPageUrl, String prevPageUrl,
            int from, int to, List<TransactionData> data) {
        this.perPage = perPage;
        this.currentPage = currentPage;
        this.nextPageUrl = nextPageUrl;
        this.prevPageUrl = prevPageUrl;
        this.from = from;
        this.to = to;
        this.data = data;
    }

    public int getPerPage() {
        return perPage;
    }

    public void setPerPage(int perPage) {
        this.perPage = perPage;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public String getNextPageUrl() {
        return nextPageUrl;
    }

    public void setNextPageUrl(String nextPageUrl) {
        this.nextPageUrl = nextPageUrl;
    }

    public String getPrevPageUrl() {
        return prevPageUrl;
    }

    public void setPrevPageUrl(String prevPageUrl) {
        this.prevPageUrl = prevPageUrl;
    }

    public int getFrom() {
        return from;
    }

    public void setFrom(int from) {
        this.from = from;
    }

    public int getTo() {
        return to;
    }

    public void setTo(int to) {
        this.to = to;
    }

    public List<TransactionData> getData() {
        return data;
    }

    public void setData(List<TransactionData> data) {
        this.data = data;
    }

    public static class TransactionData {

        @JsonProperty("fx")
        private Fx fx;

        @JsonProperty("customerInfo")
        private CustomerInfo customerInfo;

        @JsonProperty("merchant")
        private Merchant merchant;

        @JsonProperty("ipn")
        private Ipn ipn;

        @JsonProperty("transaction")
        private Transaction transaction;

        @JsonProperty("acquirer")
        private Acquirer acquirer;

        @JsonProperty("refundable")
        private boolean refundable;


        public TransactionData() {
        }


        public Fx getFx() {
            return fx;
        }

        public void setFx(Fx fx) {
            this.fx = fx;
        }

        public CustomerInfo getCustomerInfo() {
            return customerInfo;
        }

        public void setCustomerInfo(CustomerInfo customerInfo) {
            this.customerInfo = customerInfo;
        }

        public Merchant getMerchant() {
            return merchant;
        }

        public void setMerchant(Merchant merchant) {
            this.merchant = merchant;
        }

        public Ipn getIpn() {
            return ipn;
        }

        public void setIpn(Ipn ipn) {
            this.ipn = ipn;
        }

        public Transaction getTransaction() {
            return transaction;
        }

        public void setTransaction(Transaction transaction) {
            this.transaction = transaction;
        }

        public Acquirer getAcquirer() {
            return acquirer;
        }

        public void setAcquirer(Acquirer acquirer) {
            this.acquirer = acquirer;
        }

        public boolean isRefundable() {
            return refundable;
        }

        public void setRefundable(boolean refundable) {
            this.refundable = refundable;
        }
    }

    public static class Fx {

        @JsonProperty("merchant")
        private Merchant originalMerchant;


        public Fx() {
        }

        public Merchant getOriginalMerchant() {
            return originalMerchant;
        }

        public void setOriginalMerchant(Merchant originalMerchant) {
            this.originalMerchant = originalMerchant;
        }
    }

    public static class CustomerInfo {

        private String number;
        private String email;
        private String billingFirstName;
        private String billingLastName;


        public CustomerInfo() {
        }

        public String getNumber() {
            return number;
        }

        public void setNumber(String number) {
            this.number = number;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getBillingFirstName() {
            return billingFirstName;
        }

        public void setBillingFirstName(String billingFirstName) {
            this.billingFirstName = billingFirstName;
        }

        public String getBillingLastName() {
            return billingLastName;
        }

        public void setBillingLastName(String billingLastName) {
            this.billingLastName = billingLastName;
        }
    }

    public static class Merchant {

        private int id;
        private String name;

        public Merchant() {
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public static class Ipn {

        @JsonProperty("received")
        private boolean received;


        public Ipn() {
        }

        public boolean isReceived() {
            return received;
        }

        public void setReceived(boolean received) {
            this.received = received;
        }
    }

    public static class Transaction {

        @JsonProperty("merchant")
        private Merchant transactionMerchant;

        @JsonProperty("referenceNo")
        private String referenceNo;

        @JsonProperty("status")
        private String status;

        @JsonProperty("operation")
        private String operation;

        @JsonProperty("message")
        private String message;

        @JsonProperty("created_at")
        private String createdAt;

        @JsonProperty("transactionId")
        private String transactionId;


        public Transaction() {
        }

        public Merchant getTransactionMerchant() {
            return transactionMerchant;
        }

        public void setTransactionMerchant(Merchant transactionMerchant) {
            this.transactionMerchant = transactionMerchant;
        }

        public String getReferenceNo() {
            return referenceNo;
        }

        public void setReferenceNo(String referenceNo) {
            this.referenceNo = referenceNo;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public String getOperation() {
            return operation;
        }

        public void setOperation(String operation) {
            this.operation = operation;
        }

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }

        public String getCreatedAt() {
            return createdAt;
        }

        public void setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
        }

        public String getTransactionId() {
            return transactionId;
        }

        public void setTransactionId(String transactionId) {
            this.transactionId = transactionId;
        }
    }

    // Inner class representing "acquirer" details
    public static class Acquirer {

        private int id;
        private String name;
        private String code;
        private String type;

        public Acquirer() {
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }
    }
}
