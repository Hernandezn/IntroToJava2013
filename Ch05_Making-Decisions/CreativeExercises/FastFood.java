import java.util.Scanner;

public class FastFood{
	public static void main(String[]args){
		int choice1=0;
		int choice2=0;
		int choice3=0;
		double price1=0;
		double price2=0;
		double price3=0;
		double totalPrice;
		
		Scanner input=new Scanner(System.in);
		
		choice1=select(input);
		price1=priceAssign(choice1,price1);
		
		if(price1!=0){
			choice2=select(input);
			price2=priceAssign(choice2,price2);
		}
		if(price2!=0 && price1!=0){
			choice3=select(input);
			price3=priceAssign(choice3,price3);
		}
		
		totalPrice=price1+price2+price3;
		
		System.out.println("The price of your order is $"+totalPrice+".");
	}
	
	public static int select(Scanner x){
		int selection;
		
		System.out.println(
			"(1) Cheeseburger..........$4.99\n"+
			"(2) Pepsi.................$2.00\n"+
			"(3) Chips.................$0.75");
		System.out.println("Enter the number corresponding to the item"+
			" you desire or use 0 to finalize your order so far and quit.");
		selection=x.nextInt();
		
		return selection;
	}
	public static double priceAssign(int choice,double price){
		double BURGER_PRICE=4.99;
		double PEPSI_PRICE=2.00;
		double CHIPS_PRICE=.75;
		
		switch(choice){
			case 1:
				price=price+BURGER_PRICE;
				break;
			case 2:
				price=price+PEPSI_PRICE;
				break;
			case 3:
				price=price+CHIPS_PRICE;
				break;
			default:
				price=0;
		}
		
		return price;
	}
}