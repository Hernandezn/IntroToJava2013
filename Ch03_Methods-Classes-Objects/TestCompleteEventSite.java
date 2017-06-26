public class TestCompleteEventSite{
	
	public static void main(String[]args){
		CompleteEventSite oneSite=new CompleteEventSite();
		double fee=115.50;
		String ballRoom="Grand Ballroom";
		oneSite.setHourlyFee(fee);
		oneSite.setSiteName(ballRoom);
		
		System.out.println("Site number: "+oneSite.getSiteNumber()+
			"\nHourly fee: "+oneSite.getHourlyFee()+"\nSite name: "+
			oneSite.getSiteName());
	}
}