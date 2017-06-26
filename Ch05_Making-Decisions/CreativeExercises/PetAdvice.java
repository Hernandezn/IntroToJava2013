import java.util.Scanner;

public class PetAdvice{
	public static void main(String[]args){
		int residence;
		int hrsAtHome;
		String recommendation;
		Scanner input=new Scanner(System.in);
		
		System.out.println("Welcome to PetAdvice.\nFirst off, which "+
			"type of home do you reside in?\nType 1 for house, 2 for "+
			"apartment, or 3 for dormitory.");
		residence=input.nextInt();
		System.out.println("For about how many hours do you stay at home"+
			" during the average day?\nType \"1\" for 18 or more hours, "+
			"\"2\" for 10 to 17 hours, \"3\" for 8 to 9 hours,\n\"4\" for "+
			"6 to 7 hours, or \"5\" for 0 to 5 hours.");
		hrsAtHome=input.nextInt();
		
		switch(residence){
			case 1:
				switch(hrsAtHome){
					case 1:
						recommendation="pot-bellied pig";
						break;
					case 2:
						recommendation="dog";
						break;
					case 3:
					case 4:
					case 5:
						recommendation="snake";
						break;
					default:
						recommendation="invalid";
						break;
				}
				break;
			case 2:
				switch(hrsAtHome){
					case 1:
					case 2:
						recommendation="cat";
						break;
					case 3:
					case 4:
					case 5:
						recommendation="hamster";
						break;
					default:
						recommendation="invalid";
						break;
				}
				break;
			case 3:
				switch(hrsAtHome){
					case 1:
					case 2:
					case 3:
					case 4:
						recommendation="fish";
						break;
					case 5:
						recommendation="ant farm";
						break;
					default:
						recommendation="invalid";
						break;
				}
				break;
			default:
				recommendation="invalid";
				break;
		}
		
		System.out.println("Based on your input, the program's "+
			"recommended pet would be a(n) "+recommendation+".");
	}
}