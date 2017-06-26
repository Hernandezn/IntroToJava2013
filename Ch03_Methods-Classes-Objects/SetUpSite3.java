import java.util.Scanner;

public class SetUpSite3{
	
	public static void main(String[]args){
		final int FOUNDED_YEAR=1977;
		int currentYear;
		int age;
		Scanner input=new Scanner(System.in);
		EventSite oneSite=new EventSite();
		int siteNum;
		
		statementOfPhilosophy();
		System.out.print(
			"Enter the current year as a four-digit number: ");
		currentYear=input.nextInt();
		System.out.print("Enter the event site number: ");
		siteNum=input.nextInt();
		oneSite.setSiteNumber(siteNum);
		age=calculateAge(FOUNDED_YEAR,currentYear);
		System.out.println("Founded in "+FOUNDED_YEAR);
		System.out.println("Serving you for "+age+" years ");
		System.out.println("The site number is "+oneSite.getSiteNumber());
	}//Main
	
	public static void statementOfPhilosophy(){
		System.out.println("Event Handlers Incorporated is");
		System.out.println("dedicated to making your event");
		System.out.println("a most memorable one.");
	}//Statement of Philosophy
	
	public static int calculateAge(int originYear,int currDate){
		int years;
		years=currDate-originYear;
		return years;
	}//Age calculation
	
}//SetUpSite class