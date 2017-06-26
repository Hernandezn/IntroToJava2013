public class CheckingAccount{
	private int accNumber;
	private double balance;
	
	public CheckingAccount(int num,double bal){
		if(bal<200.00)
			balance=0.0;
		else
			balance=bal;
		
		accNumber=num;
	}
	
	public void displayData(){
		System.out.print("Account number "+accNumber+
			" has a balance of $"+balance+".");
		
		if(balance==0.0)
			System.out.println(" Your account balance has defaulted to $"+
				balance+" because it does not\nreach the minimum balance of "
				+"$200.00.\nPlease contact us to recover your remaining"+
				" funds and close/replace your bank account or to add an \n"+
				"appropriate bailout amount to your account.\n");
		else
			System.out.println("\n");
	}
}