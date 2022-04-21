package com.controller;

	
	public class loginException extends RuntimeException {
		
		public loginException() {
			super("login will not be  successfull");
		}

		public  String toString() {
			return "login will not be successfull kindly remove one test";
		}
	}

