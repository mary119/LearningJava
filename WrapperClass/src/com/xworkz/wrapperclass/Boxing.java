package com.xworkz.wrapperclass;

public class Boxing {

	public static void main(String[] args) {
		
		int a=10;
		
		Integer b=new Integer(a);//boxing
		System.out.println(b);
		//Integer b= new Integer(10);
		//System.out.println(b);

		
		char c='a';
		Character d=new Character(c);
		System.out.println(d);
		
		
		//autoboxing:automatically converting the primitive data type into objects.
		  ///autoboxing for integer and character
		
		Integer f=20;
		System.out.println(f);
		Character g='G';
		System.out.println(g);
		
	}

}
