import javax.swing.JOptionPane;

public class RandomGuess2{
	public static void main(String[]args){
		int answer=1+(int)(Math.random()*10);
		int guess;
		
		guess=Integer.parseInt(JOptionPane.showInputDialog(null,
			"Guess a number between 1 and 10."));
		
		if(guess<answer)
			JOptionPane.showMessageDialog(null,"Too low! The right "+
				"number was "+answer+".");
		else
			if(guess>answer)
				JOptionPane.showMessageDialog(null,"That's too high."+
					" The number was "+answer+".");
			else
				JOptionPane.showMessageDialog(null,"That's right!");
	}
}