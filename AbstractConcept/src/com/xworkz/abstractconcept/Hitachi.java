package com.xworkz.abstractconcept;

public class Hitachi extends Lift {
	
	@Override
	void press1() {
		System.out.println("return to first floor");
	}
	
	@Override
	void press2() {
		System.out.println("return to second floor and stop");
	}
	void alarm() {
		System.out.println();
	}
	

}
