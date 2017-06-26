public class DomesticDivision extends Division{
	private String state;
	
	public DomesticDivision(String name, String place, int num){
		super(name, num);
		state=place;
	}
	
	public void display(){
		System.out.println("Domestic division "+divisionName+" deals from its base "+
			"in "+state+" and has account number "+accNum+".");
	}
}