import java.util.Scanner;

public class OddNumAndTheirSum {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the numbers");
	    int num=scan.nextInt();
	    int i=1;
	    int sum=0;
	    
	    do {
	    	if(i%2!=0) 
		        System.out.println("The odd numbers are:"+i);

	    		i++;
	    		sum=sum+i;
	    		
	    	}while(i<num);
		
	    	System.out.println(" sum is :"+sum);
	    
	    scan.close();		
	}

}
