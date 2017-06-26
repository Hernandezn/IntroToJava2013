import java.util.Scanner;

public class TestInvoice{
	public static void main(String[]args){
		Invoice first=new Invoice();
		Invoice second=new Invoice();
		Invoice third=new Invoice();
		
		first=setData();
		System.out.println();
		second=setData();
		System.out.println();
		third=setData();
		
		System.out.println();
		
		first.displayLine();
		System.out.println();
		second.displayLine();
		System.out.println();
		third.displayLine();
	}
	
	public static Invoice setData(){
		Invoice data=new Invoice();
		Scanner input=new Scanner(System.in);
		
		System.out.print("Please enter the item number: ");
		data.setItemNum(input.nextInt());
		
		input.nextLine();//input buffer
		
		System.out.print("What is the item name? ");
		data.setItemName(input.nextLine());
		
		System.out.print("Enter the quantity desired: ");
		data.setQuantity(input.nextInt());
		
		System.out.print("Enter the price of the item: ");
		data.setPrice(input.nextDouble());
		
		return data;
	}
}