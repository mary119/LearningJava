package com.xworkz.collectionfw.arraylist;

import java.util.ArrayList;

public class PowerBankTester {

	public static void main(String[] args) {

		ArrayList<PowerBank> powerBankList = new ArrayList<PowerBank>();
		
		PowerBank pb1 = new PowerBank(10000,2,"MI" ,50000);
		powerBankList.add(pb1);
		
		PowerBank pb2 = new PowerBank(5000,1,"VIVO" ,20000.00);
		powerBankList.add(pb2);

		
		powerBankList.add(new PowerBank(8000,2,"MI" ,50000));
    
		System.out.println(powerBankList);
		powerBankList.remove(pb2);
		
		System.out.println(powerBankList);
		
		for(int i=0;i<powerBankList.size();i++) {
			System.out.println("obj"+i+":"+powerBankList.get(i));
		}
		
		for(PowerBank ref:powerBankList) {
			System.out.println("****"+ref);
		
		}
		for(PowerBank pb:powerBankList) {
			if(pb.getBatteryCapacity()==5000) {
				pb.setBrand("LG");
				System.out.println("new brand is :"+pb.getBrand());
			}
		}
		
		System.out.println(powerBankList);
		
		powerBankList.set(1, new PowerBank(8500,2,"HP" ,50000));
		
		//remove all the brands belonging to mi
		for(PowerBank pb:powerBankList) {
			if(pb.getBrand().equals("MI")) {
				powerBankList.remove("pb");
			}
		}
		
		System.out.println(powerBankList);
	}

}
