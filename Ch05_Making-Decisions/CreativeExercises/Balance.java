import javax.swing.JOptionPane;

public class Balance{
	public static void main(String[]args){
		
		double checkingBalance=Double.parseDouble(JOptionPane.showInputDialog
			(null,"What is your checking account balance?"));
		double savingsBalance=Double.parseDouble(JOptionPane.showInputDialog
			(null,"What is your savings account balance?"));
		
		boolean checkingCheck=checkingBalance<10.0;
		boolean savingsCheck=savingsBalance<100.0;
		
		if(checkingCheck)
			JOptionPane.showMessageDialog(null,
				"Your checking account balance is low.");
		if(savingsCheck)
			JOptionPane.showMessageDialog(null,
				"Your savings account balance is low.");
	}
}