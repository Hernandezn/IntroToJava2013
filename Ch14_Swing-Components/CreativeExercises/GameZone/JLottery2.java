import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JLottery2 extends JFrame implements ItemListener, ActionListener{
	JLabel header=new JLabel("Try your luck!");
	Font title=new Font("Arial", Font.ITALIC, 18);
	JLabel instructions=new JLabel("Select 6 options:");
	JCheckBox[]choices=new JCheckBox[31];
	JLabel choiceDisplay, lottoDisplay, winningsDisplay;
	JButton button=new JButton("OK");
	int count=0;
	int[]selection=new int[6];
	int[]lotto=new int[6];
	
	public JLottery2(){
		super("Lottery pick!");
		int x, y;
		
		setLayout(new FlowLayout());
		setBounds(450, 225, 325, 275);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		header.setFont(title);
		
		add(header);
		add(instructions);
		for(x=0; x<choices.length; x++){
			choices[x]=new JCheckBox(x+"");
			choices[x].addItemListener(this);
			add(choices[x]);
		}//adds appropriately labeled number choices
		setVisible(true);
		
		for(x=0; x<lotto.length; x++){
			lotto[x]=(int)(Math.random()*31);
//			System.out.println(lotto[x]+" ");//dev line
			for(y=0; y<x; y++)
				if(lotto[y]==lotto[x])
					y=x--;
		}//populates with mutually exclusive choices from 0 to 30, inclusive
	}
	
	public void itemStateChanged(ItemEvent event){
		JCheckBox source=(JCheckBox)event.getSource();
		int select=event.getStateChange();
		int choice=Integer.parseInt(source.getText());
		
		if(select==ItemEvent.SELECTED){
			selection[count]=choice;
			count++;
			if(count==selection.length)
				endProcess();
		}//assigns checkbox value to the array index
		else
			count--;//puts last index up for reassignment if deselected
	}
	
	public void endProcess(){
		int x, y;
		StringBuilder display;
		count=0;
		
		for(x=0; x<lotto.length; x++)
			for(y=0; y<lotto.length; y++)
				if(selection[x]==lotto[y]){
					y=lotto.length;
					count++;
				}//checks number of matches
		
		display=new StringBuilder("Your selections were:");
		for(int num: selection)
			display.append(" "+num);
		choiceDisplay=new JLabel(display.toString());
		add(choiceDisplay);//displays user choices
		
		display=new StringBuilder("The winning numbers:");
		for(int num: lotto)
			display.append(" "+num);
		lottoDisplay=new JLabel(display.toString());
		add(lottoDisplay);//displays winning choices
		
		display=new StringBuilder(count+" match(es)");
		switch(count){
			case 0:
			case 1:
			case 2:
				display.append(". Tough luck.");
				break;
			case 3:
				display.append(". You've won $100!");
				break;
			case 4:
				display.append("~ That's a $10,000 reward!");
				break;
			case 5:
				display.append("! $50,000!!!");
				break;
			case 6:
				display.append("!!! YOU'VE WON THE $1,000,000 JACKPOT!!!");
		}
		winningsDisplay=new JLabel(display.toString());
		add(winningsDisplay);//displays winnings based on matches
		
		for(JCheckBox jcb: choices)
			jcb.setEnabled(false);//disables choices
		
		button.addActionListener(this);
		add(button);//adds a close button
		validate();//failsafe to make above additions display immediately
	}//endProcess
	
	public void actionPerformed(ActionEvent e){
		System.exit(0);
	}//ends the program on button press
	
	public static void main(String[]args){
		JLottery2 frame=new JLottery2();
	}//main
}