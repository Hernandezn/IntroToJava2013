public abstract class Loan implements LoanConstants{
	protected int loanNumber;
	protected String customer;
	protected double loanAmt;
	protected double interestRate;
	protected int years;
	protected double totalOwed;
	
	public Loan(int num, String name, double amt, int term){
		loanNumber=num;
		customer=name;
		
		if(amt>MAX_LOAN)
			loanAmt=MAX_LOAN;
		else
			loanAmt=amt;
		
		if(term==SHORT_TERM)
			years=SHORT_TERM;
		else if(term==MEDIUM_TERM)
			years=MEDIUM_TERM;
		else if(term==LONG_TERM)
			years=LONG_TERM;
		else
			years=SHORT_TERM;
	}
	
	public String toString(){
		return("Loan number: "+loanNumber+"\nCustomer: "+customer+"\nLoan amount: $"+
			loanAmt+"\nInterest rate: "+interestRate+"%\nDuration: "+years+
			" year(s)\nTotal Owed: $"+totalOwed);
	}
}