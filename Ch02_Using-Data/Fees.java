import javax.swing.JOptionPane;

public class Fees{
	public static void main(String[]args){
		byte athlFee=65;
		byte booksFee=90;
		
		String creditHrs=JOptionPane.showInputDialog(null,
			"How many credit hours are you enrolled in?",
			"Credit hours",JOptionPane.QUESTION_MESSAGE);
		
		int creditFee=85*Integer.parseInt(creditHrs);
		
		JOptionPane.showMessageDialog(null,"Your total fees are $"+(athlFee+
			booksFee+creditFee)+", which include a $"+athlFee+
			" athletic fee, a $"+booksFee+
			" fee for books, and an additional $85 fee per credit hour.");
		}
	}