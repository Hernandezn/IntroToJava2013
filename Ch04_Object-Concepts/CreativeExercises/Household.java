public class Household{
	private int occupants;
	private int annualIncome;
	
	public Household(){
		this(1,0);
	}
	public Household(int occ){
		this(occ,0);
	}
	public Household(int occ,int income){
		occupants=occ;
		annualIncome=income;
	}
	
	public void setOccupants(int num){
		occupants=num;
	}
	public int getOccupants(){
		return occupants;
	}
	
	public void setAnnualIncome(int num){
		annualIncome=num;
	}
	public int getAnnualIncome(){
		return annualIncome;
	}
}