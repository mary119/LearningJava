package com.xworkz.overridig;

public class Vegitarean extends Food {
	
	String cusineType;
	int QuantityInGrams=200;
	
	void vegiMethod() {
		System.out.println("Vegimethod from vegitarian");
	}

	@Override
	
	public void cooking() {
		System.out.println("Cooking only vegitarian food");
	}
}
