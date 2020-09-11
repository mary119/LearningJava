package com.xworkz.exceptionhandling;

import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		System.out.println("start a prgm");
		
		int a=10 ,b=20;
		
		int sum=a+b;
		System.out.println("Sum is :"+sum);
		
		//Scanner sc=new Scanner(System.in);
		//int input=sc.nextInt();
		//System.out.println("Enter the two numbers: ");
		int x=10,y=0;
		
		try 
		{
		  int div =x/y;
		   System.out.println("Div is: "+div);
		  }catch(ArithmeticException e) {
			System.out.println("you have entered the zero for the divisor,please enter the different value");
		}
		
		String name=null;
		
		try 
		{
			int length=name.length();
			System.out.println("Length of the string is:"+length);
		}catch (NullPointerException e) {
			System.out.println("Please Enter the name");
		}
		 
		 System.out.println("end prgm");
		}
		

	}


