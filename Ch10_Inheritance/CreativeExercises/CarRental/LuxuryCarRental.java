import java.util.Scanner;

public class LuxuryCarRental extends CarRental{
	private boolean chauffeur;
	private Scanner input=new Scanner(System.in);
	private int num=0;
	
	public LuxuryCarRental(String customer, int zipCode, String type, int duration){
		super(customer, zipCode, type, duration);
		char entry;
		boolean b=false;
		
		dailyFee=79.99;
		totalFee=dailyFee*days;
		
		do{
			System.out.print("Would you like a chauffeur for an extra $200 per day? ");
			entry=Character.toUpperCase(input.nextLine().charAt(0));
			
			if(entry=='Y'){
				b=true;
				chauffeur=true;
			}
			else if(entry=='N'){
				b=true;
				chauffeur=false;
			}
		}while(!b);
		
		if(chauffeur){
			totalFee+=days*200;
			num=200;
		}
	}
	
	public void display(){
		System.out.println("Customer "+name+" at zip code "+zip+" has ordered "+
			"a luxury "+size+" car rental for "+days+" days.\nThe daily fee is $"+
			dailyFee+" per day, and the chauffeur selection adds $"+num+
			" per day,\nmaking the total fee $"+totalFee+".");
	}
}