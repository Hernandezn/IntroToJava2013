import java.util.Scanner;

public class DeliveryCreator{
	public static void main(String[]args){
		int year;
		int deliveryNumber;
		double pkgWeight;
		int distanceCode;
		Scanner input=new Scanner(System.in);
		Delivery data;
		
		do{
			System.out.print("Please enter a valid year (between "+
				"2001 and 2025, inclusive): ");
			year=input.nextInt();
		}while(year<2001 || year>2025);
		//^year entry
		do{
			System.out.print("What is your delivery number? ");
			deliveryNumber=input.nextInt();
			
			if(deliveryNumber<1 || deliveryNumber>9999)
				System.out.println("Invalid delivery number! Valid "+
					"numbers fall between 1 and 9999, inclusive.");
		}while(deliveryNumber<1 || deliveryNumber>9999);
		//^delivery number entry
		do{
			System.out.print("Please enter your package weight, "+
				"in pounds: ");
			pkgWeight=input.nextDouble();
			
			if(pkgWeight<.10 || pkgWeight>100)
				System.out.println("We don't service packages of that"+
					" weight. Only submit a package that is .1 "+
					"to 100 pounds.");
		}while(pkgWeight<.10 || pkgWeight>100);
		//^package weight
		do{
			System.out.print("Please enter a delivery distance code."+
				" Type 1 for short distance or 2 for long distance: ");
			distanceCode=input.nextInt();
			
			if(distanceCode!=1 && distanceCode!=2)
				System.out.println("Invalid.");
		}while(distanceCode!=1 && distanceCode!=2);
		//^delivery distance code
		
		data=new Delivery(
			year,deliveryNumber,distanceCode,pkgWeight);
		System.out.println();
		
		data.displayDelivery();
	}
}