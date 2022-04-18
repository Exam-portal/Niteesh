package com.controller;

import javax.security.auth.login.LoginException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
@ControllerAdvice
public class loginExceptionController {

	@ExceptionHandler(LoginException.class)
	
	public ResponseEntity<?> handleLoginException(loginException l,WebRequest req){
		return new ResponseEntity<> (l,HttpStatus.NOT_FOUND);
	}
	
	
}
