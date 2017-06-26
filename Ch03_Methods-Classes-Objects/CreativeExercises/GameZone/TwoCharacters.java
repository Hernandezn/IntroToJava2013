import javax.swing.JOptionPane;

public class TwoCharacters{
	public static void main(String[]args){
		MyCharacter mook=new MyCharacter();
		MyCharacter wisp=new MyCharacter();
		String attribute;
		double pwr;
		int hp;
		
		attribute=JOptionPane.showInputDialog(null,
			"What is the mook enemy's attribute?","Attribute input",
			JOptionPane.QUESTION_MESSAGE);
		
		mook.setAttribute(attribute);
		
		pwr=rewardRoll();
		hp=healthRoll();
		
		mook.setPowerPayout(pwr);
		mook.setHealth(hp);
		
		attribute=JOptionPane.showInputDialog(null,
			"What is the wisp enemy's attribute?","Attribute input",
			JOptionPane.QUESTION_MESSAGE);
		
		wisp.setAttribute(attribute);
		
		pwr=rewardRoll();
		hp=healthRoll();
		
		wisp.setPowerPayout(pwr);
		wisp.setHealth(hp);
		
		JOptionPane.showMessageDialog(null,"The mook's attribute is "+
			mook.getAttribute()+", its health is "+mook.getHealth()+
			", and it rewards "+mook.getPowerPayout()+
			" power upon death.\n\nThe wisp's attribute is "+
			wisp.getAttribute()+", its health is "+wisp.getHealth()+
			", and it rewards "+wisp.getPowerPayout()+" power upon death.");
	}
	
	public static int healthRoll(){
		int health=Integer.parseInt(JOptionPane.showInputDialog(null,
			"Please enter its health value: ","Health input",
			JOptionPane.INFORMATION_MESSAGE));
			
		return health;
	}
	
	public static double rewardRoll(){
		double reward=Math.round(Math.random()*100D);
		double roundedRwd=reward/100D;
		
		return roundedRwd;
	}
}