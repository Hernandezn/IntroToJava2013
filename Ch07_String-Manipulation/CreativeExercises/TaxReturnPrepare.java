import java.util.Scanner;

public class TaxReturnPrepare{
	public static void main(String[]args){
		TaxReturn taxInfo;
		
		Scanner x=new Scanner(System.in);
		String ssn="";
		StringBuilder lastName=new StringBuilder();
		StringBuilder firstName=new StringBuilder();
		String streetAddress;
		String city;
		int zipCode=0;
		int annualIncome;
		String maritalStatus="";
		
		boolean valid=true;
		int i;
		char c;
		int count=0;
		String data;
		String nameInput;
		
		while(count!=11){
			count=0;
			
			System.out.print("Please enter your social security number in "+
				"standard XXX-XX-XXXX format: ");
			ssn=x.nextLine();
			
			if(ssn.length()!=11)
				System.out.println("Invalid SSN.");
			for(i=0; i<ssn.length(); i++){
				c=ssn.charAt(i);
				if(((i>=0 && i<=2) || i==4 || i==5 || i>=7) &&
					(Character.isDigit(c)))
					
					count++;
				else{
					data=""+c;
					if(data.equals("-"))
						count++;
				}
			}
			
			if(count<11)
				System.out.println("Invalid SSN");
		}//Social security number input
		count=0;
		
		System.out.print("Enter your first and last name: ");
		nameInput=x.nextLine();
		
		for(i=0; i<nameInput.length(); i++){
			c=nameInput.charAt(i);
			if(i==0)
				c=Character.toUpperCase(c);
			if(c==' ' && valid)
				valid=false;
			if(valid)
				firstName.append(c);
			else if(Character.isLetter(c))
				lastName.append(c);
		}//builds first and last names
		
		System.out.print("Please enter your address: ");
		streetAddress=x.nextLine();//address
		
		System.out.print("Enter your city: ");
		city=x.nextLine();//city
		
		while(zipCode<10000 || zipCode>99999){
			System.out.print("Enter your five-digit ZIP code: ");
			zipCode=x.nextInt();
		}//ZIP code
		
		do{
		System.out.print("What is your annual income? ");
		annualIncome=(int)(Math.floor(x.nextDouble()));
		}while(annualIncome<0);//Income
		
		x.nextLine();
		
		do{
			System.out.print("Finally, your marital status... ");
			data=x.nextLine();
			
			c=data.charAt(0);
			data=""+c;
			if(data.equalsIgnoreCase("M")){
				maritalStatus=data;
				valid=true;
			}
			else if(data.equalsIgnoreCase("S")){
				maritalStatus=data;
				valid=true;
			}
			else
				System.out.println("The options are single or married.");
		}while(!valid);//Marital status
		
		taxInfo=new TaxReturn(ssn,lastName,firstName,streetAddress,city,
			zipCode,annualIncome,maritalStatus);
		
		taxInfo.displayTaxReturn();
	}
}