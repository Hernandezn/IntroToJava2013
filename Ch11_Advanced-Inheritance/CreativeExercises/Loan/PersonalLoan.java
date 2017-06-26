public abstract class PersonalLoan{
	protected String type;
	protected double monthlyRate;
	
	public abstract String toString();
	
	public void setType(String s){
		type=s;
	}
	public String getType(){
		return type;
	}
	
	public void setRate(double num){
		monthlyRate=num;
	}
	public double getRate(){
		return monthlyRate;
	}
}