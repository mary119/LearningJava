package com.xworkz.assignment30;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetStringEx {

	public static void main(String[] args) {

		
		TreeSet<String> trSt= new TreeSet<String>();
		
		trSt.add("Panipuri");
		trSt.add("Masalapuri");
		trSt.add("Sevpuri");
		trSt.add("Dahipuri");
		trSt.add("Bhelpuri");
		System.out.println(trSt);
		
		trSt.forEach(chat->System.out.println(chat));
		
	    Iterator<String> itr=trSt.iterator();
	    
	    while(itr.hasNext()) {
	    	//String s=itr.next();
	    	//if(s == null) {
	    		System.out.println(itr.next()); 
	    	//}else
	    		//System.out.println(itr);
	    	}
	    }
	}
		
	//}


