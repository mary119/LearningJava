package com.xworkz.linkedlist.assignmet;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListEx {

	public static void main(String[] args) {

		LinkedList<String> linkstr= new LinkedList<String>();
		
		linkstr.add("Mnglre");
		linkstr.add("Bnglre");
		linkstr.addFirst("Raichur");
		linkstr.add("Mandya");
		
		
		//adds element as tail for the list
		linkstr.offer("Mysore");
		
		System.out.println(linkstr);
		
		System.out.println("Using Iterator");
		
		Iterator<String> lnitr=linkstr.iterator();
		while(lnitr.hasNext()) {
			System.out.println(lnitr.next());
		}
		
		System.out.println("Using List Iterator");
		ListIterator<String> litr=linkstr.listIterator();
		while(litr.hasNext()) {
			System.out.println(litr.next());
		}
		
		while(litr.hasPrevious()) {
			System.out.println(litr.previous());
		}
		//retrieves but does not remove d haed of d list
		System.out.println(linkstr.peek());
		
		//returns first element in d list
		System.out.println(linkstr.getFirst());
		
		//retrieves but does not remove d haed of d list
		System.out.println(linkstr.element());
		
		//retrives removes d head of list
		System.out.println(linkstr.remove());
		System.out.println(linkstr.poll());
	}

}
