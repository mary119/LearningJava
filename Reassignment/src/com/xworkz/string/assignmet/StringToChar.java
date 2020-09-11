package com.xworkz.string.assignmet;

public class StringToChar {

	public static void main(String[] args) {

		String str="hello how are you";
		char[] charString=str.toCharArray();
		for(int i=0;i<charString.length;i++) {
			System.out.println(charString[i]);
		}
		// char ='h','e','l','l','o';
	}

}
