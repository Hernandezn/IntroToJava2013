public class Service{
	private String svcDescription;
	private double price;
	private int timeInMinutes;
	
	public Service(String service, double price, int minutes){
		svcDescription=service;
		this.price=price;
		timeInMinutes=minutes;
	}
	
	public String getSvc(){
		return svcDescription;
	}
	public double getPrice(){
		return price;
	}
	public int getTime(){
		return timeInMinutes;
	}
}