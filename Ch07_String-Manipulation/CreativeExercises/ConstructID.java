import javax.swing.JOptionPane;

public class ConstructID{
	public static void main(String[]args){
		String name;
		String address;
		StringBuilder ID=new StringBuilder();
		int x;
		char c;
		
		name=JOptionPane.showInputDialog(null,"Please enter your full "+
			"name.");
		
		address=JOptionPane.showInputDialog(null,"Please enter your "+
			"address.");
		
		for(x=0; x<name.length(); x++){
			c=name.charAt(x);
			if(x==0){
				c=Character.toUpperCase(c);
				ID.append(c);
			}
			else if(Character.isWhitespace(c)){
				c=Character.toUpperCase(name.charAt(x+1));
				ID.append(c);
			}
		}
		for(x=0; x<address.length(); x++){
			c=address.charAt(x);
			if(Character.isDigit(c))
				ID.append(c);
		}
		
		JOptionPane.showMessageDialog(null,"Your community ID is:\n"+ID);
	}
}