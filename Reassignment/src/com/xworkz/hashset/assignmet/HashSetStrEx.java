package com.xworkz.hashset.assignmet;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetStrEx {

	public static void main(String[] args) {

		HashSet<String> strHash =new HashSet<String>();
		
		strHash.add("Mary");
		strHash.add("Madhu");
		strHash.add("Manu");
		strHash.add("Manvi");
		strHash.add("Maghi");
		System.out.println(strHash);
		
		System.out.println("Using forEach");
		strHash.forEach(names->System.out.println(names));
		
		System.out.println("Using Iterator");
		Iterator<String> itr= strHash.iterator();
		 
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
