package com.xworkz.overiding;

public class ParentTester {

	public static void main(String[] args) {
		
		Person gparent=new Person();
		System.out.println("String color:"+Person.color);
		gparent.daring();
		
		/*Son parent=new Son();
		parent.daring();
		parent.dancing();
		*/
		/*Grandson gson=new Grandson();
		gson.daring();
		gson.dimples();
		*/
		
		Person cson=new Son();
		cson.daring();
		
		//Person cgson=new Grandson();
		//cgson.daring();
		
		
		

	}

}
