package com.xworkz.priorityqueue.assignmet;

import java.util.Iterator;
import java.util.PriorityQueue;

public class ChocolatesPQTester {

	public static void main(String[] args) {

		PriorityQueue<ChocolatesPQ> choco = new PriorityQueue<ChocolatesPQ>();
		
		choco.add(new ChocolatesPQ("Diary Milk",150));
		choco.add(new ChocolatesPQ("FiveStar",100));
        choco.add(new ChocolatesPQ("Mars",80));
		choco.add(new ChocolatesPQ("Kitkat",40));

		System.out.println(choco);
		
		System.out.println("Traverse using iterator");
		Iterator<ChocolatesPQ> ichoco = choco.iterator();
		
		while(ichoco.hasNext()) {
			System.out.println(ichoco.next());
		}
		
		
		System.out.println(choco.peek());
		System.out.println(choco.poll());
		System.out.println(choco.element());



		
	}

}
