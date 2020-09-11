package com.xworkz.collectionarraylist;

import java.util.ArrayList;

public class DoubleArrayList {

	public static void main(String[] args) {
		ArrayList<Double> doublevalues=new ArrayList<Double>();
		System.out.println("does ArrayList is empty? :"+doublevalues.isEmpty());
		
		doublevalues.add(23.4);
		doublevalues.add(24.4);
		doublevalues.add(25.4);
		doublevalues.add(26.4);
		doublevalues.add(27.4);
		
		System.out.println(doublevalues);
		
		System.out.println("The size of array is:"+doublevalues.size());
		
		for(int i=0;i<doublevalues.size();i++) {
			System.out.println("***"+doublevalues.get(i)+"***");
		}
		
		for(double n:doublevalues) {
			System.out.println(n);
		}
         doublevalues.set(3, 56.23);
         System.out.println(doublevalues);
         
         
         System.out.println("last index :"+doublevalues.lastIndexOf(doublevalues));
         
        // doublevalues.remove(1);
         doublevalues.remove(1);
         System.out.println(doublevalues);
         
 		  doublevalues.remove(56.23);
 		  System.out.println(doublevalues);

         
      

	}

}
