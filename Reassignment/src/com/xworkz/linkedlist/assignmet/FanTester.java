package com.xworkz.linkedlist.assignmet;

import java.util.Iterator;
import java.util.LinkedList;


public class FanTester {

	public static void main(String[] args) {

		LinkedList<Fan> fan=new LinkedList<Fan>();
		
		fan.add(new Fan("Anchor",3));
		fan.add(new Fan("Havells",4));
		fan.add(new Fan("Arun",3));
		fan.add(new Fan("Usha",4));
		
		System.out.println(fan);
		
		fan.forEach(f->System.out.println(f));
		
		System.out.println("Traverse using Iterator");
		
		Iterator<Fan> ifan=fan.iterator();
		while(ifan.hasNext()) {
			System.out.println(ifan.next());
		}
		
		
		
		
	}

}
