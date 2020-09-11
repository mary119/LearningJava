package com.xworkz.staticmembers;

public class EmployTester {

	public static void main(String[] args) {
		System.out.println("employs in the company : "+Employ.company);
		Employ.initCompany();
		
		Employ mary=new Employ("Madhu",100);
		mary.display();
	}

}
