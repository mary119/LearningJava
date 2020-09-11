
public class DoubleArray {

	public static void main(String[] args) {
		
		
		double[] dArray=new double[5];
		dArray[0]=20.00;
		dArray[1]=40.00;
		dArray[2]=30.00;
		dArray[3]=60.00;
		dArray[4]=70.00;
		
		System.out.println("The value in the dAarry are:");
		
		/*int length=dArray.length;
		for(int i=0;i<length;i++) {
			System.out.println(dArray[i]);
		}*/
		for(double d:dArray) {
			System.out.println(d);
		}
		

	}

}
