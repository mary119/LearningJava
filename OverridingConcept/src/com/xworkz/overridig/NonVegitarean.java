package com.xworkz.overridig;

public class NonVegitarean extends Food {
	
	String cusineType;
	int quantityInGrams;
	
	void vegimethod() {
		System.out.println("Vegimethod from Vegitarean");
	}
@Override
  public  void cooking() {
	 System.out.println("cooking only from nonvegitarean method");
}
}
