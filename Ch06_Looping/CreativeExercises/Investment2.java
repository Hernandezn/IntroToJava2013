import java.util.Scanner;

public class Investment2{
	public static void main(String[]args){
		Scanner input=new Scanner(System.in);
		double unconvertedInterest;
		double interest;
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
		}//investment amount
		
		System.out.print("How many years do you plan to keep "+
			"this money invested? ");
		years=input.nextInt();
		
		while(years<=0){
			System.out.println("ERROR\nYou've entered an invalid "+
				"amount of years.");
			System.out.print("Please enter your investment duration "+
				"in years as a whole, non-negative/non-zero number: ");
			years=input.nextInt();
		}//investment duration in years
		
		System.out.print("Please enter an interest rate: ");
		unconvertedInterest=input.nextDouble();
		
		while(unconvertedInterest<=0){
			System.out.println("ERROR\nYou've entered an invalid "+
				"interest rate.");
			System.out.print("Please enter your interest rate "+
				"as a non-negative, non-zero number: ");
			unconvertedInterest=input.nextDouble();
		}//interest rate per year
		
		if(unconvertedInterest<1)
			interest=unconvertedInterest;
		else
			interest=unconvertedInterest/100.0;
		//Converts interest into something mathematically workable
		
		System.out.println("The original investment is "+investment+
			".");
		
		for(int num=1; num<=years; ++num){
			investment += investment*interest;
			System.out.println("After year "+num+", your investment "+
				"is "+investment+".");
		}
	}
}