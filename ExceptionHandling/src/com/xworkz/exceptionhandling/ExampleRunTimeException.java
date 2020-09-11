package com.xworkz.exceptionhandling;

public class ExampleRunTimeException {

	public static void main(String args[]) {
		 System.out.println("start a prgm");
		 
		 arrayManipulation();
		 
		 System.out.println("end prgm");
	}
	static void arrayManipulation() {
		try {
			try
		
		   {
			int num=Integer.parseInt("abc");
			System.out.println("num");
		   }catch (NumberFormatException e)
		  {
		  System.out.println("entered string cant be converted to number");
			
		}
		int[] intArray= {1,2,3,4};
		System.out.println("the fifth element is: "+intArray[4]);
		
	    } catch (ArrayIndexOutOfBoundsException e) {
	    	System.out.println("Index you are trying to access does not exist");
	    } catch (RuntimeException e) {
	    	System.out.println("Encountered Runtime Exception");
	    }catch (Exception e) {
	    	System.out.println("Exception occured");
	    }
		
		
	    }
	
		
	}


