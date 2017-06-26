public abstract class Division{
	protected String divisionName;
	protected int accNum;
	
	public abstract void display();
	
	public Division(String s, int num){
		accNum=num;
		divisionName=s;
	}
}