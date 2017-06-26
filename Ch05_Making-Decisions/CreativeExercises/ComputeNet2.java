import javax.swing.*;

public class ComputeNet2{
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
		
		if(grossPay>=0.00 && grossPay<=300.00)
			withholdingTax=.10;
		else
			if(grossPay>300.00 && grossPay<=400.00)
				withholdingTax=.12;
			else
				if(grossPay>400.00 && grossPay<=500)
					withholdingTax=.15;
				else
					if(grossPay>500)
						withholdingTax=.20;
					else{
						withholdingTax=1.00;
						JOptionPane.showMessageDialog(null,"You've entered an"+
							" invalid pay rate. Please re-execute.","ERROR",
							JOptionPane.ERROR_MESSAGE);
					}//Tax bracket check
		
		netPay= grossPay - grossPay*withholdingTax;
		
		JOptionPane.showMessageDialog(null,"Rate per hour: $"+rate+
			"\nHours worked: "+hrs+"\nGross pay: $"+grossPay+
			"\nWithholding tax: "+withholdingTax*100+"%\nNet pay: $"+netPay,
			"Process examination",JOptionPane.INFORMATION_MESSAGE);
	}
}