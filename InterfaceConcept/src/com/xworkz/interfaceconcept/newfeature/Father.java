package com.xworkz.interfaceconcept.newfeature;

public interface Father {
	
	void working();
	
	default void singing() {
		System.out.println("Father is siging");
	}

}
