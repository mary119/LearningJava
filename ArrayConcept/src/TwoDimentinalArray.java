
public class TwoDimentinalArray {

	public static void main(String[] args) {
	
		
		int intArray[][];
		/*intArray=new int[2][2];
		
		intArray[0][0]=1;
		intArray[0][1]=2;
		intArray[1][0]=3;
		intArray[1][1]=4;
		
		for(int i=0;i<2;i++){
			for(int j=0;j<2;j++) {
				System.out.print("["+  i + "][" + j + "]");
				System.out.println(intArray[i][j]);
				
			}
			
		}*/
		
		/*int[][] literalIntArray= {{10,20},{30,40}};
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				System.out.print("[" + i +"]["+ j + "]:");
				System.out.println(literalIntArray[i][j]);
			}*/
			System.out.println("===3===");
			int[][] threeArray= {{11,12,13},{14,15,16},{17,18,19}};
			
			for(int i=0;i<3;i++) {
				for(int j=0;j<3;j++) {
					System.out.print(threeArray[i][j]+"\t");
				}
				System.out.println();
			}
			
		}

	}


