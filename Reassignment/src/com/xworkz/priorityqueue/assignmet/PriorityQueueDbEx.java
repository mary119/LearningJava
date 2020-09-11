package com.xworkz.priorityqueue.assignmet;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueDbEx {

	public static void main(String[] args) {

		PriorityQueue<Double> db = new PriorityQueue<Double>();
		
		db.add(2.5);
		db.add(3.5);
		db.add(4.5);
		db.add(5.5);
		
		//inserts specified element to the pq
		db.offer(6.6);
		System.out.println(db);
		
		Iterator<Double> ipq=db.iterator();
		while(ipq.hasNext()) {
			System.out.println(ipq.next());
		}
		
		//retrives but does not removes
		System.out.println(db.peek());
		
		//retrieves and removes head
		System.out.println(db.poll());
		
		System.out.println(db.element());
		
	}

}
