package com.xworkz.streamconcept;

import java.util.Arrays;
import java.util.List;

public class ListIntegerEx {

	public static void main(String[] args) {
		List<Integer> integers=Arrays.asList(1,2,13,4,15,16,17,8,9);
		
		/*int[] intArray=integers.stream().mapToInt(Integer::intValue).toArray();
		System.out.println(integers);
		
		int maxNum=Arrays.stream(integers)*/
		
		int minValue=integers.stream().min((x,y)->x.compareTo(y)).get();
		System.out.println("The minimum value is:"+minValue);
		
		int maxValue=integers.stream().max((x,y)->x.compareTo(y)).get();
		System.out.println("The maximum value is:"+maxValue);
		
		//int sumofallvalue=integers.stream().
				
				
		

	
	}

}
