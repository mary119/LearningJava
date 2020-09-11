package com.xworkz.overiding;

public class Son extends Person {
	
	double height=5.5;
	
	void dancing() {
		System.out.println("He got dance from is father");
	}
	
	@Override
	void daring() {
		System.out.println("he also daring as is father");
	}

}
