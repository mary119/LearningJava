package com.xworkz.interfaceconcept;

public class MobileTester {

	public static void main(String[] args) {
		
		Mobile mi=new Mobile();
		mi.charging();
		mi.connectedToLaptop();
		mi.makeACall();
		mi.playMusic();
		
		System.out.println(" ");
		
		Mobile vivo=new Mobile();
		vivo.charging();
		vivo.connectedToLaptop();
		vivo.makeACall();
		
		vivo.playMusic();
		

	}

	
}

