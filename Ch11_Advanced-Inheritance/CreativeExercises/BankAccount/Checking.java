public class Checking extends Account{
	
	public Checking(int num){
		super(num);
	}
	
	public void getAccountInfo(){
		System.out.println("Checking Account Information:\nAccount Number > "+
			getAccountNumber()+"\nBalance > $"+getBalance());
	}
	
	public int getAccountNumber(){
		return accNumber;
	}
	public double getBalance(){
		return balance;
	}
}