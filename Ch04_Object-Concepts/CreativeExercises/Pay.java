public class Pay{
	
	public static double computeNetPay(double hrs,double payRate,
		double withholdingRate){
		
		double grossPay=hrs*payRate;
		double withheld=grossPay*withholdingRate;
		double netPay=grossPay-withheld;
		
		return netPay;
	}
	public static double computeNetPay(double hrs,double payRate){
		double grossPay=hrs*payRate;
		double withheld=grossPay*.15;
		double netPay=grossPay-withheld;
		
		return netPay;
	}
	public static double computeNetPay(double hrs){
		double grossPay=hrs*5.85;
		double withheld=grossPay*.15;
		double netPay=grossPay-withheld;
		
		return netPay;
	}
	
	public static void main(String[]args){
		double hours,payPerHour,withholdingRate;
		hours=40;
		payPerHour=7.25;
		withholdingRate=.20;
		
		double first=computeNetPay(hours,payPerHour,withholdingRate);
		double second=computeNetPay(hours,payPerHour);
		double third=computeNetPay(hours);
		
		System.out.println(hours+" hours at $"+payPerHour+
			" per hour with a "+withholdingRate*100+
			"% withholding rate results in a net pay of "+first+".\n");
		System.out.println(hours+" hours at $"+payPerHour+
			" per hour with a 15% withholding rate results in a net pay of "
			+second+".\n");
		System.out.println(hours+" hours at $5.85 per hour with a "+
			"15% withholding rate results in a net pay of "+third+".");
	}
}