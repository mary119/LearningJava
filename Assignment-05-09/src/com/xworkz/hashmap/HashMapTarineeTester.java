package com.xworkz.hashmap;

public class HashMapTarineeTester {

	public static void main(String[] args) {
		
		HashMapTrainee mary=new HashMapTrainee(1,"Mary");
		HashMapTrainee madhu=new HashMapTrainee(2,"Madhu");
		HashMapTrainee manu=new HashMapTrainee(3,"Manu");
		HashMapTrainee mary1=new HashMapTrainee(4,"Mary");
		
		System.out.println("Hashcode of mary:"+mary.hashCode());
		System.out.println("Hashcode of mary1:"+mary1.hashCode());
		
		System.out.println(mary.equals(mary1));
  
		
	}

}
