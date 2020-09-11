package com.xworkz.threadconcept.runnable;

import java.util.Arrays;
import java.util.List;

public class CollectionSuffixPrefixTester{
  
	public static void main(String[] args) {
		
		System.out.println("The Thread name:"+Thread.currentThread().getName() + 
				" The Id:"+Thread.currentThread().getId());
		
		 CollectionSuffixPrefixT1 collT1 = new  CollectionSuffixPrefixT1();
		 Thread t1=new Thread(collT1);
		 t1.start();
		 
		 
		 Runnable runnableT2 = new Runnable() {
			 @Override
				public void run() {
					Integer[] intArray = {1 , 2, 3, 4, 5};
					List<Integer> intAl = Arrays.asList(intArray);
					
					for(int i:intArray) {
						System.out.println("*"+i);
					}		
				}
		 };
		 Thread t2=new Thread(runnableT2);
		 t2.start();
		 
	     Runnable runnableT3=()->{
			 
					Integer[] intArray = {1 , 2, 3, 4, 5};
					List<Integer> intAl = Arrays.asList(intArray);
					
					for(int i:intArray) {
						System.out.println("*"+i);
					}		
		};
		Thread t3=new Thread(runnableT3);
				 t3.start();
		 
		 
		 System.out.println("End of the thraed:"+Thread.currentThread().getName() +
				 "end of id:"+Thread.currentThread().getId());
	}
	
}

	
	
		
	

