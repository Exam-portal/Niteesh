package com.controller;

public class updateTestException extends RuntimeException {

	public updateTestException() {
		super("update test will not be  successfull");
	}

	public  String toString() {
		return "updateTest will not be successfull kindly remove one test";
	}
	
}
