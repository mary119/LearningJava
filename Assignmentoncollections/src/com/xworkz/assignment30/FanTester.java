package com.xworkz.assignment30;

import java.util.LinkedList;


public class FanTester {

	public static void main(String[] args) {

		LinkedList<Fan> fan =new LinkedList<Fan>();
		
		fan.add(new Fan("Anchor",3,5000.00));
		fan.add(new Fan("Havells",4,6000.00));
		fan.add(new Fan("Arun",3,4000.00));
		fan.add(new Fan("Usha",4,3000.00));
		System.out.println(fan);

		
		
	}

}
