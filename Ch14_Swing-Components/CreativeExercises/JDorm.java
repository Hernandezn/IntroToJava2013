import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JDorm extends JFrame implements ItemListener{
	JCheckBox[]boxes={new JCheckBox("Seating setup"), new JCheckBox("Wi-fi "+
		"Web-enabled computer"), new JCheckBox("Cable television"), new JCheckBox(
		"Microwave"), new JCheckBox("Refrigerator")};
	JTextArea display;
	JLabel header=new JLabel("What items will you provide for your dorm?");
	StringBuilder monitorText, selections;
	
	public JDorm(){
		super("Dormitory Utilities");
		int x;
		monitorText=new StringBuilder("By default, the college will "+
			"provide a stock model of each of these utilities:");
		
		setBounds(250, 225, 900, 365);
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		setResizable(false);
		add(header);
		
		for(JCheckBox cb: boxes){
			cb.addItemListener(this);
			add(cb);
			monitorText.append(" "+cb.getText()+",");
		}
		monitorText.setCharAt((monitorText.length()-1), '.');
		monitorText.append("\nYou've chosen to provide the following utilities "+
			"yourself:\n");
		display=new JTextArea(monitorText.toString());
		add(display);
		
		setVisible(true);
	}
	
	public void itemStateChanged(ItemEvent event){
		JCheckBox source=(JCheckBox)event.getSource();
		int choice=event.getStateChange();
		
		for(JCheckBox jcb: boxes)
			if(source==jcb){
				if(choice==ItemEvent.SELECTED)
					display.append("+You are providing a "+jcb.getText()+"\n");
				else if(choice==ItemEvent.DESELECTED)
					display.append("-You are NOT providing a "+jcb.getText()+
						"\n");
			}
	}
	
	public static void main(String[]args){
		JDorm frame=new JDorm();
	}
}