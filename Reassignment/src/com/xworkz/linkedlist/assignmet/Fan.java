package com.xworkz.linkedlist.assignmet;

public class Fan {

     String brand;
     int noOfWings;
	public Fan(String brand, int noOfWings) {
		super();
		this.brand = brand;
		this.noOfWings = noOfWings;
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
	@Override
	public String toString() {
		return "Fan [brand=" + brand + ", noOfWings=" + noOfWings + "]";
	}
     
	

}
