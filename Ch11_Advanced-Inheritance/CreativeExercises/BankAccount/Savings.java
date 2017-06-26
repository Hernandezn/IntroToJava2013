public class Savings extends Account{
	private double interestRate;
	
	public Savings(int num, double rate){
		super(num);
		interestRate=rate;
	}
	
	public void getAccountInfo(){
		System.out.println("Savings Account Information:\nAccount Number > "+
			getAccountNumber()+"\nBalance > $"+getBalance()+"\nInterest Rate > "+
			getInterest()+"%");
	}
	
	public int getAccountNumber(){
		return accNumber;
	}
	public double getBalance(){
		return balance;
	}
	public double getInterest(){
		return interestRate;
	}
}