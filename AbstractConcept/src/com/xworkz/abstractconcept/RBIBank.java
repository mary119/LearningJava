package com.xworkz.abstractconcept;

public abstract class RBIBank {
	
	abstract void openBankAcct();
	abstract void loan();
	
	void deposit(int amount) {
		System.out.println("deposit amount:"+amount);
	}
	
	void withdraw(int amount) {
		System.out.println("withdraw amount:"+amount);
	
	
		
	}
	
}
