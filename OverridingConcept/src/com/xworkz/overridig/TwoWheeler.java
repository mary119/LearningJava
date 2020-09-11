package com.xworkz.overridig;

public class TwoWheeler extends Vehicle{
             
	int noOfWheels;
	
	void startthetwowhwheeler() {
		System.out.println("Two wheeler has started");
	}
	
	@Override
	void acceleratebrake() {
		System.out.println("aceelarate brake Two Wheeler");
	}
		
}
