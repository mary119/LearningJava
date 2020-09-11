package com.xworkz.threads.assignment;

import java.util.Arrays;
import java.util.List;

public class ArrayOfStringExThread extends Thread{

	@Override
	public void run() {
		String[] strArray= {"mary","madhu","manu"};
	    List<String> listr=Arrays.asList(strArray);
	    
	    for(String s:strArray) {
	   	 System.out.println("***"+s);
	    }		
	}
	
	
	
}



