package com.controller;

public class addTestException extends RuntimeException{
	 public addTestException() {
			super("addTest cannot be added");
		}
		public String toString() {
			return "test cannot be added kindly remove one test";
		}
		

}
