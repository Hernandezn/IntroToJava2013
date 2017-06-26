import javax.swing.JOptionPane;

public class Interest{
	public static void main(String[]args){
		interestGUI();
	}
	
	public static void interestGUI(){
		double initInvestment=Double.parseDouble(
			JOptionPane.showInputDialog(null,
				"What is your initial investment?","Investment input",
				JOptionPane.QUESTION_MESSAGE));
		
		JOptionPane.showMessageDialog(null,
			"After one year, your investment appreciates to "+
			interestCalc(initInvestment)+".","Investment output",
			JOptionPane.INFORMATION_MESSAGE);
	}
	
	public static double interestCalc(double init){
		double fin=init*1.05;
		return fin;
	}
}