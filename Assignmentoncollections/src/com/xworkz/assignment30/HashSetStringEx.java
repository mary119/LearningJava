package com.xworkz.assignment30;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetStringEx {

	public static void main(String[] args) {

		HashSet<String> langSet=new HashSet<String>();
		
		langSet.add("C");
		langSet.add("Java");
		langSet.add("Python");
		langSet.add("HTML");
		langSet.add("Css");
		System.out.println(langSet);
		
		for(String s:langSet) {
			System.out.println(s);
		}
		
		Iterator<String> itr=langSet.iterator();
		
		while(itr.hasNext()) {
			System.out.println("****"+itr.next());
		}
	}

}
