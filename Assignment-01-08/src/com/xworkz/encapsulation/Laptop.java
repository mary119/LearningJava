package com.xworkz.encapsulation;

public class Laptop {
	private int loginPassword;
	private String data;
	
	public Laptop(int inputlaptop) {
		loginPassword=inputlaptop;
	}
	
	public void displaydata(int loginpassword) {
		System.out.println("the password for  the laptop is  "+ loginPassword);
		
	}
	public void enterpassword(int loginpassword) {
		if(loginpassword==1234)
			System.out.println("entered is right");
		else
			System.out.println("you have entered wrong");
	}

}
