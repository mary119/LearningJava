import java.util.Scanner;

public class StarPattern {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter number of rows and columns");
		int rows=scan.nextInt();
		scan.close();
		
		for(int i=0;i<=rows-1;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
