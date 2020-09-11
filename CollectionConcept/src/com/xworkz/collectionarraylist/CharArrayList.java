package com.xworkz.collectionarraylist;

import java.util.ArrayList;

public class CharArrayList {

	public static void main(String[] args) {
	    ArrayList<Character> characters=new ArrayList<Character>();
	    
	    System.out.println("does ArrayList is empty? :"+characters.isEmpty());
		
	    characters.add('A');
	    characters.add('C');
	    characters.add('E');
	    characters.add('G');
	    characters.add('H');
	    characters.add('I');

	    for(int i=0;i<characters.size();i++) {
	    	System.out.println(characters.get(i));
	    }
	    
	    for(char abc:characters) {
	    	System.out.println("*****"+abc+"*****");
	    }
	    characters.set(1,'Z');
	    System.out.println(characters);
	    
	    System.out.println("The fifth element is:"+characters.get(5));
	    
	    characters.remove(3);
	    System.out.println(characters);
	    
	    System.out.println("Does the Al has 'z':"+characters.contains('Z'));
	    
	    characters.remove(1);
	    System.out.println(characters);

	}

	
}
