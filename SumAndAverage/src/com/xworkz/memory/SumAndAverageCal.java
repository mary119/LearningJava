package com.xworkz.memory;

public class SumAndAverageCal {

	void sumAndAverage(int a,int b) {
		
		int sumOfNumbers= sum(a , b);
		double avgOfNumbers=average(sumOfNumbers, 2);
		
		System.out.println("Sum of 2 numbers: "+ sumOfNumbers);
		System.out.println("Average of 2 numbers: "+ avgOfNumbers);
	}
	
	int sum(int d, int e) {
		int sum=d + e;
		return sum;
		
	}
	
	double average(int total, int divident)
	{
		double avg=total/divident;
		return avg;
	
	}
}


