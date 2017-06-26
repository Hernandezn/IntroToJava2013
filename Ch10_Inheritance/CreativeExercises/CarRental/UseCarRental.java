import java.util.Scanner;

public class UseCarRental{
	public static void main(String[]args){
		String name;
		int zip;
		String size;
		int days;
		boolean luxury=false;
		Scanner input=new Scanner(System.in);
		boolean b=false;
		char c;
		
		System.out.print("Please enter your name > ");
		name=input.nextLine();
		
		System.out.print("Please enter your simple ZIP code (#####) > ");
		zip=input.nextInt();
		input.nextLine();
		
		do{
			System.out.print("Enter a car size (economy, midsize, or full size): ");
			size=input.nextLine();
			size=size.charAt(0)+""+size.charAt(1)+""+size.charAt(2);
			
			if(size.equalsIgnoreCase("eco") || size.equalsIgnoreCase("mid") ||
				size.equalsIgnoreCase("ful"))
				b=true;
		}while(!b);//takes valid sizes only
		b=false;
		
		System.out.print("How many days would you like to rent for? ");
		days=input.nextInt();
		input.nextLine();
		
		do{
			System.out.print("Would you like to upgrade to a luxury car? ");
			c=Character.toUpperCase(input.nextLine().charAt(0));
			
			if(c=='Y'){
				luxury=true;
				b=true;
			}
			else if(c=='N'){
				luxury=false;
				b=true;
			}
		}while(!b);
		
		System.out.println();
		
		if(luxury){
			LuxuryCarRental car=new LuxuryCarRental(name, zip, size, days);
			car.display();
		}
		else{
			CarRental car=new CarRental(name, zip, size, days);
			car.display();
		}
	}
}