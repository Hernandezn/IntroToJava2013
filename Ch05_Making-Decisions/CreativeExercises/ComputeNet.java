import javax.swing.*;

public class ComputeNet{
	public static void main(String[]args){
		int hrs;
		double rate;
		double grossPay;
		double withholdingTax;
		double netPay;
		
		rate=Double.parseDouble(JOptionPane.showInputDialog(null,
			"What is your hourly pay rate?"));
		hrs=Integer.parseInt(JOptionPane.showInputDialog(null,
			"For how many hours have you worked?"));
		
		grossPay=rate*hrs;
		
		withholdingTax= (grossPay<=300)? .10 : .12 ;
		
		netPay= grossPay - grossPay*withholdingTax;
		
		JOptionPane.showMessageDialog(null,"Rate per hour: $"+rate+
			"\nHours worked: "+hrs+"\nGross pay: $"+grossPay+
			"\nWithholding tax: "+withholdingTax*100+"%\nNet pay: $"+netPay,
			"Process examination",JOptionPane.INFORMATION_MESSAGE);
	}
}