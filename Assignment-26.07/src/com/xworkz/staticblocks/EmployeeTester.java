package com.xworkz.staticblocks;

public class EmployeeTester {
	public static void main(String args[]) {
		
		System.out.println("employs in the company :"+Employee.salary);
		Employee.initsalary();
		
		System.out.println("employs salary :"+Employee.branch);
		Employee.initbranch();
		
		Employee bhanu=new Employee(15,"mary");
		bhanu.display();
		
		Employee madhu=new Employee(16,"madhu");
		madhu.display();
	}

}
