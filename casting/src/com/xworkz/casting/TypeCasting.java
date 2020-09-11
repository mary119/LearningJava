package com.xworkz.casting;

public class TypeCasting {
	public static void main(String args[]) {
	
	int a=10;
	long b=a;
	 int res = sum(a,b); //int,long
	 System.out.println(res);
	 
	 long c=10l;
	 int d=(int)c;//casting 

     }
     static int sum(long a, double b) {
	 int sum =(int) (a+b);
	 return sum;
     }
     
}
     
  