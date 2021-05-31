package com.simplilearn;

public class ByeWorld {
		private String name;
	    private String message;
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