package com.xworkz.interfaceconcept;

public class Flower implements Rose,Jasmine{

	@Override
	public void decorating() {
		System.out.println(" decorating the church");
		
	}

	@Override
	public void tieing() {
		System.out.println(" to make garland tie the flowers");
		
	}

	@Override
	public void blooming() {
		System.out.println("flowers bloom in mrng");
		
	}

	@Override
	public void offeringGod() {
		System.out.println("floers are used to offer god");
	
		
	}

}
