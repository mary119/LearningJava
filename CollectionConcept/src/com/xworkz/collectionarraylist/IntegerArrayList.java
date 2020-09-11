package com.xworkz.collectionarraylist;

import java.util.ArrayList;

public class IntegerArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> integers=new ArrayList<Integer>();
		System.out.println("does ArrayList is empty? :"+integers.isEmpty());
		
		integers.add(10);
		integers.add(20);
		integers.add(30);
		integers.add(40);
		integers.add(50);
		
		integers.add(10);
		
		System.out.println(integers);
		
		System.out.println("The third element is:"+integers.get(2));
		integers.set(2, 15);
		
		System.out.println(integers);
		
		System.out.println("The size of of Al is:"+integers.size());
		
		for(int i=0;i<integers.size();i++) {
			System.out.println("***"+integers.get(i)+"***");
		}
		
		for(int num:integers) {
			System.out.println(num);
		}
		
		integers.add(5,25);
		
		System.out.println("Does all contain 78:"+integers.contains(78));
		
		System.out.println("Index of 20:"+integers.indexOf(20));
		
		integers.remove(3);
		
		System.out.println("the integer are "+integers);
		
		integers.remove(0);
		//integers.remove(all);
		System.out.println("The integers values:"+integers);
	}

}
