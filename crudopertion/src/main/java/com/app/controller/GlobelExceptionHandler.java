package com.app.controller;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.app.dto.UserResponse;
import com.app.exception.userNotFoundException;


@RestControllerAdvice
public class GlobelExceptionHandler {

	@ExceptionHandler(userNotFoundException.class)
	public ResponseEntity<UserResponse> handleUserNotFoundException(userNotFoundException ue){
		String message= ue.getMessage();
		
		UserResponse ur= 	new UserResponse(message, new Date());
		
		return new ResponseEntity<UserResponse>(ur, HttpStatus.BAD_REQUEST);
		
		
		
	}

}
