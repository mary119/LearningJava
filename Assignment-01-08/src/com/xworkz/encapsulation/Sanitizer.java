
package com.xworkz.encapsulation;

public class Sanitizer {
	private String WaterContent;
	protected String AlcoholContent;
	double Price;
	
	void setWaterContent(String inputWaterContent) {
		WaterContent=inputWaterContent;
	}
	String getWaterContent() {
		System.out.println("the water content is:"+WaterContent);
		return WaterContent;
	}
	 void setAlcoholContent(String inputAlcoholContent) {
		 AlcoholContent=inputAlcoholContent;
	 }
     String getAlcoholContent() {
    	 System.out.println("the alcohol content is :"+AlcoholContent);
    	 return AlcoholContent;
     }
     
     void setprice(double inputprice) {
    	 Price=inputprice;
     }
     double getprice() {
    	 System.out.println("the price of sanitizer is:"+Price);
    	 return Price;
    	 
    }
     
}

