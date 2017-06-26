public class DemoAccounts{
	public static void main(String[]args){
		Checking a=new Checking(1312);
		Savings b=new Savings(4198, 7.5);
		
		a.setBalance(112.29);
		b.setBalance(9012);
		
		a.getAccountInfo();
		System.out.println();
		b.getAccountInfo();
	}
}