package com.xworkz.staticblocks;

public class CountObject {
	 static int i;
	  
	 CountObject()
	 {
		i++; 
	 }
	 
    void display ()
    {
    	System.out.println("number of object "+i);
    }
	public static void main(String[] args) {
		CountObject obj1=new CountObject();
		CountObject obj2=new CountObject();
		CountObject obj3=new CountObject();
		CountObject obj4=new CountObject();
		
		obj4.display();
		
		
		

	}

}
