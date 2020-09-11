package com.xworkz.encapsulation;

public class BankHacking {

	public static void main(String[] args) {
		Bank bank=new Bank("kbi1234567");
		
		bank.deposit(-10000);
		bank.displaybalance("kbi234567");
	}
	

}
