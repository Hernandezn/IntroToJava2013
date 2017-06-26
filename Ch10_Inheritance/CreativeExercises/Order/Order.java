import java.util.Scanner;

public class Order{
	private Scanner input=new Scanner(System.in);
	private String customerName;
	private int customerNumber;
	private int quantity;
	private double unitPrice;
	protected double totalPrice;
	
	public void setName(){
		System.out.print("Enter the customer name > ");
		customerName=input.nextLine();
	}
	public String getName(){
		return customerName;
	}
	
	public void setNumber(){
		System.out.print("Enter the customer's number > ");
		customerNumber=input.nextInt();
	}
	public int getNumber(){
		return customerNumber;
	}
	
	public void setQuantity(){
		System.out.print("Enter the quantity ordered > ");
		quantity=input.nextInt();
	}
	public int getQuantity(){
		return quantity;
	}
	
	public void setUnitPrice(){
		System.out.print("Enter the unit price > ");
		unitPrice=input.nextDouble();
	}
	public double getUnitPrice(){
		return unitPrice;
	}
	
	public double computePrice(){
		totalPrice=unitPrice*quantity;
		return totalPrice;
	}
	public double getPrice(){
		return totalPrice;
	}
	
	public void display(){
		System.out.println("Customer "+customerNumber+", "+customerName+
			", has ordered "+quantity+" items at a price of $"+unitPrice+
			" each, totalling $"+totalPrice+".");
	}
}