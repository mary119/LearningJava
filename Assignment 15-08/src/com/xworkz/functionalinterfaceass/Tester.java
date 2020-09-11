package com.xworkz.functionalinterfaceass;

public class Tester {

	public static void main(String[] args) {
		NoArgmtFI test=() -> {
			System.out.println("Hello World");
		};
		test.PrintHello();
		
		OneArgmtFI test1=(a) -> (a+5);
		System.out.println(test1.incrementByFive(5));
			
		MultiArgmtFI test2=(a,b) -> (a+b);
		System.out.println(test2.ConcatTwoString("High", "School"));

	}

}
