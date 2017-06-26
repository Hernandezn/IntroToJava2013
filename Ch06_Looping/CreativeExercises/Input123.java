import java.util.Scanner;

public class Input123{
	public static void main(String[]args){
		int num;
		Scanner input=new Scanner(System.in);
		
		System.out.println("Please type 1, 2, 3, or 4.");
		num=input.nextInt();
		
		while(num!=1 && num!=2 && num!=3 && num!=4){
			System.out.println("Error!\n\nPlease enter a number, "+
				"1 through 4, inclusive.");
			num=input.nextInt();
		}
		
		while(num==1 || num==2 || num==3){
			System.out.println("Good job!");
			System.out.println("Please enter another number, 1-4.");
			num=input.nextInt();
			while(num!=1 && num!=2 && num!=3 && num!=4){
				System.out.println("Error!\n\nPlease enter a number, "+
					"1 through 4, inclusive.");
				num=input.nextInt();
			}
		}
		
		System.out.println("Program is ending...");
	}
}