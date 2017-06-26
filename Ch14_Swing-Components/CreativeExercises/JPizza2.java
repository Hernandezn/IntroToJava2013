import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.text.*;

public class JPizza2 extends JFrame implements ActionListener, ItemListener{
	String[]sizes={"Small","Medium","Large","X-Large"};
	String[]toppings={"Cheese","Pepperoni","Barbecue","Ham","Hot Wing","Mushroom"};
	JComboBox size=new JComboBox(sizes);
	JCheckBox[]topping=new JCheckBox[toppings.length];
	JTextField display=new JTextField(3);
	DecimalFormat df=new DecimalFormat("00");
	JLabel header=new JLabel("Choose your pizza:");
	int[]sizePrice={7, 9, 11, 14};
	int sizeMod=7;
	int toppingMod=0;
	int price=7;
	
	public JPizza2(){
		super("Pizza Order");
		int x;
		
		setBounds(460, 245, 275, 160);//comfy size, comfy position
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		setResizable(false);
		
		add(header);//"Choose your pizza:"
		size.addActionListener(this);
		add(size);//combo box for size selection
		
		Arrays.sort(toppings);
		for(x=0; x<topping.length; x++){
			topping[x]=new JCheckBox(toppings[x]);
			topping[x].addItemListener(this);
			add(topping[x]);
		}//adds an alphabetically-sorted field of check boxes for toppings
		
		display.setText("$"+df.format(price));
		display.setEditable(false);
		add(display);//uneditable text field to display current price
		
		setVisible(true);
	}//frame constructor
	
	public void actionPerformed(ActionEvent event){
		JComboBox source=(JComboBox)event.getSource();
		
		sizeMod=sizePrice[source.getSelectedIndex()];
		
		setPrice();
	}//modifies price according to size selection
	
	public void itemStateChanged(ItemEvent event){
		JCheckBox source=(JCheckBox)event.getSource();
		String s=source.getText();
		int choice=event.getStateChange();
		
		if(!s.equals("Cheese")){
			if(choice==ItemEvent.SELECTED)
				toppingMod++;
			else
				toppingMod--;
		}
		
		setPrice();
	}//adds a dollar if a topping besides cheese is selected
	
	private void setPrice(){
		price=sizeMod+toppingMod;
		display.setText("$"+df.format(price));
	}//resets price for above changes, displays modified price
	
	public static void main(String[]args){
		JPizza2 frame=new JPizza2();
	}//main
}