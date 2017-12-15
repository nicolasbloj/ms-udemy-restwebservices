package com.nab.udemy.restwebservices.bean;

public class HelloWorld {

	private String message;

	public HelloWorld(String msg) {
		this.message = msg;
	}

	public String getMessage() {
		return message;
	}
	
	@Override
	public String toString() {
		return String.format("HelloWorldBean [message=%s]", message);
	}
	
}
