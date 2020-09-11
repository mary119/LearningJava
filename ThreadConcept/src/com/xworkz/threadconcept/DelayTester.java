package com.xworkz.threadconcept;

public class DelayTester {

	public static void main(String[] args) {

		Runnable r1=()->{
			for(int i=0;i<5;i++) {
				System.out.println("counting:"+i);
				 
			   	 try {
			   		 Thread.sleep(5000);
			   	 }catch(InterruptedException e) {
			   		 e.printStackTrace();
			   	 }
			    }
			
		};
		Thread t1=new Thread(r1);
		t1.start();
		
		Thread t2=new Thread(r1);
		t2.start();
		
		Thread t3=new Thread(r1);
		t3.start();
		
		
	}

			
		
	}


