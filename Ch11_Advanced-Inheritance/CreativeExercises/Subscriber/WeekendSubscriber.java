public class WeekendSubscriber extends NewspaperSubscriber{
	
	public WeekendSubscriber(){
		setRate();
	}
	
	public void setRate(){
		subscriptionRate=2.00;
	}
	
	public String toString(){
		return("The weekend subscriber at address "+getAddress()+" has a weekly"+
			" subscription rate of $"+getRate()+".");
	}
}