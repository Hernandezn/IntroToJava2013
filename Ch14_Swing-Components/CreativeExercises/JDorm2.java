import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JDorm2 extends JFrame implements ItemListener{
	JCheckBox[]boxes={new JCheckBox("Seating setup"), new JCheckBox("Wi-fi "+
		"Web-enabled computer"), new JCheckBox("Cable television"), new JCheckBox(
		"Microwave"), new JCheckBox("Refrigerator")};
	String[]appendations;
	boolean[]switches;
	JTextArea display;
	JLabel header=new JLabel("What items will you provide for your dorm?");
	StringBuilder monitorText, selections;
	
	public JDorm2(){
		super("Dormitory Utilities");
		int x;
		monitorText=new StringBuilder("By default, the college will "+
			"provide a stock model of each of these utilities:");
		
		setBounds(250, 225, 900, 165);
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
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
		
		appendations=new String[boxes.length];
		switches=new boolean[boxes.length];
		for(x=0; x<boxes.length; x++){
			appendations[x]="+You are providing a "+boxes[x].getText()+"\n";
			switches[x]=false;
		}
	}
	
	public void itemStateChanged(ItemEvent event){
		JCheckBox source=(JCheckBox)event.getSource();
		int choice=event.getStateChange();
		int x;
		selections=new StringBuilder(255);
		
		for(x=0; x<boxes.length; x++){
			if(source==boxes[x])
				if(choice==ItemEvent.SELECTED)
					switches[x]=true;
				else if(choice==ItemEvent.DESELECTED)
					switches[x]=false;
		}
		
		for(x=0; x<switches.length; x++)
			if(switches[x])
				selections.append(appendations[x]);
		
		display.setText(monitorText.toString()+selections.toString());
	}
	
	public static void main(String[]args){
		JDorm2 frame=new JDorm2();
	}
}