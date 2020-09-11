package com.xworkz.assignment30;

import java.util.Scanner;

public class NoOfVowels {

	public static void main(String[] args) {

		System.out.println("Enter a STring");
		Scanner scan=new Scanner(System.in);
		String str=scan.nextLine();
		
		int count=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='o' || str.charAt(i)=='u');
			count++;
		}
		System.out.println("The no of Vowels:"+count);
		
	}

}
