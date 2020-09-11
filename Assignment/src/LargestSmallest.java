
public class LargestSmallest {

	public static void main(String[] args) {
		
		
		int Array[][]= {{98,14,19},{75,5,36},{25,45,96}};
		int min=Array[0][0];
		int max=Array[0][0]; 
		
		for(int i=0;i<3;i++) {
			 for(int j=0; j<3; j++) {
				 if(min>Array[i][j]) {
					 min=Array[i][j];
				 }
			     if(max<Array[i][j]){
				      max=Array[i][j];
				 }
				      
				 }
				System.out.println("The Max number is: " + max );
				System.out.println("The Min number is: " + min );
				
			}
	
		 }
		
		

	}


