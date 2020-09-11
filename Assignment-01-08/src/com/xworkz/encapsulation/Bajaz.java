package com.xworkz.encapsulation;

public class Bajaz extends Bike {
	
	void start() {
		System.out.println("the start the bike");
	}

	public static void main(String[] args) {
		
	    Bike splendor=new Bike();
	    splendor.color="black";
	    splendor.price=60000.00;
	    
	    splendor.startvehicle();
	    splendor.stopvehicle();
	    splendor.accelerateBrake();
	   
	    }

}
