package com.xworkz.predefinedfunctionalinterfaces;

public class SupplierImpl {

	public static void main(String[] args) {
		Supplier<String> supplier = ()-> {
			return "Hi";
		};
		System.out.println(supplier.get());

	}

}
