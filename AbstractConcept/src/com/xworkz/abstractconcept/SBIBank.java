package com.xworkz.abstractconcept;

public abstract class SBIBank extends RBIBank {
	
	@Override
	void openBankAcct() {
		System.out.println("documents required are:");
		System.out.println("pan,adhar,photo");
	}

	
}
