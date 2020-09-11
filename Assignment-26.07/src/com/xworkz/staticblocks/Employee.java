package com.xworkz.staticblocks;

public class Employee {
	
	 int Id;
	 String name;
	 static double salary;
	 static String branch;
	 
	 static {
		 
	 }
	
	public Employee(int id, String name) {
		super();
		Id = id;
		this.name = name;
	}

	
	  
	 static void initsalary() {
		 salary=15000;
		 
	 }
	 
	 static void initbranch() {
		 branch="EC";
		 
	 }
	 
	 void display() {
		 System.out.println("EmployeeId :"+Id);
		 System.out.println("Employee name:"+ name);
		 System.out.println("Employee Salary :"+salary);
		 System.out.println("Employee branch:"+branch);
	 }

}
