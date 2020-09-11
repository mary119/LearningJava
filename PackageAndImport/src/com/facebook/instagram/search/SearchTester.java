package com.facebook.instagram.search;

//import to get visibility of thecls from diff pkg
import com.facebook.instagram.login.LoginValidation;//to import single class login validation
import com.facebook.instagram.login.*;//to import all that classes in that package

public class SearchTester {
	public static void main(String args[]) {
	
		
		//use qualified cls name when cls names are sae but in different pkgs.
		
		com.facebook.instagram.login.User user=new com.facebook.instagram.login.User();
		com.facebook.instagram.stories.User user2=new com.facebook.instagram.stories.User();
	}

}
