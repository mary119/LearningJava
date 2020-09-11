package com.xworkz.priorityqueue.assignmet;

public class ChocolatesPQ implements Comparable<ChocolatesPQ>{
	String chocoName;
	double price;
	public ChocolatesPQ(String chocoName, double price) {
		super();
		this.chocoName = chocoName;
		this.price = price;
	}
	public String getChocoName() {
		return chocoName;
	}
	public void setChocoName(String chocoName) {
		this.chocoName = chocoName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "ChocolatesPQ [chocoName=" + chocoName + ", price=" + price + "]";
	}
	@Override
	public int compareTo(ChocolatesPQ o) {
		return this.chocoName.compareTo(o.getChocoName());
	}
	

}
