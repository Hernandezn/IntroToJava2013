public class TwoDice2{
	public static void main(String[]args){
		Die dice1=new Die();
		Die dice2=new Die();
		
		System.out.println("You rolled a "+dice1.getRoll()+" and a "+
			dice2.getRoll()+".");
		
		if(dice1.getRoll()!=dice2.getRoll()){
			if(dice1.getRoll()>dice2.getRoll())
				System.out.println("The first dice has a higher "+
					"value.");
			if(dice1.getRoll()<dice2.getRoll())
				System.out.println("The second dice has a higher "+
					"value.");
		}
		else
			System.out.println("The two die share the same value.");
	}
}