import javax.swing.*;

public class DinnerParty extends Party{
	private int dinnerChoice;
	final int BEEF_CHOICE=1;
	final int CHICKEN_CHOICE=2;
	
	public void displayDinnerChoice(){
		if(dinnerChoice==BEEF_CHOICE)
			JOptionPane.showMessageDialog(null,"The dinner choice is beef.");
		else
			JOptionPane.showMessageDialog(null,"The dinner choice is chicken.");
	}
	
	public void inputDinnerChoice(){
		String choice;
		choice=JOptionPane.showInputDialog(null,"Enter your dinner choice;\n "+
			BEEF_CHOICE+" for beef or "+CHICKEN_CHOICE+" for chicken.");
		dinnerChoice=Integer.parseInt(choice);
	}
}