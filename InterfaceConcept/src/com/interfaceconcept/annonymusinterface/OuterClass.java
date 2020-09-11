package com.interfaceconcept.annonymusinterface;

public class OuterClass {

		int b;
		
		void outermethod() {
		System.out.println("Method in outer class");
		
		}


 class InnerClass{
	 int a;
	 
	 void innermethod() {
		 System.out.println("Method in inner class");
	 }
 }
	

   public static void main(String args[]) {
	   
	   OuterClass out=new OuterClass();
	   
	   OuterClass.InnerClass ref = out.new InnerClass();
	   ref.innermethod();
   }
	 
 }
