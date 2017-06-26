import javax.swing.JOptionPane;

public class PhoneBook{
	public static void main(String[]args){
		String[]maxContacts=new String[20];
		long[]maxNums=new long[20];
		String[]inputContacts;
		long[]inputNums;
		String input;
		StringBuilder phone=new StringBuilder("");
		int x;
		long y=0;
		boolean b;
		boolean check=false;
		int count=0;
		String ESCAPE_CODE="zzz";
		
		for(x=0, b=true; x<maxContacts.length && b; x++){
			input=JOptionPane.showInputDialog(null,"Please enter "+
				"a phone contact's name, or enter \"zzz\" to finish "+
				"inputting contacts.");//collects the contact name
			
			if(!input.equalsIgnoreCase(ESCAPE_CODE)){
				maxContacts[x]=input;
				input=JOptionPane.showInputDialog(null,"What is this "+
					"contact's phone number?");
				phone=new StringBuilder("");
				
				for(y=0; y<input.length(); y++){
					if(Character.isDigit(input.charAt((int)y)))
						phone.append(input.charAt((int)y));
					System.out.println(input+":"+input.length()+":"+phone+":"+
						phone.toString());
				}
				maxNums[x]=Long.parseLong(phone.toString());
				count++;
			}//collects the number
			else
				b=false;
		}//populating the array
		
		inputContacts=new String[count];
		inputNums=new long[count];
		for(x=0; x<count; x++){
			inputContacts[x]=maxContacts[x];
			inputNums[x]=maxNums[x];
		}//assigning values to new arrays to avoid "null" displays
		
		b=true;
		do{
			check=false;
			input=JOptionPane.showInputDialog(null,"The names you've "+
				"entered are:\n"+nameDisplay(inputContacts)+"\nType one out"+
				" to look up his or her number. The escape code is still \""+
				ESCAPE_CODE+"\".");
			
			if(!input.equalsIgnoreCase(ESCAPE_CODE)){
				for(x=0; x<inputContacts.length; x++)
					if(input.equalsIgnoreCase(inputContacts[x])){
						y=inputNums[x];
						check=true;
						x=inputContacts.length;
					}
				
				if(check)
					JOptionPane.showMessageDialog(null,input+"'s number is "+y
						+".");
				else
					JOptionPane.showMessageDialog(null,"That's not a listed"+
						" contact.");
			}
			else
				b=false;
		}while(b);//allows to look up by contact & display contact's number
	}//main
	
	public static String nameDisplay(String[]s){
		int z;
		StringBuilder message=new StringBuilder("");
		String display;
		
		for(z=0; z<s.length; z++)
			message.append(s[z]+"\n");
		
		display=message.toString();
		return display;
	}
}