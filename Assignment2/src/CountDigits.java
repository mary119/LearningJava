import java.util.Scanner;

public class CountDigits {

	public static void main(String[] args) {
		
	    
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter number");
		int num=scan.nextInt();
		
		int count=1;
		while(num!=0)
		{
			num/=0;
			++count;
		}
	
	System.out.println("The number of digits:"+count);
	
	}

}
