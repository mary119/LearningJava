package com.xworkz.collectionfw.hashmap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class VehicleRegistrationMap {

	public static void main(String[] args) {
		
		HashMap<String, String> regMap =new HashMap<String, String>();
		
		regMap.put("KA36ME9114", "Mary");
		regMap.put("KA36ME9115", "Madhu");
		regMap.put("KA36ME9116", "Manu");
		
		System.out.println("The Map is:"+regMap);
		
		regMap.put("KA36ME9114","Megha");
		regMap.put(null, null);
		regMap.put(null, "Mary");
		System.out.println("The Map is:"+regMap);

		
		System.out.println("The value of KA36ME9114 is:"+regMap.get("KA36ME9114"));
		
		Set<String> regSet=regMap.keySet();
		System.out.println(regSet);
		
		for(String k:regSet) {
			System.out.println("key:" + k  + "   Value:"+regMap.get(k));
		}

		Collection<String> values= regMap.values();
		System.out.println(values);
		
		System.out.println("Does Map contains:"+regMap.containsKey("KA36ME9114"));
		regMap.containsValue("Mary");
	}

}
