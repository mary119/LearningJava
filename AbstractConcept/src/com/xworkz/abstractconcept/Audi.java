package com.xworkz.abstractconcept;

public class Audi extends Car{

	@Override
	void applyBreak() {
		System.out.println("aplly the break to stop d audi");
	}
	@Override
	void applyAccelerator() {
		System.out.println("apply the accelerator to audi");
	}
	@Override
	void turnSteeringIntoRight() {
		System.out.println("turn steering into right to move right and go sraight");
	}

	void turnSteeringIntoLeft() {
		System.out.println("turn to sterring into left to move left and turn right");
	}

	
}

