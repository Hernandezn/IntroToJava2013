import java.util.Scanner;

public class UseInsurance{
	public static void main(String[]args){
		Insurance selection=new Health();
		Scanner input=new Scanner(System.in);
		String entry;
		boolean valid=false;
		
		do{
			System.out.println("Would you like health or life insurance displayed?");
			entry=input.nextLine();
			
			if(entry.startsWith("Health") || entry.startsWith("health")){
				selection=new Health();
				valid=true;
			}
			else if(entry.startsWith("Life") || entry.startsWith("life")){
				selection=new Life();
				valid=true;
			}
		}while(!valid);
		
		selection.display();
	}
}