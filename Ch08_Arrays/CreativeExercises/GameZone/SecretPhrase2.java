import javax.swing.JOptionPane;

public class SecretPhrase2{
	public static void main(String[]args){
		StringBuilder phrase, secret;
		String guess;
		int x;
		char c;
		boolean b;
		boolean done=false;
		String[]s={"No man is an island.","This is Sparta.","No context necessary",
			"War sucks.","Look out for creepers."};
		
		phrase=new StringBuilder(s[(int)(Math.random()*s.length*100)%s.length]);
		secret=new StringBuilder(phrase.length());
		
		for(x=0; x<secret.capacity(); x++)
			if(Character.isLetter(phrase.charAt(x)))
				secret.append("*");
			else
				secret.append(phrase.charAt(x));//sets the asterisks/symbols in place
		
		JOptionPane.showMessageDialog(null,"Secret phrase! It's Hangman "+
			"with unlimited guesses.\nThe secret phrase is: "+secret);
		
		do{
			b=false;
			guess=JOptionPane.showInputDialog(null,"Guess a letter:\n"+secret);
			c=guess.charAt(0);
			
			for(x=0; x<phrase.length(); x++)
				if(Character.toLowerCase(c)==Character.toLowerCase(phrase.charAt(x))){
					secret.setCharAt(x, phrase.charAt(x));
					b=true;
				}//checks for matches, regardless of case
			
			if(!b)
				JOptionPane.showMessageDialog(null,"That letter isn't in the phrase.");
			
			if(secret.toString().equals(phrase.toString()))
				done=true;
		}while(!done);//game
		
		JOptionPane.showMessageDialog(null,"Congratulations; you've "+
			"deduced the entire phrase:\n\""+phrase+"\"");
	}
}