import java.util.Scanner;

public class Investment{
	public static void main(String[]args){
		Scanner input=new Scanner(System.in);
		final double INTEREST=.08;
		double investment;
		int years;
		
		System.out.print("Please enter an investment amount: ");
		investment=input.nextDouble();
		
		while(investment<=0){
			System.out.println("ERROR\nYou've entered an invalid "+
				"investment amount.");
			System.out.print("Please enter a VALID investment amount"+
				" as a non-negative/non-zero number, in dollars and "+
				"cents: ");
			investment=input.nextDouble();
		}
		
		System.out.print("How many years do you plan to keep "+
			"this money invested? ");
		years=input.nextInt();
		
		while(years<=0){
			System.out.println("ERROR\nYou've entered an invalid "+
				"amount of years.");
			System.out.print("Please enter your investment duration "+
				"in years as a whole, non-negative/non-zero number: ");
			years=input.nextInt();
		}
		
		System.out.println("The interest rate is 8%.");
		System.out.println("The original investment is "+investment+
			".");
		
		for(int num=1; num<=years; ++num){
			investment += investment*INTEREST;
			System.out.println("After year "+num+", your investment "+
				"is "+investment+".");
		}
	}
}