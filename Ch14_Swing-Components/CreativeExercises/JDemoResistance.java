import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JDemoResistance extends JFrame implements ActionListener{
	JLabel header=new JLabel("Why are you returning the product?");
	JLabel[]reasons={new JLabel("Defunct"), new JLabel("Obsolete"), new JLabel(
		"Bad interface"), new JLabel("Too expensive"),new JLabel("Other")};
	JButton button=new JButton("reason--");
	int index=0;
	
	public JDemoResistance(){
		super("Survey");
		setLayout(new FlowLayout());
		setBounds(460, 325, 325, 125);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		header.setFont(new Font("Helvetica", Font.ITALIC, 18));
		button.addActionListener(this);
		add(header);
		for(int x=0; x<reasons.length; x++)
			add(reasons[x]);
		add(button);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent event){
		remove(reasons[index]);
		repaint();
		index++;
		if(index==reasons.length)
			button.setEnabled(false);
	}
	
	public static void main(String[]args){
		JDemoResistance frame=new JDemoResistance();
	}
}