package com.xworkz.threadconcept;

public class MultipleOfFiveTester {

	public static void main(String[] args) {

		System.out.println("This is from Main Method");
		System.out.println("The name of the thread:"+Thread.currentThread().getName());
		System.out.println("Id of the Thread:"+Thread.currentThread().getId());
		Thread.currentThread().setName("My main method");
		System.out.println("The name of the Thread:"+Thread.currentThread().getName());
		
		
		MultipleOfFiveT1 t1 = new MultipleOfFiveT1();
		t1.start(); // creating thread
		
		MultipleOfFiveT2 t2 = new MultipleOfFiveT2();
		t2.start();
		
		System.out.println("End of Main method");

		
		
	}

}
