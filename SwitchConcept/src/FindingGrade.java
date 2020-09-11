

public class FindingGrade {

	public static void main(String[] args) {
		
		char grade='A';
		
		switch (grade) {
		
		case 'A':
			System.out.println("Marks is in bw 85 to 100");
			break;
			
		case 'b':
			System.out.println("Marks is in bw 60 to 84");
			break;
			
		case 'c':
			System.out.println("Marks is in bw 35 to 64");
		    break;
		    
		default:
			System.out.println("Yor are failed");
		   break;
	}

	}

}
