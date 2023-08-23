package com.vca.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import response.ResponseHandler;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/auth")
public class AuthController {

	@PostMapping("/login")
	public ResponseEntity<Object> Login(){
		
		try {
	        // Authenticate the user here and generate a JWT token upon successful login
	        // You should replace this with your actual authentication logic

	        // If authentication is successful, generate a JWT token
			// String jwtToken = generateJwtToken(loginRequest.getUsername()); // Replace with your token generation logic

	        Map<String, Object> responseData = new HashMap<>();
	        responseData.put("status", "success");
//	        responseData.put("token", jwtToken);
			
			return ResponseHandler.apiResponse("Registered", HttpStatus.OK, responseData);
		}catch(Exception e) {
			// Handle authentication failure
	        Map<String, Object> errorResponse = new HashMap<>();
	        errorResponse.put("status", "error");
	        errorResponse.put("message", "Authentication failed"); // Customize this message
			return ResponseHandler.apiResponse(e.getMessage(), HttpStatus.UNAUTHORIZED, null);
		}
		
	}
	
	@PostMapping("/register")
	public ResponseEntity<Object> Register(){
		try {
			// Implement your registration logic here
			
			return ResponseHandler.apiResponse("Registration successful", HttpStatus.OK, null);
		}catch(Exception e) {
	        Map<String, Object> errorResponse = new HashMap<>();
	        errorResponse.put("status", "error");
	        errorResponse.put("message", "Authentication failed");
			return ResponseHandler.apiResponse(e.getMessage(), HttpStatus.BAD_REQUEST, null);
		}
		
	}

}
