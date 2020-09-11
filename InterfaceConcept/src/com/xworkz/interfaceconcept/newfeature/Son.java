package com.xworkz.interfaceconcept.newfeature;

public class Son extends Brother implements Mother,Father{

	@Override
	public void working() {
		System.out.println("Son is working");
		
	}

	@Override
	public void cookin() {
		System.out.println("Son is cooking");
		
	}

	@Override
	public void singing() {
		//Mother.super.singing();
		System.out.println("Son is singing");// your own implementation
	}
	

}
