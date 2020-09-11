package com.xworkz.assignment30;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetChar {

	public static void main(String[] args) {

		LinkedHashSet<Character> chars=new LinkedHashSet<Character>();
		
		chars.add('H');
		chars.add('E');
		chars.add('L');
		chars.add('L');
		chars.add('O');
		System.out.println(chars);
	
		//using for each
		chars.forEach(c->System.out.println(c));
		
		System.out.println("Using Iterator");
		Iterator<Character> itr=chars.iterator();
		while(itr.hasNext()) {
			System.out.println("@@@"+itr.next());
		}
	}

}
