import javax.swing.JOptionPane;

public class Dollars{
	public static void main(String[]args){
		int totalDollars=Integer.parseInt(JOptionPane.showInputDialog(
			null,"How many dollars would you like to withdraw?\n\n"+
			"NOTE: Only full dollar amounts are accepted; no coinage.",
			"Withdrawal amount",JOptionPane.QUESTION_MESSAGE));
		
		JOptionPane.showConfirmDialog(null,"You will receive:\n\n"+
			totalDollars/20+" $20 bills,\n"+totalDollars%20/10+
			" $10 bills,\n"+totalDollars%20%10/5+" $5 bills, and \n"+
			totalDollars%20%10%5+" $1 bills.\n\nIs this okay?",
			"Your received bills",JOptionPane.YES_NO_OPTION);
		
	}
}