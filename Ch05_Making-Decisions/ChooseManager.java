import java.util.Scanner;

public class ChooseManager{
	public static void main(String[]args){
		
		Scanner input=new Scanner(System.in);
		
		int eventType;
		String chosenManager;
		final int PRIVATE_CODE=1;
		final int CORPORATE_CODE=2;
		final String PRIV_MANAGER="Dustin Britt";
		final String CORP_MANAGER="Carmen Lindsey";
		
		System.out.println("What type of event are you scheduling?");
		System.out.println("Enter "+PRIVATE_CODE+" for private, "+
			CORPORATE_CODE+" for corporate...");
		eventType=input.nextInt();
		
		if(eventType==PRIVATE_CODE)
			chosenManager=PRIV_MANAGER;
		else
			chosenManager=CORP_MANAGER;
		
		System.out.println("You entered "+eventType+".");
		System.out.println("Manager for this event will be "+chosenManager
			+".");
	}//main
}