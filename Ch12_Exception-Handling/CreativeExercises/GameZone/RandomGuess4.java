import javax.swing.JOptionPane;

public class RandomGuess4{
	public static void main(String[]args){
		int answer=1+(int)(Math.random()*10);
		int guess=0;
		String entry;
		int count=0;
		boolean b;
		
		do{
			b=true;
			
			entry=JOptionPane.showInputDialog(null,"Guess a number "+
				"from 1 to 10.");
			try{
				guess=Integer.parseInt(entry);
			}
			catch(NumberFormatException error){
				JOptionPane.showMessageDialog(null,"Your guess \""+entry+"\" isn't a "+
					"valid (numeric) guess. Try again.");
				b=false;
			}
			
			if(b){
				if(guess<answer)
					JOptionPane.showMessageDialog(null,"Too low! Try again.");
				
				if(guess>answer)
					JOptionPane.showMessageDialog(null,"That's too high. Take another "+
						"guess.");
				count++;
			}
		}while(guess!=answer);
		
		JOptionPane.showMessageDialog(null,"That's right. The "+
			"number was "+answer+", requiring "+count+" attempt(s) "+
			"to guess correctly.");
	}
}