package com.xworkz.assignment30;

import java.util.Iterator;
import java.util.PriorityQueue;

public class SchoolPQTester {

	public static void main(String[] args) {

		PriorityQueue<SchoolPQ> spq=new PriorityQueue<SchoolPQ>();
		
		spq.add(new SchoolPQ("Loyola school","Manvi","English"));
		spq.add(new SchoolPQ("Xavier school","Manglore","English"));
		spq.add(new SchoolPQ("Excellent school","Manvi","Telugu"));
		
		spq.offer(new SchoolPQ("Shantinikethan","Ramanagar","Kannada"));
        
		System.out.println(spq);
		
		Iterator<SchoolPQ> itr=spq.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
			
			// retrieves, but does not remove, the head of this queue or returns
			// null if this queue is empty
		
			   System.out.println(spq.peek());
			
		        System.out.println(spq.poll());
		     
		        System.out.println(spq.element());
		        
		        
			
	

	}

}
