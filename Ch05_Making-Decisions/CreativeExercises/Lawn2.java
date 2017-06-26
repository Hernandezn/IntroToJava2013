import java.util.Scanner;

public class Lawn2{
	public static void main(String[]args){
		int weeklyFee;
		int lotLength,lotWidth,lotArea;
		int seasonFee;
		int svcCharge;
		int payPlan, payments;
		double payment, totalFee;
		final int SMALL_WEEKLY_FEE=25;
		final int MED_WEEKLY_FEE=35;
		final int LARGE_WEEKLY_FEE=50;
		final int WEEKS_PER_SEASON=20;
		Scanner input=new Scanner(System.in);
		
		System.out.print("What is the length of your lawn (in feet)? ");
		lotLength=input.nextInt();
		System.out.print("What is the width of your lawn (in feet)? ");
		lotWidth=input.nextInt();
		System.out.println("Please select your payment plan.\nType 1 "+
			"for a one-time payment, 2 for two payments, or 3 for twenty"+
			" payments.");
		payPlan=input.nextInt();
		
		lotArea=lotLength*lotWidth;
		
		if(lotArea<4000)
			weeklyFee=SMALL_WEEKLY_FEE;
		else
			if(lotArea<6000 && lotArea>=4000)
				weeklyFee=MED_WEEKLY_FEE;
			else
				weeklyFee=LARGE_WEEKLY_FEE;
		
		seasonFee=weeklyFee*WEEKS_PER_SEASON;
		
		switch(payPlan){
			case 1:
				payments=1;
				svcCharge=0;
				break;
			case 2:
				payments=2;
				svcCharge=5;
				break;
			case 3:
				payments=20;
				svcCharge=3;
				break;
			default:
				payments=1;
				svcCharge=1;
				break;
		}
		
		payment=(double)seasonFee/(double)payments+svcCharge;
		totalFee=payment*payments;
		
		System.out.println("Based on your input, you will make "+
			payments+" payment(s), you will pay $"+payment+
			" on the payment date(s),\nand your total cost for the 20-week"+
			" season will be $"+totalFee+".");
	}
}