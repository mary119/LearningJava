package com.xworkz.assignment30;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityDoubleEx {

	public static void main (String[] args) {
		
		PriorityQueue<Double> db=new PriorityQueue<Double>();
		
		db.add(1.1);
		db.add(2.2);
		db.offer(3.0);
		db.add(10.00);
		db.add(20.00);
		db.add(25.00);
		db.add(30.00);
		db.add(34.00);
		db.add(-2.00);
		
		System.out.println(db);
		
		Iterator<Double> itr= db.iterator();
		
		
		while(itr.hasNext()) {
			Double d=itr.next();
			//if(d<0) {
			System.out.println(d);
			//}else
			//itr.remove();
			//System.out.println(d);
		db.peek();
		System.out.println("the new dq:"+db);
		
		db.poll();
		System.out.println("The db after poll:"+db);
		db.offer(20.00);
		System.out.println("The db after offer:"+db);
		//db.poll();
		//System.out.println(db);
		
	
	    }
		
	}
}



