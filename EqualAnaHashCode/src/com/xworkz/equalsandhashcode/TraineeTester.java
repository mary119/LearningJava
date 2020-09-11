package com.xworkz.equalsandhashcode;

import java.util.HashSet;

public class TraineeTester {

	public static void main(String[] args) {

		Trainee mary1=new Trainee(1,"Mary");
		Trainee mary2 =new Trainee(2,"Mary");
		Trainee madhu =new Trainee(3,"Madhu");
		
		System.out.println("The hashcode:"+mary1.hashCode());
		System.out.println("The hashcode is:"+mary2.hashCode());
		
        System.out.println(mary1.equals(mary2));	
        
        HashSet<Trainee> traineeSet=new HashSet<Trainee>();
        traineeSet.add(mary1);
        traineeSet.add(mary2);
        traineeSet.add(madhu);
        
	      System.out.println("The Set is:"+traineeSet);
	 }

}