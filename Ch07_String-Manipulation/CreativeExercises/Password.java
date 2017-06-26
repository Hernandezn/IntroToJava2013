import javax.swing.JOptionPane;

public class Password{
	public static void main(String[]args){
		String passInput;
		int passLength;
		String passConfirm;
		int x;
		char c;
		boolean valid=false;
		int MAX_CHARACTERS=10;
		int MIN_CHARACTERS=6;
		boolean numCheck=false;
		boolean letCheck=false;
		
		do{
			passInput=JOptionPane.showInputDialog(null,"Enter your new"+
				" password.\nInclude at least one letter and one number.\n"+
				"The password must be 6-10 characters in length.\nThe "+
				"password IS case-sensitive.");
			passLength=passInput.length();
			
			if(passLength<MIN_CHARACTERS || passLength>MAX_CHARACTERS)
				valid=false;
			else for(x=0; x<passLength; x++){
				c=passInput.charAt(x);
				
				if(!numCheck)
					numCheck=Character.isDigit(c);
				if(!letCheck)
					letCheck=Character.isLetter(c);
			}
			
			if(numCheck && letCheck)
				valid=true;
			else{
				numCheck=false;
				letCheck=false;
			}
		}while(!valid);//only valid passwords beyond this point
		
		do{
			passConfirm=JOptionPane.showInputDialog(null,"Please re-enter "+
				"your password for confirmation.");
		}while(!passInput.equals(passConfirm));
		
		JOptionPane.showMessageDialog(null,"Thank you.");
	}
}