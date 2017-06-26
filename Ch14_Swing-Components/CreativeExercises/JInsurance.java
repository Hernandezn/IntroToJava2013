import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JInsurance extends JFrame implements ItemListener{
	ButtonGroup type=new ButtonGroup();
	JCheckBox[]boxes={new JCheckBox("HMO"),new JCheckBox("PPO"),new JCheckBox(
		"Dental insurance"),new JCheckBox("Vision insurance")};
	String[]messages={"HMO -- $200/mo","PPO -- $600/mo","Dental adds $75/mo",
		"Vision adds $20/mo"};
	JTextField field=new JTextField(18);
	
	public JInsurance(){
		super("Insurance");
		
		setBounds(460, 245, 400, 100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setLayout(new FlowLayout());
		type.add(boxes[0]);
		type.add(boxes[1]);
		field.setEditable(false);
		
		for(JCheckBox cb: boxes){
			cb.addItemListener(this);
			add(cb);
		}
		add(field);
		setVisible(true);
	}
	
	public void itemStateChanged(ItemEvent event){
		JCheckBox source=(JCheckBox)event.getSource();
		int x;
		
		if(event.getStateChange()==ItemEvent.DESELECTED)
			field.setText("");
		else
			for(x=0; x<boxes.length; x++)
				if(source==boxes[x]){
					field.setText(messages[x]);
					x=boxes.length;
				}
	}
	
	public static void main(String[]args){
		JInsurance frame=new JInsurance();
	}
}