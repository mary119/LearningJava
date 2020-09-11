package com.interfaceconcept.annonymusinterface;

public class MathOperatorTesterA {

	public static void main(String[] args) {
		
		MathOperation math=new MathOperation() {
			
			@Override
			public int add(int a, int b) {
				int sum = a+b+5;
				System.out.println(sum);
				return sum;
			}

			@Override
			public int sub(int a, int b) {
				int diff=a-b-5;
				System.out.println(diff);
				return diff;
			}

			
		};
		math.add(5,10);
		math.sub(20,10);

	}

}

