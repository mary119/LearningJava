package com.xworkz.anonymouscon;

public class CountryTester {

	public static void main(String[] args) {
		Country india=new Country() {

			@Override
			public void anthem() {
				System.out.println("our national anthem is: jana gana");
				
			}
			
			@Override
			public void flag() {
				System.out.println("our flag is: tricolor with ashokachakra");
				
			}

			@Override
			public void nationalAnimal() {
				System.out.println("our national animal:tiger");
				
			}
			
		};
		
		india.anthem();
		india.flag();
		india.nationalAnimal();

	}

}
