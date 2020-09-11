package com.xworkz.abstractconcept;

public class BankTester {

	public static void main(String[] args) {
//		SBIBank sbi=new SBIBank(); dont work because of abstract
		
		RBIBank rbi=new JayanagarSBIBank(); //Upcast
		
		rbi.openBankAcct();
		rbi.deposit(10000);
		rbi.withdraw(20000);
		rbi.loan();
		
	}

}



