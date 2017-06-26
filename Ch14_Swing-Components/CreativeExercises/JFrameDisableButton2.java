import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JFrameDisableButton2 extends JFrame implements ActionListener{
	JButton button=new JButton("YOU");
	JLabel label=new JLabel("ENOUGH!");
	int count=0;
	
	public JFrameDisableButton2(){
		super("U Can't");
		setBounds(460, 325, 200, 125);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		button.addActionListener(this);
		label.setFont(new Font("Arial", Font.BOLD, 24));
		add(button);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent event){
		count++;
		if(count>=8){
			button.setEnabled(false);
			button.setText("Can't touch this.");
			add(label);
		}
	}
	
	public static void main(String[]args){
		JFrameDisableButton2 frame=new JFrameDisableButton2();
	}
}