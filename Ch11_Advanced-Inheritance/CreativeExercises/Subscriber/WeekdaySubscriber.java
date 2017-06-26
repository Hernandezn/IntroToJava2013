public class WeekdaySubscriber extends NewspaperSubscriber{
	
	public WeekdaySubscriber(){
		setRate();
	}
	
	public void setRate(){
		subscriptionRate=3.50;
	}
	
	public String toString(){
		return("The weekday subscriber at address "+getAddress()+" has a weekly"+
			" subscription rate of $"+getRate()+".");
	}
}