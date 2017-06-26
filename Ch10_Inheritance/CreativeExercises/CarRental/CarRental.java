public class CarRental{
	protected String name;
	protected int zip;
	protected String size;
	protected double dailyFee;
	protected int days;
	protected double totalFee;
	
	public CarRental(String customer, int zipCode, String type, int duration){
		name=customer;
		zip=zipCode;
		days=duration;
		
		if(type.equalsIgnoreCase("eco")){
			dailyFee=29.99;
			size="economy";
		}
		else if(type.equalsIgnoreCase("mid")){
			dailyFee=38.99;
			size="midsize";
		}
		else if(type.equalsIgnoreCase("ful")){
			dailyFee=43.50;
			size="full size";
		}
		
		totalFee=dailyFee*days;
	}
	
	public void display(){
		System.out.println("Customer "+name+" at zip code "+zip+" has ordered a(n) "+
			size+" car rental for "+days+" days.\nThe daily fee is $"+dailyFee+
			" per day, making the total fee $"+totalFee+".");
	}
}