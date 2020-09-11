
public class DisplayFibonacci {

	public static void main(String[] args) {
		int number= 15;
		int a=0,b=1,i=1;
		System.out.println("the fibonacci series of number:"+number);
		while(i<=number) {
			System.out.println( a+"" );
			int sum=a+b;
			a=b;
			b=sum;
			i++;
		
		}
	}

}
