package com.xworkz.threadconcept;

public class MultipleOfFiveT2 extends Thread{
	
	@Override
	public void run() {
		System.out.println("This is from Thread2");
		for(int i=1;i<=5;i++) {
			int res=i*5;
			System.out.println(i+" *5="+res);
			
		}
		System.out.println("This is end of Thread2");
	
	}

}
