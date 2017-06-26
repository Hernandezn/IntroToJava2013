import javax.swing.JOptionPane;

public class ThreeLetterAcronym{
	public static void main(String[]args){
		StringBuilder acronym=new StringBuilder("");
		int count=0;
		String data;
		int x;
		char c;
		
		data=JOptionPane.showInputDialog(null,"Please enter three words "+
			"to be turned into an acronym.\nA new word only starts after "+
			"whitespace, and extra words will be ignored.");
		
		for(x=0; count<2; x++){
			c=data.charAt(x);
			if(x==0){
				c=Character.toUpperCase(c);
				acronym.append(c+".");
			}
			else if(Character.isWhitespace(c)){
				c=data.charAt(x+1);
				c=Character.toUpperCase(c);
				acronym.append(c+".");
				count++;
			}
			if(x==(data.length()-1))
				count=2;
		}
		
		JOptionPane.showMessageDialog(null,"The original phrase was \""+
			data+".\"\nThe acronym is "+acronym);
	}
}
			