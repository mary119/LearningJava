
public class Interchange {

	public static void main(String[] args) {
		
		int arr[][]= {{1,2,3},{4,5,6},{7,8,9}};
		
		System.out.println("The matrix befor interchange: ");

		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(arr[i][j] +"\t");
			}
			System.out.println("");
		}
		//interchanging
		for(int i=0;i<3;i++)
		{
			   int t=arr[i][i];
				arr[i][i]=arr[i][3-1-i];
			    arr[i][3-1-i]=t;
	    }
			
		System.out.println("The interchanged matrix is:");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++) 
			{
				System.out.print(arr[i][j] +"\t");
			}
			System.out.println("");
				
		}
	}
}


