import java.util.Scanner;
import java.util.ArrayList;

public class Subscribers{
	public static void main(String[]args){
		ArrayList<NewspaperSubscriber> sub=new ArrayList<NewspaperSubscriber>();
		NewspaperSubscriber temp;
		Scanner input=new Scanner(System.in);
		boolean b=false;
		boolean valid;
		String address;
		String type;
		int x;
		
		do{
			temp=new WeekendSubscriber();
			
			do{
				valid=true;
				
				System.out.println("Please enter a street address for the "+
					"subscription:");
				address=input.nextLine();
				for(x=0; x<sub.size(); x++)
					if(sub.get(x).getAddress().equalsIgnoreCase(address)){
						valid=false;
						x=sub.size();
					}
				
				if(!valid)
					if(sub.size()!=0)
						System.out.println("That address already has a subscription.");
					else
						valid=true;
			}while(!valid);
			valid=false;
			
			do{
				System.out.println("Would you like a weekday, weekend, or seven-day "+
					"subscription?");
				type=input.nextLine();
				
				if(type.contains("weekend") || type.contains("Weekend")){
					temp=new WeekendSubscriber();
					valid=true;
				}
				else if(type.contains("weekday") || type.contains("Weekday")){
					temp=new WeekdaySubscriber();
					valid=true;
				}
				else if(type.contains("seven") || type.contains("Seven")){
					temp=new SevenDaySubscriber();
					valid=true;
				}
			}while(!valid);
			valid=false;
			temp.setAddress(address);
			
			do{
				System.out.println("Would you like to enter another subscription?");
				address=Character.toUpperCase(input.nextLine().charAt(0))+"";
				
				if(address.equals("Y"))
					valid=true;
				else if(address.equals("N")){
					valid=true;
					b=true;
				}
			}while(!valid);
			
			sub.add(temp);
		}while(!b);
		
		for(x=0; x<sub.size(); x++)
			System.out.println(sub.get(x).toString());
	}
}