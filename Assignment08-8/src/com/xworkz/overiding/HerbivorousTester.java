package com.xworkz.overiding;

public class HerbivorousTester {

	public static void main(String[] args) {
		
		Herbivorous dog=new Herbivorous();
		dog.gender="male";
		dog.lengthOfIntestins=3;
		
		System.out.println("Gender:"+dog.gender+"  Length of intestine:"+dog.lengthOfIntestins);
		
		dog.eating();
		dog.running();
		
		
	}

}
