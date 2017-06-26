import javax.swing.JOptionPane;

public class TicketNumber{
	public static void main(String[]args){
		int ticketQuery=Integer.parseInt(JOptionPane.showInputDialog(null,
			"Please enter your ticket number to check ticket validity.",
			"Ticket check",JOptionPane.PLAIN_MESSAGE));
		int valueQuery=(ticketQuery/10)%7;
		int ticketEval=ticketQuery%10;
		boolean valid=valueQuery==ticketEval;
		
		JOptionPane.showMessageDialog(null,
			"The validity of the entered ticket is "+valid+".");
	}
}