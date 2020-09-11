import java.util.Scanner;

public class CubeOfNum {

	public static void main(String[] args) {
		
	     Scanner scan=new Scanner(System.in);
	     System.out.println("Enter a number");
	     int num=scan.nextInt();
	     scan.close();
	      
	     for(int i=1;i<num;i++) 
	     {
	    	 System.out.println("The cube of "+i+" is:"+ i*i*i);
	    	 
	     }
	
	
	
	}

}
