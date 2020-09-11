package com.xworkz.threadconcept.runnable;

import java.util.Arrays;
import java.util.List;

public class CollectionSuffixPrefixT1 implements Runnable{
	
	//@Override
	
	@Override
	public void run() {
		Integer[] intArray = {1 , 2, 3, 4, 5};
		List<Integer> intAl = Arrays.asList(intArray);
		
		for(int i:intArray) {
			System.out.println("*"+i);
		}		
	}
	

}
