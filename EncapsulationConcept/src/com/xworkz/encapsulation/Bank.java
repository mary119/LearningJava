package com.xworkz.encapsulation;

public class Bank {
	private String acctNum;
	private int balance=10000;
	
	public Bank(String inputAcctno) {
		acctNum=inputAcctno;
	}
	public void displaybalance(String acctno) {
		System.out.println("the balance for acct "+acctno+ "is:  "+acctNum );
	}
	public void deposit(int amount) {
		if(amount>0)
			balance+=amount;
		else
			System.out.println("you are entered wrong");
	}
	
 // void withdraw()
}
