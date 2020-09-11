package com.xworkz.predefinedfunctionalinterfaces;



import java.util.function.Consumer;

public class Consumerimpl {
	
	public static void main(String args[]) {

	     ConsumerConcept<Integer> consumer=(t) ->{ System.out.println(t);
	     };
	
	     consumer.accept(10);
	

	     // List<Integer>list1=Arrays.oslist(1, 2, 3, 4);
	      //list1.stream().forEach(consumer);
		
	}	
	
}
    
