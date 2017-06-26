import javax.swing.JOptionPane;

public class SecretPhrase{
	public static void main(String[]args){
		StringBuilder phrase=new StringBuilder("*** ***** ****");
		StringBuilder check;
		String guess;
		char c;
		boolean correct;
		boolean done=false;
		String s, S;
		
		JOptionPane.showMessageDialog(null,"Secret phrase! It's Hangman "+
			"with unlimited guesses.\nThe secret phrase is: "+phrase);
		
		s="Say their name";
		
		do{
			correct=true;
			check=new StringBuilder(phrase.length());
			
			guess=JOptionPane.showInputDialog(null,"Guess a letter:\n"+phrase);
			c=guess.charAt(0);
			c=Character.toLowerCase(c);
			
			if(c=='s')
				phrase.setCharAt(0,'S');
			else if(c=='a'){
				phrase.setCharAt(1,c);
				phrase.setCharAt(11,c);
			}
			else if(c=='y')
				phrase.setCharAt(2,c);
			else if(c=='t')
				phrase.setCharAt(4,c);
			else if(c=='h')
				phrase.setCharAt(5,c);
			else if(c=='e'){
				phrase.setCharAt(6,c);
				phrase.setCharAt(13,c);
			}
			else if(c=='i')
				phrase.setCharAt(7,c);
			else if(c=='r')
				phrase.setCharAt(8,c);
			else if(c=='n')
				phrase.setCharAt(10,c);
			else if(c=='m')
				phrase.setCharAt(12,c);
			else{
				JOptionPane.showMessageDialog(null,"That letter isn't in the"+
					" phrase.");
				correct=false;
			}
			
			if(correct)
				JOptionPane.showMessageDialog(null,"You got one!");
			
			for(int x=0; x<phrase.length(); x++){
				c=phrase.charAt(x);
				check=check.append(c);
				
			}
			
			S=check.toString();
			if(s.equals(S))
				done=true;
		}while(!done);
		
		JOptionPane.showMessageDialog(null,"Congratulations; you've "+
			"deduced the entire phrase:\n\""+phrase+"\"");
	}
}