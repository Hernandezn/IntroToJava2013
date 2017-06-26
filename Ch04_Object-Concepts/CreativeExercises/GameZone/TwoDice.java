public class TwoDice{
	public static void main(String[]args){
		Die dice1=new Die();
		Die dice2=new Die();
		
		System.out.println("You rolled a "+dice1.getRoll()+" and a "+
			dice2.getRoll()+".");
	}
}