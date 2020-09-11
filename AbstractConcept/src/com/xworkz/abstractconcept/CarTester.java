package com.xworkz.abstractconcept;

public class CarTester {

	public static void main(String[] args) {
		
		Car bmw=new BMW();
		bmw.applyBreak();
		bmw.applyAccelerator();
		bmw.turnSteeringIntoRight();
		bmw.turnSteeringIntoLeft();
		
		System.out.println(" ");
		
		Car audi=new Audi();
		audi.applyBreak();
		audi.applyAccelerator();
		audi.turnSteeringIntoRight();
		audi.turnSteeringIntoLeft();

	}

}
