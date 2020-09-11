package com.xworkz.corejava.privateaccessmodifier;

public class DogTesterWithinnPackage {

	public static void main(String[] args) {
		// can access all the default and protected mmbrs of dog
		//outside d clas but inside the same package
		
		Dog dog= new Dog("lab");
		dog.age=2;
		dog.barking();
		
		

	}

}
