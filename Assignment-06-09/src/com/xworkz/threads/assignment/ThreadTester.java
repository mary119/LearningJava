package com.xworkz.threads.assignment;

import java.util.Arrays;
import java.util.List;


public class ThreadTester {

	public static void main(String[] args) {

		System.out.println("The Thread name:"+Thread.currentThread().getName() + 
				" The Id:"+Thread.currentThread().getId());
		
		 ThreadCreation integerT1 = new  ThreadCreation();
		 Thread t1=new Thread(integerT1);
		 t1.start();
		 
		 
		 Runnable runnableT2 = new Runnable() {
			 @Override
				public void run() {
					Integer[] intArray = {1 , 2, 3, 4, 5};
					List<Integer> intAl = Arrays.asList(intArray);
					
					for(int i:intArray) {
						System.out.println(i);
					}		
				}
		 };
		 Thread t2=new Thread(runnableT2);
		 t2.start();
		 
		 
		 
		 Runnable runnableT3=new Runnable() {

			@Override
			public void run() {
				Double[] darray= {1.1, 1.2, 1.3, 1.4, 1.5};
				List<Double> dbaray=Arrays.asList(darray);
				
				for(double d:darray) {
					System.out.println(d);
				}
								
			}
			 
		 };
		 Thread t3=new Thread(runnableT3);
		 t3.start();
		 
			
		 Runnable runnableT4=new Runnable() {

			@Override
			public void run() {String[] strArray= {"mary","madhu","manu"};
	         List<String> listr=Arrays.asList(strArray);
	         
	         for(String s:strArray) {
	        	 System.out.println(s);
	         }
				
			}
			 
			 
		 };
		 Thread t4=new Thread(runnableT4);
		 t4.start();
		 System.out.println("End of the Thread :"+Thread.currentThread().getName() + 
					" End of the Id:"+Thread.currentThread().getId());
		 
	}

}
