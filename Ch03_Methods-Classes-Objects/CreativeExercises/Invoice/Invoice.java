public class Invoice{
	private int itemNum;
	private String itemName;
	private int quantity;
	private double price;
	private double totalCost;
	
	private void setTotal(){
		totalCost=price*(double)quantity;
	}
	public void setItemNum(int num){
		itemNum=num;
	}
	public void setItemName(String data){
		itemName=data;
	}
	public void setQuantity(int num){
		quantity=num;
		setTotal();
	}
	public void setPrice(double num){
		price=num;
		setTotal();
	}
	
	public void displayLine(){
		System.out.println("The item number for "+itemName+" is "+itemNum+
			".\nThe request is for "+quantity+" of the item at $"+price+
			" apiece.\nThe total price will be $"+totalCost+".");
	}
}