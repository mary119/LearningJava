package com.xworkz.casting;

public class Tester {

	public static void main(String[] args) {
		
		Transport trans=new Transport();
		
		System.out.println("the value of a :"+trans.a);
		trans.travelling();
		
		RoadwayTransport rdtrans=new RoadwayTransport();
		System.out.println("Value of a in childclass:"+rdtrans.a);
		System.out.println("Value of b in childclass:"+rdtrans.b);
		
		rdtrans.travelling();//cc
		rdtrans.road(); //cc
		
		Transport ctrans=new RoadwayTransport(); //auto casting
		
		System.out.println("The value of a during upcasting:"+ctrans.a);
		ctrans.travelling();
		



	}

}
