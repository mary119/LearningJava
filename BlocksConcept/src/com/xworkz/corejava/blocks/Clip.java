package com.xworkz.corejava.blocks;

public class Clip {
	String material;
	double price;
	
	//non-static blocks /initialization block
	//called during the object creation before constructor is called
	{
		material ="metal";
	}
	 Clip(String inputMaterial,double inputPrice){
		 System.out.println("Material: "+material+ "Price: "+price);
		 
		 material=inputMaterial;
		 price=inputPrice;
	 }
	 
	 void putclip() {
		 System.out.println("putclip");
	 }
	 
	 //all the blocks is called in sequence they have written
	 
	 {
		 price=50.00;
	 }
	 
}


