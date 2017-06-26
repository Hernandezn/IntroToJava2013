public abstract class NewspaperSubscriber{
	protected String address;
	protected double subscriptionRate;
	
	public abstract void setRate();
	public abstract String toString();
	
	public double getRate(){
		return subscriptionRate;
	}
	
	public void setAddress(String s){
		address=s;
	}
	public String getAddress(){
		return address;
	}
	
	public boolean equals(NewspaperSubscriber other){
		boolean b;
		
		if(this.getAddress().equalsIgnoreCase(other.getAddress()))
			b=true;
		else
			b=false;
		
		return b;
	}
}