package com.xworkz.corejava.privateaccessmodifier;

public class DogTesters {
	public static void main(String args[])
	{
		//cannot access private mmbr of dog cls
		//outside d cls
		//can access default mmbrs outside d cls
		
		Dog outside=new Dog("German shepherd",5);
		outside.breed ="German shephrd";
		outside.age=5;//default mmbr of dog
		
		outside.color="brown";//public mmbr of dog
		
		outside.isMale=true;//private mmbr of dog
		
		outside.age=5;
		
		System.out.println("Dog breed value: +dog1.breed");
		System.out.println("Dog age: "+outside.age);
		
	}
}
