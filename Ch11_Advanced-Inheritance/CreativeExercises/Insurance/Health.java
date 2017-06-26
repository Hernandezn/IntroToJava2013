public class Health extends Insurance{
	
	public Health(){
		super("health");
		setCost();
	}
	
	public void setCost(){
		monthlyRate=196;
	}
	public void display(){
		System.out.println("The monthly rate of "+getType()+" insurance is $"+
			getPrice()+".");
	}
}