public class Purchase{
	private int invoiceNum;
	private double saleAmt;
	private double salesTax;
	
	public void setInvoiceNum(int num){
		invoiceNum=num;
	}
	public void setSaleAmt(double num){
		saleAmt=num;
		salesTax=num*.05;
	}
	public void displayPurchase(){
		System.out.println("Invoice number "+invoiceNum+" has a "+
			"sale price of $"+saleAmt+" and a sales tax of $"+
			salesTax+".");
	}
}