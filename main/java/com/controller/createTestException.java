package com.controller;

public class createTestException extends RuntimeException {
	
	 public createTestException() {
			super("test cannot be created");
		}
		public String toString() {
			return "test cannot be created kindly remove one test";
		}

}
