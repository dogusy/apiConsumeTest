package com.example.demo.dto.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TransactionDetailsResponse {

    @JsonProperty("fx")
    private Fx fx;

    @JsonProperty("customerInfo")
    private CustomerInfo customerInfo;

    @JsonProperty("merchant")
    private Merchant merchant;

    @JsonProperty("transaction")
    private Transaction transaction;

    public TransactionDetailsResponse() {
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

    public Transaction getTransaction() {
        return transaction;
    }

    public void setTransaction(Transaction transaction) {
        this.transaction = transaction;
    }

    public static class Fx {


    }

    public static class CustomerInfo {

        private int id;
        @JsonProperty("created_at")
        private String createdAt;
        @JsonProperty("updated_at")
        private String updatedAt;
        private String number;
        @JsonProperty("expiryMonth")
        private String expiryMonth;
        @JsonProperty("expiryYear")
        private String expiryYear;
        @JsonProperty("startMonth")
        private String startMonth;
        @JsonProperty("startYear")
        private String startYear;
        @JsonProperty("issueNumber")
        private String issueNumber;
        private String email;
        private String birthday;
        private String gender;
        @JsonProperty("billingTitle")
        private String billingTitle;
        @JsonProperty("billingFirstName")
        private String billingFirstName;
        @JsonProperty("billingLastName")
        private String billingLastName;
        @JsonProperty("billingCompany")
        private String billingCompany;
        @JsonProperty("billingAddress1")
        private String billingAddress1;
        @JsonProperty("billingAddress2")
        private String billingAddress2;
        @JsonProperty("billingCity")
        private String billingCity;
        @JsonProperty("billingPostcode")
        private String billingPostcode;
        @JsonProperty("billingState")
        private String billingState;
        @JsonProperty("billingCountry")
        private String billingCountry;
        @JsonProperty("billingPhone")
        private String billingPhone;
        @JsonProperty("billingFax")
        private String billingFax;
        @JsonProperty("shippingTitle")
        private String shippingTitle;
        @JsonProperty("shippingFirstName")
        private String shippingFirstName;
        @JsonProperty("shippingLastName")
        private String shippingLastName;
        @JsonProperty("shippingCompany")
        private String shippingCompany;
        @JsonProperty("shippingAddress1")
        private String shippingAddress1;
        @JsonProperty("shippingAddress2")
        private String shippingAddress2;
        @JsonProperty("shippingCity")
        private String shippingCity;
        @JsonProperty("shippingPostcode")
        private String shippingPostcode;
        @JsonProperty("shippingState")
        private String shippingState;
        @JsonProperty("shippingCountry")
        private String shippingCountry;
        @JsonProperty("shippingPhone")
        private String shippingPhone;
        @JsonProperty("shippingFax")
        private String shippingFax;


        public CustomerInfo() {
        }

    }

    public static class Merchant {

        @JsonProperty("name")
        private String name;


        public Merchant() {
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public static class Transaction {

        @JsonProperty("merchant")
        private TransactionMerchant transactionMerchant;


        public Transaction() {
        }

        public TransactionMerchant getTransactionMerchant() {
            return transactionMerchant;
        }

        public void setTransactionMerchant(TransactionMerchant transactionMerchant) {
            this.transactionMerchant = transactionMerchant;
        }
    }

    public static class TransactionMerchant {

        @JsonProperty("referenceNo")
        private String referenceNo;

        public TransactionMerchant() {
        }

        public String getReferenceNo() {
            return referenceNo;
        }

        public void setReferenceNo(String referenceNo) {
            this.referenceNo = referenceNo;
        }
    }

    public static class TransactionAgent {

        private int id;
        @JsonProperty("customerIp")
        private String customerIp;
        @JsonProperty("customerUserAgent")
        private String customerUserAgent;
        @JsonProperty("merchantIp")
        private String merchantIp;


        public TransactionAgent() {
        }


    }

    public static class TransactionMerchantAgent {

        @JsonProperty("id")
        private int id;
        @JsonProperty("customerIp")
        private String customerIp;
        @JsonProperty("customerUserAgent")
        private String customerUserAgent;
        @JsonProperty("merchantIp")
        private String merchantIp;


        public TransactionMerchantAgent() {
        }

    }
}
