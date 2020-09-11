package com.xworkz.overridig;

public class VegiTester {

	public static void main(String[] args) {
		Vegitarean vegi=new Vegitarean();
		vegi.cusineType="Indian";
		
		System.out.println("CusinType:"+vegi.cusineType + "Quantity:"+vegi.QuantityInGrams );
		vegi.cooking();
		vegi.vegiMethod();

	}

}
