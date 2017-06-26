import java.util.Scanner;

public class Pay{
	public static void main(String[]args){
		Scanner input=new Scanner(System.in);
		int lvl;
		int hrs;
		double payGrade;
		double insPlan1=0;
		double insPlan2=0;
		double insPlan3=0;
		double fullWeekPay;
		double ovtPay=0;
		double grossPay;
		double deduction=0;
		double netPay;
		String retirementSelection="";
		boolean retirementPlan=false;
		final int FULL_WORK_HOURS=40;
		final double LEVEL_1_PAY=17.00;
		final double LEVEL_2_PAY=20.00;
		final double LEVEL_3_PAY=22.00;
		
		System.out.println("What is your registered skill level?"+
			" (1, 2, or 3)");
		lvl=input.nextInt();
		
		if(lvl<1)
			lvl=1;
		if(lvl>3)
			lvl=3;
		
		switch(lvl){
			case 1:
				payGrade=LEVEL_1_PAY;
				break;
			case 2:
				payGrade=LEVEL_2_PAY;
				break;
			case 3:
				payGrade=LEVEL_3_PAY;
				break;
			default:
				payGrade=0;
		}//decides pay based on answer
				
		System.out.println("Please enter your total hours worked.");
		hrs=input.nextInt();
		
		if(hrs<1)
			hrs=1;//no invalid hours
		
		if(lvl>=2){
			System.out.println("You qualify for an insurance plan;");
			insPlan1=insurance(input);
			if(insPlan1!=0){
				System.out.println("Please select your next option:");
				insPlan2=insurance(input);
				if(insPlan2!=0){
					System.out.println("Select your final option.");
					insPlan3=insurance(input);
				}
			}
			System.out.println("Thank you.");
		}//insurance plan selection(s) for level-2 and -3 workers
		
		if(lvl==3){
			System.out.println("As a level-3 employee, you can elect"+
				" to participate\nin a retirement plan at 3% of your "+
				"gross pay.\nWould you like to take part? (Y/N)");
			retirementSelection=input.next();
			switch(retirementSelection){
				case "Y":
				case "y":
					retirementPlan=true;
					break;
				case "N":
				case "n":
					retirementPlan=false;
					break;
				default:
					System.out.println("You've selected an invalid "+
						"option. The offer will be dropped.");
					break;
			}
		}//retirement plan option for level-3 workers
		fullWeekPay=payGrade*FULL_WORK_HOURS;//40-hour week pay
		
		if(hrs>40){
			ovtPay=(hrs-FULL_WORK_HOURS)*(payGrade*1.5);//overtime
			grossPay=fullWeekPay+ovtPay;
		}
		else
			grossPay=hrs*payGrade;//no overtime
		
		deduction = insPlan1+insPlan2+insPlan3;
		if(retirementPlan)
			deduction=deduction+(grossPay*.03);
		//*****
		netPay=grossPay-deduction;//FINAL PAY RATE
		//*****
		System.out.println("You've worked for "+hrs+" hours at a "+
			"rate of $"+payGrade+" per hour.");
		System.out.println("Regular pay for 40 hours of work is $"+
			fullWeekPay+", and your overtime pay is $"+ovtPay+".");
		System.out.println("The total of your personal regular and "
			+"overtime pay is $"+grossPay+".");
		System.out.println("The total of your itemized deductions "+
			"is $"+deduction+".");
		
		if(netPay<0)
			System.out.println("Error! Your net pay after deductions "
				+"would be "+netPay+". Please revise your input.");
		else{
			if(netPay<(grossPay*.40))
				System.out.println("!!Warning! Your net pay after "+
					"deductions is less than 40% of your gross pay.\n"+
					"You can either accept this or re-run the "+
					"application at your discretion.*****");
			System.out.println("After all deductions, your net pay "+
				"is $"+netPay+".");
		}
	}//main
	
	
	public static double insurance(Scanner x){
		double insRate;
		final double MEDICAL_INSURANCE_RATE=32.50;
		final double DENTAL_INSURANCE_RATE=20.00;
		final double DISABILITY_INSURANCE_RATE=10.00;
		
		System.out.println(
				"Option number.......Explanation.......Weekly cost\n"+
				"1.....................Medical...............32.50\n"+
				"2.....................Dental................20.00\n"+
				"3..............Long-term disability.........10.00\n"+
				"0......Finalize your insurance selection(s)");
		int choice=x.nextInt();
		
		if(choice>3 || choice<0)
			choice=0;
		
		switch(choice){
			case 1:
				insRate=MEDICAL_INSURANCE_RATE;
				break;
			case 2:
				insRate=DENTAL_INSURANCE_RATE;
				break;
			case 3:
				insRate=DISABILITY_INSURANCE_RATE;
				break;
			case 0:
			default:
				insRate=0.0;
				break;
		}
		
		return insRate;
	}
}