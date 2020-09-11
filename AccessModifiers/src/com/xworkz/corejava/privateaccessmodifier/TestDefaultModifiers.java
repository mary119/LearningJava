package com.xworkz.corejava.privateaccessmodifier;

public class TestDefaultModifiers {

	public static void main(String[] args) {
		Dog dog =new Dog("lab,0");
		
		dog.age=2;
		dog.isMale=false;
		
		dog.barking();
	}

}
