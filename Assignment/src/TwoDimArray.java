import java.util.Scanner;

public class TwoDimArray {

	public static void main(String[] args) {
		
        Scanner scan=new Scanner(System.in);
        int[][] arry=new int[3][3];
        int n;
        System.out.println("Enter the row and column");
        n=scan.nextInt();
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
			  System.out.println("Enter the numbers in ["+i+"]["+j+"]");
			    arry[i][j]=scan.nextInt(); 
			  
			}
		}
		System.out.println("The matrix is..... ");
		for(int i=0;i<n;i++)
		{
		   for(int j=0;j<n;j++)
		   {
                System.out.print(arry[i][j]+"    ");
		   }
		         System.out.println();
	
		}
		
	}
}

