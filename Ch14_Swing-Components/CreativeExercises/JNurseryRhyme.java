import javax.swing.*;
import java.awt.*;

public class JNurseryRhyme{
	public static void main(String[]args){
		JFrame frame=new JFrame("Mary's Lamb");
		JLabel line1=new JLabel("Mary had a little lamb.");
		JLabel line2=new JLabel("Its grease was tasty, so.");
		frame.setLayout(new FlowLayout());
		frame.add(line1);
		frame.add(line2);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(460, 325, 200, 100);
		frame.setResizable(false);
		frame.setVisible(true);
	}
}