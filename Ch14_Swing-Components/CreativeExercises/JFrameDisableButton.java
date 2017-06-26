import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JFrameDisableButton extends JFrame implements ActionListener{
	JButton button=new JButton("YOU");
	
	public JFrameDisableButton(){
		super("U Can't");
		setBounds(460, 325, 200, 80);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		button.addActionListener(this);
		add(button);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent event){
		button.setEnabled(false);
		button.setText("Can't touch this.");
	}
	
	public static void main(String[]args){
		JFrameDisableButton frame=new JFrameDisableButton();
	}
}