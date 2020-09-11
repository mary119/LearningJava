package com.xworkz.exceptionhandling;

public class ExOnNumFormatException {

	public static void main(String[] args) {
		
	              System.out.println("begining of prog");
	              arrayManipulation();
	}

	  static void arrayManipulation() {
		  try {
			  try {
				  int[]arr= {1 , 2 , 3 , 4 } ;
				  System.out.println("fifth element of array " +arr[5]);
			  }catch(ArrayIndexOutOfBoundsException e) {
			        System.out.println("Exceeding array length");
		  
			  }
		      
	          }catch(ArithmeticException e) {
	        	  System.out.println("String cant be converted to number");
	          }
	          
		  int num=Integer.parseInt("ABC");
		  System.out.println("num");
		  }
		
		
}


