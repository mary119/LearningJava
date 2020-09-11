
public class TransMatrix {

	public static void main(String[] args) {
		
	   int matrix[][]= {{1,2},{3,4}};
	   int trans[][]= new int[2][2];
	   System.out.println("The given matrix is:");
	   
	   for(int i=0;i<2;i++)
	   {
		   for(int j=0;j<2;j++) 
		   {
			 
			 System.out.println(matrix[i][j] );
		   }
	   }
	   for(int i=0;i<2;i++)
	   {
		   for(int j=0;j<2;j++) 
		   {
			 trans[i][j]=matrix[j][i];
		   }
	   }
	   System.out.println("Matrix after Transpose is:" );
	   for(int i=0;i<2;i++)
	   {
		   for(int j=0;j<2;j++) 
		   {
				 System.out.println(trans[i][j] + " ");

		   }
	   }
	    
		System.out.println( );	 
		  
	 }

}


