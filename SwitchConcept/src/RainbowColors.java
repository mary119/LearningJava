import java.util.Scanner;

public class RainbowColors {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the color name");
		String color=scan.next();
		scan.close();
		
		switch(color) {
		 
		case "voilet":
			System.out.println("Entered color is rainbow color");
			break;
		case "indigo":
			System.out.println("Entered color is rainbow color");
			break;
		case "brown":
			System.out.println("Entered color is rainbow color");
			break;
		case "green":
			System.out.println("Entered color is rainbow color");
			break;
		case "orange":
			System.out.println("Entered color is rainbow color");
			break;
		case "yellow":
			System.out.println("Entered color is rainbow color");
			break;
		case "red":
			System.out.println("Entered color is rainbow color");
			break;
		default:
			System.out.println("Entered color is not rainbow color");
			break;
			}
	}

}
