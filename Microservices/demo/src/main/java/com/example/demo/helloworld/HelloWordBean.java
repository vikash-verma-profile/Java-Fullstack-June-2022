package com.example.demo.helloworld;

public class HelloWordBean {

	private String message;

	public HelloWordBean(String message)
	{
		this.setMessage(message);
	}

	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	@Override
	public String toString() {
		return  String.format("HelloWordBean [message=%s]", message);
	}
}
