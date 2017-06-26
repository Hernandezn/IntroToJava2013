public class HouseholdTest{
	public static void main(String[]args){
		Household sample=new Household();
		
		System.out.println("The default household values are a $"+
			sample.getAnnualIncome()+" annual income and an occupancy of "+
			sample.getOccupants()+" people.");
		
		sample.setAnnualIncome(120000);
		sample.setOccupants(2);
		
		System.out.println("More realistic household values would be a $"+
			sample.getAnnualIncome()+" annual income and an occupancy of "+
			sample.getOccupants()+" people.");
		
		Household data=new Household(5);
		
		System.out.println("The second test default is a $"+
			data.getAnnualIncome()+" annual income with an occupancy of "+
			data.getOccupants()+" people.");
		
		Household test=new Household(4,100000);
		
		System.out.println("A household of undergraduates may have a $"+
			test.getAnnualIncome()+" annual income with an occupancy of "+
			test.getOccupants()+" people.");
	}
}