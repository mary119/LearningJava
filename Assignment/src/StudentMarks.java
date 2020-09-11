import java.util.Scanner;

public class StudentMarks {

	public static void main(String[] args) {
		    Scanner scan=new Scanner(System.in);
			int num=0;
			int total=0;
			double percentage=0;
			System.out.println("Enter the number of subjects");
			num=scan.nextInt();
			
			int[] myarray=new int[num];
			System.out.println("Enter Marks");
			for(int i=0;i<num;i++) {
				myarray[i]=scan.nextInt();
				total=total+myarray[i];
			}
			System.out.println("The sum is:" + total);
			
			percentage = (double) total/num;
			System.out.println("The percentage is:"+ percentage);
				
			    
			}

}
