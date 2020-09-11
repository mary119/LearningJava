
public class SeparateEvenOdd {

	public static void main(String[] args) {
		int[] myarray= {24,14,19,87,10,36,22};
		int length=myarray.length;
		System.out.print("The even numers are:");
		for(int i=0;i<length;i++) {
			if(myarray[i]%2==0)
			{
				System.out.println(myarray[i] + " "); 
			}
		}
			
		System.out.println("The Odd numbers are:");
			
	    for(int i=0;i<length;i++) 
	    {
				if(myarray[i]%2!=0) 
			
                {
				    System.out.println(myarray[i] + " ");
			    }
		}
            
            
	}

}
