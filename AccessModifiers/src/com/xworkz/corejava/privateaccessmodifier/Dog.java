package com.xworkz.corejava.privateaccessmodifier;

public class Dog { //public and default

	private String breed;
	protected String color;
	int age; //default modifier
	public boolean isMale;
	
	private Dog() {
		System.out.println("creating object of dog");
	}
	Dog(String inBreed){
		System.out.println("creating object of dog using one params constr");
		
	}
	public Dog(String inBreed, int inAge){
		System.out.println("creating object of dog using one params ");
	}
	 
	private void eating() {
		System.out.println("Dog is eating");
	}
	void barking() {
		breed = "julie";
		System.out.println("Dog is barking");
	}
	public void running() {
		System.out.println("Dog is running");
	}
	
	public static void main (String args[]) {
		Dog dog2=new Dog();
		dog2.breed = "julie";
		dog2.age=3;
		
		dog2.eating();
		dog2.barking();
	}
	
}
	


