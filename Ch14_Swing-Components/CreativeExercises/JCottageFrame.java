import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.*;

public class JCottageFrame extends JFrame implements ItemListener{
	JLabel header=new JLabel("Thank you for choosing Koch's Cottages.");
	JLabel footer=new JLabel("Price per week:");
	JCheckBox[]options={new JCheckBox("One-bedroom cottage -- $600/wk"),new
		JCheckBox("Two-bedroom cottage -- $850/wk"), new JCheckBox("Add a rowboat "+
		"rental for $60/wk")};
	int[]priceMod={600, 850, 60};
	JTextField field=new JTextField(4);
	ButtonGroup cottageTypes=new ButtonGroup();
	DecimalFormat df=new DecimalFormat("000");
	int price=600;
	
	public JCottageFrame(){
		super("Rental Planner");
		setBounds(450, 225, 300, 185);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		setResizable(false);
		add(header);
		
		cottageTypes.add(options[0]);
		cottageTypes.add(options[1]);
		options[0].setSelected(true);
		for(JCheckBox jcb: options){
			jcb.addItemListener(this);
			add(jcb);
		}
		field.setText("$"+df.format(price));
		field.setEditable(false);
		
		add(footer);
		add(field);
		setVisible(true);
	}
	
	public void itemStateChanged(ItemEvent event){
		JCheckBox source=(JCheckBox)event.getSource();
		int selection=event.getStateChange();
		int x;
		
		for(x=0; x<options.length; x++){
			if(source==options[x]){
				if(selection==ItemEvent.SELECTED)
					price+=priceMod[x];
				else
					price-=priceMod[x];
			}
		}
		field.setText("$"+df.format(price));
	}
	
	public static void main(String[]args){
		JCottageFrame frame=new JCottageFrame();
	}
}