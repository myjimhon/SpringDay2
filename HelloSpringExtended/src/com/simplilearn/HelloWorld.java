package com.simplilearn;

public class HelloWorld {
    private String message;
    private String name;
    public void setMessage(String message) {
        this.message = message;
    }
    public void getMessage() {
        System.out.println("Your Message : " + message);
    }
	
	public void setName(String name) {
		this.name = name;
	}
	public void getName() {
		System.out.println("Your Name : " + name);
	}
}