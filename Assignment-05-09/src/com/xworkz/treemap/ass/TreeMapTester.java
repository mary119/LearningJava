package com.xworkz.treemap.ass;

import java.util.TreeMap;

public class TreeMapTester {

	public static void main(String[] args) {

		TreeMap<String,Integer>  month=new TreeMap<String,Integer>();
		
		month.put("June", 28);
		month.put("July", 30);
		month.put("Aug", 29);
		month.put("Sep", 30);
		
		month.forEach((m,d)->System.out.println("Month:"+m +"+Days:"+d));

		System.out.println(month.keySet());
		
		System.out.println(month.values());


		
		
	}

}
















/*create a TreeMap<String, Integer> to store month & NumOfDays and display each key value pair in
   different lines using EntrySet()*/