import java.util.Scanner;

public class CheckingAccTest{
	public static void main(String[]args){
		
		CheckingAccount one;
		CheckingAccount ace;
		int num1,numA;
		double bal1,balA;
		Scanner input=new Scanner(System.in);
		
		System.out.println("Input for account one...");
		
		num1=accNumAssign(input);
		bal1=balAssign(input);
		
		one=new CheckingAccount(num1,bal1);
		System.out.println("Input for account ace...");
		
		numA=accNumAssign(input);
		balA=balAssign(input);
		
		ace=new CheckingAccount(numA,balA);
		
		System.out.println("Account one info:");
		one.displayData();
		System.out.println("Account ace info:");
		ace.displayData();
	}
	
	public static int accNumAssign(Scanner x){
		System.out.println("Please enter your account number: ");
		int num=x.nextInt();
		
		return num;
	}
	public static double balAssign(Scanner x){
		System.out.println("What is your account balance? ");
		double num=x.nextDouble();
		
		return num;
	}
}