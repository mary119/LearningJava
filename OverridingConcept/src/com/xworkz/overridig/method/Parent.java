package com.xworkz.overridig.method;

import com.xworkz.overridig.Food;

public class Parent {
	
	String joinTwoStrings(String a, String b) {
		
		String res = a+b;
		return res;
	}
	static void returnObjectMethod(Food food) {
	
		food.cooking();
	}

}
