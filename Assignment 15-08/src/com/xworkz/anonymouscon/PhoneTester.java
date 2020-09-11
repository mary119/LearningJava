package com.xworkz.anonymouscon;

public class PhoneTester {

	public static void main(String[] args) {
		Phone smartphone=new Phone() {

			@Override
			public void calling() {
				System.out.println("smartphone:method calling");
				
			}

			@Override
			public void gaming() {
		        System.out.println("smartphone:method gaming");
				
			}
			
		};
		smartphone.calling();
		smartphone.gaming();
		
		Phone keypad=new Phone() {

			@Override
			public void calling() {
				System.out.println("keypad:method calling");

				
			}

			@Override
			public void gaming() {
				System.out.println("keypad:method calling");
				
			}
			
		};
		keypad.calling();
		keypad.gaming();
		

	}

}
