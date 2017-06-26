public class AccountArray{
	public static void main(String[]args){
		Account[]accounts={new Checking(1345), new Savings(6453, 12.5), new
			Savings(4312, 6.25), new Savings(4532, 9), new Checking(2346), new
			Savings(7563, 5.5), new Checking(2534), new Checking(4235), new
			Checking(4562), new Savings(2599, 8.5)};
		int x;
		
		for(x=0; x<accounts.length; x++)
			accounts[x].setBalance((int)(Math.random()*500000)/100.0);
		
		for(x=0; x<accounts.length; x++){
			accounts[x].getAccountInfo();
			System.out.println();
		}
	}
}