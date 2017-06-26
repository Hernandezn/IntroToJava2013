public class Life extends Insurance{
	
	public Life(){
		super("life");
		setCost();
	}
	
	public void setCost(){
		monthlyRate=36;
	}
	public void display(){
		System.out.println("The monthly rate of "+getType()+" insurance is $"+
			getPrice()+".");
	}
}