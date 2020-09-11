package com.xworkz.assignment30;

public class SchoolPQ implements Comparable<SchoolPQ>{
	
	String name;
	String City;
	String medium;
	public SchoolPQ(String name, String city, String medium) {
		super();
		this.name = name;
		City = city;
		this.medium = medium;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getMedium() {
		return medium;
	}
	public void setMedium(String medium) {
		this.medium = medium;
	}
	@Override
	public int compareTo(SchoolPQ o) {
		// TODO Auto-generated method stub
		return this.name.compareTo(o.getName());
	}
	@Override
	public String toString() {
		return "SchoolPQ [name=" + name + ", City=" + City + ", medium=" + medium + "]";
	}
	

}
