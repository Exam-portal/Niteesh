package com.controller;

public class changePasswordException extends RuntimeException{
	
	public changePasswordException() {
		super("password cannot be changed successfully");
	}
	public String toString() {
		return "password cannot be changed kindly remove one password";
	}

}
