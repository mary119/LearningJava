package com.xworkz.staticmembers;

public class Employ {
	 String employname;
     int id;
	  static String company;//global variable
	
	static {
		//iniatialization}
	}

	
	public Employ(String employname, int id) {
		super();
		this.employname = employname;
		this.id = id;
	}
		
	
	static void initCompany() {
	company="Xworkz";
	}
	
  void display() {
	  System.out.println("Employname:"+employname);
	  System.out.println("Employ id:"+id);
	  System.out.println("Employcompany:"+company);
    }
	

}
