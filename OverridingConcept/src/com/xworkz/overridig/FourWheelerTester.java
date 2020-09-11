package com.xworkz.overridig;

public class FourWheelerTester {

	public static void main(String[] args) {
		
		FourWheeler car=new FourWheeler();
		car.name="maruthisuzuki";
	
				
		Vehicle vehi=new Vehicle();
		vehi.color="black";
		
		TwoWheeler bike=new TwoWheeler();
		bike.noOfWheels=2;

		
		System.out.println("name:"+ car.name+" noOfWheels: "+bike.noOfWheels+"color:"+vehi.color);
		
		car.acceleratebrake();
		car.startthetwowhwheeler();
		car.stopFourwheeler();

	}

}
