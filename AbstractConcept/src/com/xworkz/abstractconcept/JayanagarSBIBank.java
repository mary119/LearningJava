package com.xworkz.abstractconcept;

public  class JayanagarSBIBank extends RBIBank {

	
	@Override
	void loan() {
		System.out.println("get loan from sbi");
		
	}
	@Override 
	void openBankAcct() {
		System.out.println("documents required are:");
		System.out.println("pan,adhar,photo");
	}
}
