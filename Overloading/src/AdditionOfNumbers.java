
public class AdditionOfNumbers {

	int a, b, c;
	AdditionOfNumbers(){
		
	}
	public AdditionOfNumbers(int inputa,int inputb, int inputc)
	
	{
		a=inputa;
	    b=inputb;
	    c=inputc;
				
	}
	void sum (int a, int b) {
		int sum= a+b;
		System.out.println("sum of the two numbers :"+sum);
	}
	void sum (int a, int b, int c) {
		int sum =a+b+c;
		System.out.println("the sum of three numbers :"+sum);
	}
	void sum (double a,double b,double c) {
		double sum=a+b+c;
		System.out.println("the sum of three numbers :"+sum);
	}

	public static void main(String[] args) {
		AdditionOfNumbers add =new AdditionOfNumbers();
		add.sum(add.a, add.b);
		
		add.sum(55, 267,10);
	
	}
}