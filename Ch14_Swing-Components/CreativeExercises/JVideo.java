import java.util.*;
import java.text.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JVideo extends JFrame implements ActionListener{
	String[]videos={"Beetlejuice","Sweets Time","Star Wars Anthology","Freaky Forest",
		"Splice","Artificial Intelligence","2012","Hotel Transylvania",
		"Independence Day","Gravity's Rainbow"};
	double[]prices={3.00,2.00,1.00,1.00,2.00,2.00,3.00,2.00,3.00,1.00};
	JComboBox selection;
	DecimalFormat df=new DecimalFormat("0.00");
	JTextField field=new JTextField(5);
	
	public JVideo(){
		super("Video");
		setBounds(460, 325, 150, 120);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		Arrays.sort(videos);
		selection=new JComboBox(videos);
		selection.addActionListener(this);
		add(selection);
		field.setEditable(false);
		field.setText("$"+df.format(0));
		add(field);
		setResizable(false);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent event){
		Object source=event.getSource();
		JComboBox box;
		int choice=0;
		if(source==selection){
			box=(JComboBox)source;
			choice=box.getSelectedIndex();
		}
		
		field.setText("$"+df.format(prices[choice]));
	}
	
	public static void main(String[]args){
		JVideo frame=new JVideo();
	}
}