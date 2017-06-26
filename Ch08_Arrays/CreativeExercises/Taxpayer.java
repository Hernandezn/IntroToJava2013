public class Taxpayer{
	private int yearlyGross;
	private int ssn;
	
	public Taxpayer(int income, int social){
		yearlyGross=income;
		ssn=social;
	}
	
	public int getYearlyGross(){
		return yearlyGross;
	}
	public int getSSN(){
		return ssn;
	}
}