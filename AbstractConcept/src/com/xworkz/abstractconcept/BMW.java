package com.xworkz.abstractconcept;

public class BMW extends Car{
	
	@Override
	void applyBreak() {
		System.out.println("aplly the break to stop d car");
	}
	@Override
	void applyAccelerator() {
		System.out.println("apply the accelerator");
	}
	@Override
	void turnSteeringIntoRight() {
		System.out.println("turn steering into right to move right");
	}

	


}
