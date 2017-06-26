import java.util.Scanner;

public class Calculator{
	public static void main(String[]args){
		Scanner input=new Scanner(System.in);
		double origPrice,commissionRate,discountRate;
		
		System.out.print("Please enter the listed price of your item: ");
		origPrice=input.nextDouble();
		
		System.out.print(
			"Now, enter the percentage of your salesperson's commission: "
			);
		commissionRate=input.nextDouble();
		
		System.out.print(
			"Finally, we'll need your customer discount rate percentage: "
			);
		discountRate=input.nextDouble();
		
		System.out.print("The final price for your transaction is $"+
			finalTransaction(origPrice,commissionRate,discountRate)+".");
	}
	
	public static double finalTransaction
	(double price,double cmsn,double dscnt){
		double cmsnValue=price*(cmsn/100);
		double dscntValue=(cmsnValue+price)*(dscnt/100);
		double priceUnrounded=price+cmsnValue-dscntValue;
		double endgamePrice=Math.round(priceUnrounded);/*defunct; returns
			a value too low*/
		return priceUnrounded;
	}
}