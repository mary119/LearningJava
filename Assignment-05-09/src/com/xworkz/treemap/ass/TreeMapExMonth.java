package com.xworkz.treemap.ass;

public class TreeMapExMonth {
	String month;
	int noOfDays;
	public TreeMapExMonth(String month, int noOfDays) {
		super();
		this.month = month;
		this.noOfDays = noOfDays;
	}
	public String getMonth() {
		return month;
	}
	public void setMonth(String month) {
		this.month = month;
	}
	public int getNoOfDays() {
		return noOfDays;
	}
	public void setNoOfDays(int noOfDays) {
		this.noOfDays = noOfDays;
	}
	@Override
	public String toString() {
		return "TreeMapExMonth [month=" + month + ", noOfDays=" + noOfDays + "]";
	}
	

}
