package com.example.demo;

import com.example.demo.controller.MerchantUserController;
import com.example.demo.dto.request.LoginRequest;
import com.example.demo.dto.request.TransactionDetailsRequest;
import com.example.demo.dto.request.TransactionListRequest;
import com.example.demo.dto.request.TransactionReportsRequest;
import com.example.demo.dto.response.LoginResponse;
import com.example.demo.dto.response.TransactionDetailsResponse;
import com.example.demo.dto.response.TransactionListResponse;
import com.example.demo.dto.response.TransactionReportsResponse;
import com.example.demo.service.MerchantUserService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

class MerchantUserControllerTest {

	@Mock
	private MerchantUserService merchantUserService;

	@InjectMocks
	private MerchantUserController merchantUserController;

	@BeforeEach
	void setUp() {
		MockitoAnnotations.openMocks(this);
	}

	@Test
	void testLoginUser() {
		LoginRequest loginRequest = new LoginRequest("test@example.com", "password");
		LoginResponse mockLoginResponse = new LoginResponse();
		ResponseEntity<LoginResponse> mockResponseEntity = new ResponseEntity<>(mockLoginResponse, HttpStatus.OK);
		when(merchantUserService.loginUser(any(LoginRequest.class))).thenReturn(mockResponseEntity);

		ResponseEntity<LoginResponse> responseEntity = merchantUserController.loginUser(loginRequest);

		assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
	}

	@Test
	void testTransactionReports() {
		TransactionReportsRequest request = new TransactionReportsRequest();
		TransactionReportsResponse mockResponse = new TransactionReportsResponse();
		ResponseEntity<TransactionReportsResponse> mockResponseEntity = new ResponseEntity<>(mockResponse, HttpStatus.OK);
		when(merchantUserService.getTransactionReports(any(TransactionReportsRequest.class))).thenReturn(mockResponseEntity);

		ResponseEntity<TransactionReportsResponse> responseEntity = merchantUserController.transactionReports(request);

		assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
	}

	@Test
	void testTransactionList() {
		TransactionListRequest request = new TransactionListRequest();
		TransactionListResponse mockResponse = new TransactionListResponse();
		ResponseEntity<TransactionListResponse> mockResponseEntity = new ResponseEntity<>(mockResponse, HttpStatus.OK);
		when(merchantUserService.getTransactionList(any(TransactionListRequest.class))).thenReturn(mockResponseEntity);

		ResponseEntity<TransactionListResponse> responseEntity = merchantUserController.transactionList(request);

		assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
	}

	@Test
	void testGetOneTransaction() {
		TransactionDetailsRequest request = new TransactionDetailsRequest();
		TransactionDetailsResponse mockResponse = new TransactionDetailsResponse();
		ResponseEntity<TransactionDetailsResponse> mockResponseEntity = new ResponseEntity<>(mockResponse, HttpStatus.OK);
		when(merchantUserService.getOneTransaction(any(TransactionDetailsRequest.class))).thenReturn(mockResponseEntity);

		ResponseEntity<TransactionDetailsResponse> responseEntity = merchantUserController.getOneTransaction(request);

		assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
	}
}
