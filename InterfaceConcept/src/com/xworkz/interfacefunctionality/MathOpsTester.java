package com.xworkz.interfacefunctionality;

public class MathOpsTester {

	public static void main(String[] args) {
		
		MathOps add =(a,b) ->{
			System.out.println("The sum is:"+(a+b));
		
		} ;
		
		
		MathOps mul=(c,d) ->{
			System.out.println("The multi is:"+(c*d));
			
		 } ;
		 
	
	    MathOps sub=(e,f) ->{
		    System.out.println("The sum is:"+(e-f));
		     
	     };
	       
	     MathOps div=(a,b) ->{
	    	   System.out.println("The div is:"+(a/b));
	           
	     };
	    	  
	       
	      add.ops(10,  20);
	      sub.ops(50, 20);
	      mul.ops(3,  6);
	      div.ops(4, 2);
	      		
	
	    }
	
}