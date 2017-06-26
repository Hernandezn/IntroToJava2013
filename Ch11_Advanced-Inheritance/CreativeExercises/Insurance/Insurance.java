public abstract class Insurance{
	protected String type;
	protected double monthlyRate;
	
	public abstract void setCost();
	public abstract void display();
	
	public Insurance(String s){
		type=s;
	}
	
	public String getType(){
		return type;
	}
	public double getPrice(){
		return monthlyRate;
	}
}