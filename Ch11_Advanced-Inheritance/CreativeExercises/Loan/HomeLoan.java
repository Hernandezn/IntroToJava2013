import java.util.Scanner;

public class HomeLoan extends PersonalLoan{
	private Scanner input=new Scanner(System.in);
	
	public HomeLoan(){
		setType("home");
		
		boolean b=false;
		String data;
		
		do{
			System.out.println("Is this your first home loan?");
			String entry=input.nextLine().charAt(0)+"";
			
			if(entry.equalsIgnoreCase("Y")){
				setRate(93.75);
				b=true;
			}
			else if(entry.equalsIgnoreCase("N")){
				setRate(150);
				b=true;
			}
		}while(!b);
	}
	
	public String toString(){
		return("The loan is a "+getType()+" loan at a monthly rate of $"+getRate()+
			".");
	}
}