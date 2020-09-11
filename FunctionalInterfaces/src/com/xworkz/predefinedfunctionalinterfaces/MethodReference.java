package com.xworkz.predefinedfunctionalinterfaces;

import java.util.Arrays;
import java.util.List;

public class MethodReference {
	
	List<String>letters = Arrays.asList("a", "b", "c", "d");
	
	long start =System.currentTimeMillis();
	letters.stream().forEach(x -> System.out.println(x));
    long end =System.currentTimeMillis();
    System.out.println(end-start);
}
