package com.xworkz.abstractconcept;

public class LiftTester {

	public static void main(String[] args) {
		Lift lift=new SchniderLift();
		
		//Lift hita=new Hitachi();
		
	    lift.press1();
	    lift.press2();
	    lift.stop();
		

	}

}
