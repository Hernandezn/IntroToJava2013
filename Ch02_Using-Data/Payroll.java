import javax.swing.JOptionPane;

public class Payroll{
	public static void main(String[]args){
		float payRate=(float)Double.parseDouble(JOptionPane.showInputDialog
			(null,"What is your hourly rate of pay?","Pay rate?",
			JOptionPane.QUESTION_MESSAGE));
		
		byte payHrs=(byte)Integer.parseInt(JOptionPane.showInputDialog
			(null,"How many hours have you worked?","Work hours?",
			JOptionPane.QUESTION_MESSAGE));
		
		float grossPay=(payRate*payHrs);
		float taxRate=.15F;
		double netPay=grossPay-(grossPay*taxRate);
		
		JOptionPane.showMessageDialog(null,"Your gross pay is $"+grossPay+
			", and with a withholding tax rate of "+(float)(taxRate*100)+
			"%, your net pay is $"+(float)netPay,"Your pay",
			JOptionPane.INFORMATION_MESSAGE);
	}
}