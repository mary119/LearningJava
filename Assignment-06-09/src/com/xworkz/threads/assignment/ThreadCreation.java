package com.xworkz.threads.assignment;

import java.util.Arrays;
import java.util.List;

public class ThreadCreation implements Runnable{

	@Override
	public void run() {

		Integer[] intArray = {1 , 2, 3, 4, 5};
		List<Integer> intAl = Arrays.asList(intArray);
		
		for(int i:intArray) {
			System.out.println("*"+i);
		}	
		
		Double[] darray= {1.1, 1.2, 1.3, 1.4, 1.5};
		List<Double> dbaray=Arrays.asList(darray);
		for(double d:darray) {
			System.out.println("***"+d);
		}
		
         String[] strArray= {"mary","madhu","manu"};
         List<String> listr=Arrays.asList(strArray);
         
         for(String s:strArray) {
        	 System.out.println("***"+s);
         }
	}

}
