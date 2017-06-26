import java.util.Scanner;

public class Eggs{
	public static void main(String[]args){
		Scanner input=new Scanner(System.in);
		int numberOfEggs;
		
		System.out.print("Please enter the desired number of eggs: ");
		numberOfEggs=input.nextInt();
		System.out.println("You want "+fullDozens(numberOfEggs)+
			" full dozens of eggs along with "+(numberOfEggs%12)+
			" extraneous eggs.");
	}
	
	public static int fullDozens(int num){
		int dozens=num/12;
		return dozens;
	}
}