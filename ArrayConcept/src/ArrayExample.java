
public class ArrayExample {

	public static void main(String[] args) {
	
		System.out.println("Start a prgm");
		
		int myArray[];
		myArray=new int[10];//set the value of array
		
		myArray[0]=3;//assigning the value to the array index
		myArray[1]=6;
		myArray[4]=9;
		myArray[6]=12;
		myArray[8]=24;
		
		/*
	    ) System.out.println("The value in index 0 is:"+myArray[0]);
		*System.out.println("The value in index 1 is:"+myArray[1]);
		*System.out.println("The value in index 4 is:"+myArray[4]);
		*System.out.println("The value in index 6 is:"+myArray[6]);
		*System.out.println("The value in index 8 is:"+myArray[8]);
		
		*/
		
		System.out.println("Display the contents of array using for loop");
		for(int i=0;i<myArray.length;i++) {
		System.out.println("the value in the array are : " + myArray[i]);
		}
		int mySecondArray[]= {3,6,9,12,15,18,21};
		for(int i=0;i<mySecondArray.length;i++) {
			System.out.println("The values in the mySecondArray are:"+mySecondArray[i]);
		}
		System.out.println("End of prgm");
	}

}
