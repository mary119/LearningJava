package com.xworkz.linkedhashset.assignmet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class HashSetEx {
	
	public static void main(String[] args) {
		
		LinkedHashSet<Character> linkhashChar= new LinkedHashSet<Character>();
		linkhashChar.add('H');
		linkhashChar.add('E');
		linkhashChar.add('L');
		linkhashChar.add('L');
		linkhashChar.add('O');
		System.out.println(	linkhashChar);
		
		linkhashChar.forEach(c->System.out.println(c));
		
		Iterator<Character> ichar=linkhashChar.iterator();
		while(ichar.hasNext()) {
		System.out.println(ichar.next());

		}
		

		
	}

}
