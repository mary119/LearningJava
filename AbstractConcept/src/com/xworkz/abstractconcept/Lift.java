package com.xworkz.abstractconcept;

public abstract class Lift {
	
	
	abstract void press1();
	abstract void press2();
	
	void stop() {
		System.out.println("Stop the lift and open doors");
	}
	
	void alarm() {
		System.out.println("when emergency comes make alarm bugger");
	}

}
