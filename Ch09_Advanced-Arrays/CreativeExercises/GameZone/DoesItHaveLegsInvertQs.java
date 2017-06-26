import javax.swing.JOptionPane;
import java.util.ArrayList;

public class DoesItHaveLegsInvertQs{
	public static void main(String[]args){
		ArrayList<String> questions=new ArrayList<String>(128);
		ArrayList<String> answers=new ArrayList<String>(128);
		String entry;
		String data;
		boolean done=false;
		int x, y;
		String guess;
		final String WIN="I win!";
		final String LOSS="I give up. What was your animal?";
		final String ANS="ans";
		
		questions.add("Does it have legs?");
		questions.add(ANS);
		questions.add(ANS);
		answers.add(null);
		answers.add("dog");
		answers.add("snake");
		
		JOptionPane.showMessageDialog(null,"Think of an animal...");
		
		while(!done){
			for(x=0; x<questions.size() && !questions.get(x).equals(ANS);){
				do{
					entry=JOptionPane.showInputDialog(null,questions.get(x));
					entry=Character.toUpperCase(entry.charAt(0))+"";
					
					if(!entry.equals("Y") && !entry.equals("N"))
						JOptionPane.showMessageDialog(null,"Invalid entry; it's a yes-"+
							"or-no question.");
				}while(!entry.equals("Y") && !entry.equals("N"));//take valid input
				
				if(entry.equals("Y"))
					x=(2*x)+1;
				else if(entry.equals("N"))
					x=(2*x)+2;
			}//keep asking questions until questions are exhausted
			guess=answers.get(x);
			do{
				entry=JOptionPane.showInputDialog(null,"Is it a(n) "+guess+"?");
				entry=Character.toUpperCase(entry.charAt(0))+"";
				
				if(!entry.equals("Y") && !entry.equals("N"))
						JOptionPane.showMessageDialog(null,"Invalid entry; it's a yes-"+
							"or-no question.");
			}while(!entry.equals("Y") && !entry.equals("N"));//guess phase
			
			for(y=questions.size(); y<((2*x)+3); y++)
				questions.add(ANS);//initializes variable positions to be assigned
			for(y=answers.size(); y<questions.size(); y++)
				answers.add(null);
			
			if(entry.equals("Y"))
				JOptionPane.showMessageDialog(null,WIN);//if won
			else if(entry.equals("N")){
				entry=JOptionPane.showInputDialog(null,LOSS);
				data=entry;
				entry=JOptionPane.showInputDialog(null,"Please type a yes-or-no "
					+"question that's yes for "+data+" but no for "+guess+".");
				questions.set(x,entry);
				answers.set(x,"invalid");
				answers.set(((2*x)+1),data);
				answers.set(((2*x)+2),guess);
			}//if lost
			
			do{
				entry=JOptionPane.showInputDialog(null,"Do you want to play again?");
				entry=Character.toUpperCase(entry.charAt(0))+"";
				
				if(!entry.equals("Y") && !entry.equals("N"))
						JOptionPane.showMessageDialog(null,"Invalid entry; it's a yes-"+
							"or-no question.");
			}while(!entry.equals("Y") && !entry.equals("N"));
			
			if(entry.equals("N"))
				done=true;
		}//full game
	}
}//[Q,A,A] Starting at position 0, yes = 2(position)+1, no = 2(position)+2.
//http://ysjpyc2oihuw5hbe.onion/download/bfed2312273766f98007352205621564/1beaf07ff19c1640d717c09b57405446/12yo%20girl%20-%20full%20penetration%20and%20creampie.mpg