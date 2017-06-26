public class Commission2{
	
	public static void computeCommission(double sales,double rate){
		double commCalc=sales*rate;
		
		System.out.println("At a rate of "+rate*100+
			"%, the total commission for your $"+sales+" purchase is $"
			+commCalc+".");
	}
	public static void computeCommission(double sales,int rate){
		double rateCalc=rate/100.0;
		double commCalc=sales*rateCalc;
		
		System.out.println("At a rate of "+rate+
			"%, the total commission for your $"+sales+" purchase is $"+
			commCalc+".");
	}
	public static void computeCommission(double sales){
		double commCalc=sales*.075;
		
		System.out.println("At the default rate of 7.5%,"+
			" the total commission for your $"+sales+" purchase is $"+
			commCalc+".");
	}
	
	public static void main(String[]args){
		computeCommission(120,10);
		System.out.println();
		computeCommission(200.00,.25);
		System.out.println();
		computeCommission(500);
	}
}