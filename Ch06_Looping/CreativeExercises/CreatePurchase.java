import java.util.Scanner;

public class CreatePurchase{
	public static void main(String[]args){
		Scanner input=new Scanner(System.in);
		Purchase goods=new Purchase();
		int invoice;
		double price;
		
		do{
			System.out.print("Please enter a valid invoice number: ");
			invoice=input.nextInt();
		
			if(invoice>=8000 || invoice<=1000)
				System.out.println("The only valid invoice numbers "+
					"are those between 1000 and 8000.");
		}while(invoice>=8000 || invoice<=1000);
		
		do{
			System.out.print("Please enter a valid sales price: ");
			price=input.nextDouble();
			
			if(price<0)
				System.out.println("Valid sales prices are "+
					"non-negative ones.");
		}while(price<0);
		
		goods.setInvoiceNum(invoice);
		goods.setSaleAmt(price);
		
		goods.displayPurchase();
	}
}