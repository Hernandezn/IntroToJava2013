public class FiveDice{
	public static void main(String[]args){
		Die playRoll1=new Die();
		Die playRoll2=new Die();
		Die playRoll3=new Die();
		Die playRoll4=new Die();
		Die playRoll5=new Die();
		
		Die compRoll1=new Die();
		Die compRoll2=new Die();
		Die compRoll3=new Die();
		Die compRoll4=new Die();
		Die compRoll5=new Die();
		
		System.out.println("Your rolls:\n"+playRoll1.getRoll()+" "+
			playRoll2.getRoll()+" "+playRoll3.getRoll()+" "+
			playRoll4.getRoll()+" "+playRoll5.getRoll()+"\nYour opponent's "
			+"rolls:\n"+compRoll1.getRoll()+" "+compRoll2.getRoll()+" "+
			compRoll3.getRoll()+" "+compRoll4.getRoll()+" "+
			compRoll5.getRoll());
	}
}