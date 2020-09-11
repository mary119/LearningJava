package com.xworkz.interfaceconcept.newfeature;

public interface Mother {

	void cookin();
	
	default void singing() {
		System.out.println("Mother is singing");
    }
}