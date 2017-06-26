import javax.swing.JOptionPane;

public class RandomGuess3{
	public static void main(String[]args){
		int answer=1+(int)(Math.random()*10);
		int guess;
		int count=0;
		
		do{
			guess=Integer.parseInt(JOptionPane.showInputDialog(null,
				"Guess a number between 1 and 10."));
			
			if(guess<answer)
				JOptionPane.showMessageDialog(null,"Too low! Try "+
					"again.");
			
			if(guess>answer)
				JOptionPane.showMessageDialog(null,"That's too high."+
					" Take another guess.");
			
			count++;
		}while(guess!=answer);
		
		JOptionPane.showMessageDialog(null,"That's right. The "+
			"number was "+answer+", requiring "+count+" attempt(s) "+
			"to guess correctly.");
	}
}