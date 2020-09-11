package com.xworkz.interfaceconcept;

public interface AnimalTester {
	
	public static void main(String args[]) {
		
		Animal lion= new Animal(); 
		lion.hunting();
		lion.roar();
		lion.run();
		lion.makeASound();
		
		System.out.println();
		
		Animal tiger=new Animal();
		tiger.hunting();
		tiger.roar();
		tiger.run();
		tiger.makeASound();
		
		
	}

}
