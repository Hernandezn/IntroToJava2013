import javax.swing.JOptionPane;

public class TwoDice3{
	public static void main(String[]args){
		Die myDice1=new Die();
		Die myDice2=new Die();
		int count;
		int guess;
		int answer;
		boolean win=false;
		
		JOptionPane.showMessageDialog(null,"This program rolls two "+
			"die for you.\nYou're going to try and guess what number"+
			" (from 2 to 12) you'll roll.\nAfter each guess, it will"+
			" reroll, and you'll try to guess that roll.\nIf you "+
			"can guess a correct number before your three rolls are "+
			"up, you win!","RULES",JOptionPane.INFORMATION_MESSAGE);
		
		for(count=1; count<=3; count++){
			guess=Integer.parseInt(JOptionPane.showInputDialog(null,
				"Roll "+count+"! Take a guess: what will you roll?"));
			myDice1.reroll();
			myDice2.reroll();
			
			answer=myDice1.getRoll()+myDice2.getRoll();
			
			if(guess!=answer)
				JOptionPane.showMessageDialog(null,"Nope! You guessed"+
					" "+guess+", and you rolled "+answer+".");
			else{
				win=true;
				count=3;
			}
		}
		if(!(win))
			JOptionPane.showMessageDialog(null,"Looks like you lost"+
				" this game of dice. Try again.");
		else
			JOptionPane.showMessageDialog(null,"You won!");
		
	}
}