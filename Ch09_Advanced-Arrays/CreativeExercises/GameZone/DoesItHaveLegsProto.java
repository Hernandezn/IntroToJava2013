import javax.swing.JOptionPane;
import java.util.ArrayList;

public class DoesItHaveLegs{
	enum Ans{Y,N};
	
	public static void main(String[]args){
		ArrayList<String> output=new ArrayList<String>(64);
		ArrayList<String> result=new ArrayList<String>(32);
		String entry;
		String temp;
		final String WIN="I win!";
		final String LOSS="I give up. What was your animal?";
		Ans data;
		boolean done=false;
		boolean b;
		int x;
		int y=0;
		String guess="Is it a "+result.get(y)+"?";
		
		result.add("dog");
		result.add("snake");
		
		output.add("Does it have legs?");
		output.add("Is it a "+result.get(0)+"?");
		output.add("Is it a "+result.get(1)+"?");
		output.add(WIN);
		output.add(LOSS);
		output.add(WIN);
		output.add(LOSS);
		
		while(!done){
			for(x=0, y=0; x<output.size();){
				if(!WIN.equals(output.get(x)) && !LOSS.equals(output.get(x))){
					b=false;
					while(!b){
						entry=JOptionPane.showInputDialog(null,output.get(x));
						entry=Character.toUpperCase(entry.charAt(0))+"";
						if(entry.equals("Y") || entry.equals("N"))
							b=true;
						else
							JOptionPane.showMessageDialog(null,"Invalid entry.","Invalid",
								JOptionPane.WARNING_MESSAGE);
					}//get valid input
					data=Ans.valueOf(entry);
					switch(data){
						case Y:
							x=(x*2)+1;
							break;
						case N:
							x=(x*2)+2;
							y++;
							break;
					}//takes x to the correct position in the list
				}//procedure for if the game isn't won or lost yet
				else if(WIN.equals(output.get(x))){
					JOptionPane.showMessageDialog(null,output.get(x));
					x=output.size;
				}//win procedure that ends the current session
				else if(LOSS.equals(output.get(x))){
					entry=JOptionPane.showInputDialog(null,output.get(x));
					result.add(y+1,entry);
					entry=JOptionPane.showInputDialog(null,"Please type a question that"+
						" is yes for "+result.get(y)+" and no for "+entry+".");
				}//loss procedure that ends the current session
			}
		}
	}
}