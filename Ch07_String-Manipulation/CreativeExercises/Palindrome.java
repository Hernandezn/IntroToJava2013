import javax.swing.JOptionPane;
//determine whether or not the entered phrase it a palindrome
//ignore capitalization and punctuation
//game plan -- scan it, letter by letter, both ways,
//and have it compare each letter it scans for equal sides

public class Palindrome{
	public static void main(String[]args){
		int remover;
		char c;
		char x;
		String C;
		String X;
		String phrase;
		StringBuilder data;
		int forwardScan=0;
		int backwardScan;
		int count=0;
		
		phrase=JOptionPane.showInputDialog(null,"Enter a word or phrase,"+
			" and this program will tell you if it's a palindrome or not.");
		data=new StringBuilder(phrase.length());
		
		//remove whitespace and punctuation: to disregard them
		for(remover=0; remover<phrase.length(); remover++){
			c=phrase.charAt(remover);
			if(Character.isLetter(c)){
				data.append(c);
			}
		}
		
//		System.out.println("DEVELOPER TEST:\n"+data);
		//scan it both ways, comparing characters along the way~
		for(forwardScan=0; forwardScan<data.length(); forwardScan++){
			c=data.charAt(forwardScan);
			C=""+c;
			
			backwardScan=forwardScan+1;
			x=data.charAt(data.length()-backwardScan);
			X=""+x;
			
			if(C.equalsIgnoreCase(X))
				count++;
		}
		
		if(count==data.length())
			JOptionPane.showMessageDialog(null,"You entered:\n"+phrase+
				"\nThat IS a palindrome.");
		else
			JOptionPane.showMessageDialog(null,"You entered:\n"+phrase+
				"\nThat is NOT a palindrome.");
	}
}