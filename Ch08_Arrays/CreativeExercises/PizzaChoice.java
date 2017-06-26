import javax.swing.JOptionPane;

public class PizzaChoice{
	public static void main(String[]args){
		String choice;
		String selection;
		String[]size={       "S",     "M",    "L",      "X",      "E"};
		double[]price={     6.99,    8.99,  12.50,    15.00,    15.00};
		String[]display={"Small","Medium","Large","X-Large","X-Large"};
		int x;
		double sale=.0;
		boolean valid=false;
		
		choice=JOptionPane.showInputDialog(null,"Please select your pizza "
			+"size:\nSmall, Medium, Large, or X-Large.");
		selection=Character.toString(choice.charAt(0));
		
		for(x=0; x<size.length; x++)
			if(size[x].equalsIgnoreCase(selection)){
				sale=price[x];
				choice=display[x];
				valid=true;
				x=size.length;
			}
		
		if(valid)
			JOptionPane.showMessageDialog(null,"You've selected a "+choice+
				" pizza. Your price will be $"+sale+".");
		else
			JOptionPane.showMessageDialog(null,"That's an invalid pizza "+
				"size.");
	}
}