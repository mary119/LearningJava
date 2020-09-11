package com.xworkz.exceptionhandling;

public class DivisionOperation {

	public static void main(String[] args) {
		
		System.out.println("Start prgm");
		
		int a=10, b=0;
		
		
		DivisionOperation divOpr=new DivisionOperation();
		
		try{
			int result = divOpr.division(a, b);
			System.out.println("Result is: "+result);
		}catch(ArithmeticException e) {
			System.out.println("Something went wrong");
		}
		
		System.out.println("End prgm");
	}
	int division(int a, int b) throws ArithmeticException{
		
		
		int div=0;
		div=a/b;
		return div;
				
			
		}
		
}


