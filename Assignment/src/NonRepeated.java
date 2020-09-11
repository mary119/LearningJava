
public class NonRepeated {

	public static void main(String[] args) {
		int[] repeated= {25,14,19,25,10,14,22};
		int length=repeated.length;
		for(int i=0;i<length;i++)
		{
			for(int j=i+1;j<length;j++)
			{
				if(repeated[i]==repeated[j]) 
				{
				System.out.println("The repeated elements are:" + repeated[i]);;
				}
				
			}
		}

	}

}
