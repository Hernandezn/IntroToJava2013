public class Event{
	private int typeOfEvent;
	private double rate;
	private String manager;
	
	public int getType(){
		return typeOfEvent;
	}
	public double getRate(){
		return rate;
	}
	public String getManager(){
		return manager;
	}
	
	public void setType(int eventType){
		typeOfEvent=eventType;
	}
	public void setRate(double eventRate){
		rate=eventRate;
	}
	public void setManager(String managerName){
		manager=managerName;
	}
}