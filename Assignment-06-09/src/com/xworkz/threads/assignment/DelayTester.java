package com.xworkz.threads.assignment;

import java.util.Arrays;
import java.util.List;

public class DelayTester {

	public static void main(String[] args) {

		Runnable r1=()->{
			String[] strArray= {"mary","madhu","manu"};
		    List<String> listr=Arrays.asList(strArray);
			for(String s:strArray) {
			   	 System.out.println("***"+s);
			   	 
			   	 try {
			   		 Thread.sleep(500);
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
