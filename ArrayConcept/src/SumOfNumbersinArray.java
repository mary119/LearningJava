
public class SumOfNumbersinArray {

	public static void main(String[] args) {
		
		int[] numbers= {12,15,3,4,5,6};
		int sum=0;
		/*for(int i=0;i<numbers.length;i++) {
			sum+=numbers[i];
			
		}
		System.out.println("The sum of all numbers:"+sum);
		*/
		for(int num:numbers) {
			sum += num;
		}
	
		System.out.println("The sum of all numbers:"+sum);
		
	
	}

}
