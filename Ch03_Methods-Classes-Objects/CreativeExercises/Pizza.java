public class Pizza{
	private String toppings;
	private int size;
	private double price;
	
	public Pizza(){
		toppings="cheese";
	}
	
	public void setToppings(String top){
		toppings=top;
	}	
	public String getToppings(){
		return toppings;
	}
	
	public void setSize(int inches){
		size=inches;
	}
	public int getSize(){
		return size;
	}
		
	public void setPrice(double moneyAmt){
		price=moneyAmt;
	}
	public double getPrice(){
		return price;
	}
}