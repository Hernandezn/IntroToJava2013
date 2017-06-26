public abstract class Account{
	protected int accNumber;
	protected double balance;
	
	public abstract int getAccountNumber();
	public abstract double getBalance();
	public abstract void getAccountInfo();
	
	public Account(int num){
		accNumber=num;
		balance=0;
	}
	
	public void setBalance(double num){
		balance=num;
	}
}