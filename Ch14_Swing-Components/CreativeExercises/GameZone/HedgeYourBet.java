import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class HedgeYourBet extends JFrame implements ActionListener{
	String[]questions={"Which heavenly body conducts nuclear fusion in its core?",
		"Which is commonly formed through a long series of violent collisions?",
		"Which one always has an atmosphere?","Which of these dies by slowly "+
		"dissolving over time?","Which is the densest?"};
	JCheckBox[]choices={new JCheckBox("Planet"),new JCheckBox("Star"),new
		JCheckBox("Black hole")};
	JLabel message=new JLabel("");
	JButton button=new JButton("Lock in");
	
	int[]answers={1, 0, 1, 2, 2};
	int x=0;
	int points=0;
	
	public HedgeYourBet(){
		super("Hedge Your Bet!");
		setBounds(450, 225, 500, 185);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
//		setResizeable(false);
		message.setText(questions[0]);
		add(message);
		for(JCheckBox jcb: choices)
			add(jcb);
		button.addActionListener(this);
		add(button);
		setVisible(true);
	}//main
	
	public void actionPerformed(ActionEvent event){
		if(button.getText().equals("End"))
			System.exit(0);
		
		int count=0;
		
		for(JCheckBox cb: choices)
			if(cb.isSelected())
				count++;
		
		if(count==0)
			message.setText(questions[x]+" \nPlease select an option before "+
				"continuing.");
		else{
			if(choices[answers[x]].isSelected()){
				if(count==1)
					points+=5;
				else if(count==2)
					points+=2;
				else
					points+=1;
			}
			x++;
			try{
				String s=questions[x];
				message.setText(s);
			}
			catch(ArrayIndexOutOfBoundsException last){
				endDisplay();
			}
		}
		
		for(JCheckBox cb: choices)
			cb.setSelected(false);
	}//actionPerformed
	
	public void endDisplay(){
		if(points>21)
			message.setText(points+" points. Fantastic!");
		else if(points>15)
			message.setText(points+" points. Very good.");
		else
			message.setText(points+" points. OK.");
		
		for(JCheckBox jcb: choices)
			remove(jcb);
		repaint();
		
		button.setText("End");
	}
	
	public static void main(String[]args){
		HedgeYourBet frame=new HedgeYourBet();
	}
}