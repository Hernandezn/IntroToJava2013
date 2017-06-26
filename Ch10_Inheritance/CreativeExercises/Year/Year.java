public class Year{
	protected int numOfDays;
	
	public Year(){
		numOfDays=365;
	}
	
	public int getDays(){
		System.out.println("There are "+numOfDays+" days in this year.");
		return numOfDays;
	}
}