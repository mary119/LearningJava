package com.xworkz.assignment30;

import java.util.Comparator;

public class Fan implements Comparator<Fan>{
	
	
	String brand;
	int noOfWings;
	double price;
	
	public Fan(String brand, int noOfWings, double price) {
		super();
		this.brand = brand;
		this.noOfWings = noOfWings;
		this.price = price;
	}
	

	public String getBrand() {
		return brand;
	}


	public void setBrand(String brand) {
		this.brand = brand;
	}


	public int getNoOfWings() {
		return noOfWings;
	}


	public void setNoOfWings(int noOfWings) {
		this.noOfWings = noOfWings;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	@Override
	public String toString() {
		return "Fan [brand=" + brand + ", noOfWings=" + noOfWings + ", price=" + price + "]";
	}


	@Override
	public int compare(Fan o1, Fan o2) {
		// TODO Auto-generated method stub
		return 0;
	}

	
	
	
	
	

}
