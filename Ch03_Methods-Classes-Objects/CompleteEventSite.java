public class CompleteEventSite{
	
	private int siteNumber;
	private double hourlyFee;
	private String siteName;
	
	public CompleteEventSite(){
		siteNumber=999;
	}
	
	public int getSiteNumber(){
		return siteNumber;
	}
	
	public void setSiteNumber(int n){
		siteNumber=n;
	}
	
	public double getHourlyFee(){
		return hourlyFee;
	}
	
	public void setHourlyFee(double n){
		hourlyFee=n;
	}
	
	public String getSiteName(){
		return siteName;
	}
	
	public void setSiteName(String n){
		siteName=n;
	}
}