import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.text.*;

public class JPizza extends JFrame implements ActionListener{
	String[]sizes={"Small","Medium","Large","X-Large"};
	String[]toppings={"Cheese","Pepperoni","Barbecue","Ham","Hot Wing","Mushroom"};
	JComboBox size=new JComboBox(sizes);
	JComboBox topping;
	JTextField display=new JTextField(3);
	DecimalFormat df=new DecimalFormat("00");
	JLabel header=new JLabel("Choose your pizza:");
	int[]sizePrice={7, 9, 11, 14};
	int sizeMod=7;
	int toppingMod=1;
	int price=8;
	
	public JPizza(){
		super("Pizza Order");
		int x, y;
		
		setBounds(460, 245, 180, 120);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		setResizable(false);
		
		Arrays.sort(toppings);
		topping=new JComboBox(toppings);
		display.setEditable(false);
		display.setText("$"+df.format(price));
		topping.addActionListener(this);
		size.addActionListener(this);
		
		add(header);
		add(size);
		add(topping);
		add(display);
		
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent event){
		JComboBox source=(JComboBox)event.getSource();
		int index;
		String temp;
		
		if(source==topping){
			temp=(String)source.getSelectedItem();
			if(!temp.equals("Cheese"))
				toppingMod=1;
			else
				toppingMod=0;
		}
		else if(source==size){
			index=source.getSelectedIndex();
			sizeMod=sizePrice[index];
		}
		
		price=sizeMod+toppingMod;
		display.setText("$"+df.format(price));
	}
	
	public static void main(String[]args){
		JPizza frame=new JPizza();
	}
}