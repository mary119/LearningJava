package com.xworkz.predefinedfunctionalinterfaces;

public class PredicateImpl  {

	public static void main(String[] args) {
		
		PredicateCon<Integer>predicate = (t)-> t % 2==0;
		
		System.out.println(predicate.test(8));
		//if(t%2==0) {
		//	return true;
		//}else {
			//return false;
		//}
			
		//}

	}

}
