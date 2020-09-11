package com.xworkz.exceptionhandling;

import java.io.File;
import java.io.FileInputStream;

public class FinallyExample {

	public static void main(String[] args) {
		
		System.out.println("Begin prog");
		
		File file ;
		FileInputStream in = null;
		
		try {
			
			file = new File ("C://Project//test.txt");
			in=new FileInputStream(file);
			String str = null;
			str.length();
			
		}catch (Exception e) {
			System.out.println("Exception has occured");
		}finally {
			System.out.println("Must execute Statements");
			try {
				in.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println();

	}

}
