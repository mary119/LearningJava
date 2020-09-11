package com.xworkz.overiding;

public class Carnivorus extends Animal{
	
	String foodType;
	int noOfLegs;
	
	
	void running() {
		System.out.println("these animals are wild they ran faster");
	}
	
	@Override
	void eating() {
		System.out.println("The animal eating meat");
	}
	
	
	

}
