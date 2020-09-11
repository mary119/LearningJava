package com.xworkz.interfaceconcept;

public class Animal implements Lion,Tiger{

	@Override
	public void run() {
		System.out.println("Tiger runs faster than Lion");
		
	}

	@Override
	public void makeASound() {
		System.out.println("animala makes different sounds");
		
	}

	@Override
	public void roar() {
		System.out.println("lion roars");
		
	}

	@Override
	public void hunting() {
		System.out.println("these two are hunters of forest");
		
	}
	
	
	
}
