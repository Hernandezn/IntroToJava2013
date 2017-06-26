public class TaxReturn{
	private String ssn;
	private StringBuilder lastName;
	private StringBuilder firstName;
	private String streetAddress;
	private String city;
	private int zipCode;
	private int annualIncome;
	private String maritalStatus;
	private double taxLiability;
	private double taxAmt;
	
	public TaxReturn(String social, StringBuilder last, StringBuilder
		first, String address, String city, int zip, int income,
		String married){
		
		ssn=social;
		lastName=last;
		firstName=first;
		streetAddress=address;
		this.city=city;
		zipCode=zip;
		annualIncome=income;
		maritalStatus=married;
		
		if(income>50000){
			if(married.equalsIgnoreCase("M"))
				taxLiability=.28;
			else if(married.equalsIgnoreCase("S"))
				taxLiability=.30;
		}
		else if(income>20000){
			if(married.equalsIgnoreCase("M"))
				taxLiability=.20;
			else if(married.equalsIgnoreCase("S"))
				taxLiability=.22;
		}
		else if(income>0){
			if(married.equalsIgnoreCase("M"))
				taxLiability=.14;
			else if(married.equalsIgnoreCase("S"))
				taxLiability=.15;
		}
		
		taxAmt=(double)income*taxLiability;
	}
	
	public void displayTaxReturn(){
		
		System.out.println("\nSSN: "+ssn+"\nName: "+lastName+", "+firstName
			+"\nAddress: "+streetAddress+"\nCity: "+city+"\nZip code: "+
			zipCode+"\nAnnual income: $"+annualIncome+"\nMarital status: "+
			maritalStatus+"\nTax percentage: "+(taxLiability*100)+
			"%\nTax amount: $"+taxAmt);
	}
}