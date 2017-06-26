public class PersonalLoan extends Loan{
	
	public PersonalLoan(double interest, String name, int loanNum, double amt,
		int term){
		super(loanNum, name, amt, term);
		
		interestRate=interest+2.0;
		
		double temp=loanAmt;
		
		for(int x=0; x<years; x++)
			temp=((interestRate/100.0)*temp)+temp;
		
		totalOwed=temp;
	}
}