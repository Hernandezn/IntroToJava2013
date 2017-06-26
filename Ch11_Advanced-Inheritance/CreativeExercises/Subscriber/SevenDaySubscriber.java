public class SevenDaySubscriber extends NewspaperSubscriber{
	
	public SevenDaySubscriber(){
		setRate();
	}
	
	public void setRate(){
		subscriptionRate=4.50;
	}
	
	public String toString(){
		return("The seven-day subscriber at address "+getAddress()+" has a weekly"+
			" subscription rate of $"+getRate()+".");
	}
}