package com.xworkz.streamconcept;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ListToString {

	public static void main(String[] args) {

		List<String> liststr= Arrays.asList("abc","" ,"bc ","efg","abd","","jkl");
		
		//String[] array=List.
				///.toArray(new String[0]);
		String[] strings = liststr.toArray(new String[0]);
		System.out.println(Arrays.toString(strings
				));
		
		
		//Predicate<String> mptysp=s->(str!=null && s.length()!=0);
		//System.out.println(mptysp);
		List<String> mptyspce =liststr.stream().filter(s->s!=null &&
				s.length()!=0).collect(Collectors.toList());
		System.out.println(mptyspce);
		
		long noOfEmptyString=liststr.stream().filter(s->s!=null && s.length()==0).count();
		System.out.println(noOfEmptyString);


	}
}


