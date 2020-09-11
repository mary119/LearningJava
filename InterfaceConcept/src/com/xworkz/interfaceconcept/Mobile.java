package com.xworkz.interfaceconcept;

public class Mobile implements Vivo,Redmi{
	
	@Override
	public void charging() {
		System.out.println("Mobile kept for charging");
	}

	@Override
	public void makeACall() {
		System.out.println("Make a call using redmi phone");
	}

	@Override
	public void playMusic() {
		System.out.println("play kannada melody song");
		
	}

	@Override
	public void connectedToLaptop() {
		System.out.println("connect phone to lap to copy the things");
		
	}

}
