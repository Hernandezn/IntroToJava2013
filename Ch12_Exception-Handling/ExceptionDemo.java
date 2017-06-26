import javax.swing.*;

public class ExceptionDemo{
	public static void main(String[]args){
		int numerator=0, denominator=0, result;
		String entry;
		
		try{
			entry=JOptionPane.showInputDialog(null,"Enter a number to be divided.");
			numerator=Integer.parseInt(entry);
			
			entry=JOptionPane.showInputDialog(null,"Enter a number to divide into the"+
				" first number.");
			denominator=Integer.parseInt(entry);
			
			result=numerator/denominator;
		}
		catch(ArithmeticException exception){
			JOptionPane.showMessageDialog(null,exception.getMessage());
			result=0;
		}
		catch(NumberFormatException exception){
			JOptionPane.showMessageDialog(null,"Only integers are accepted!");
			numerator=999;
			denominator=999;
			result=1;
		}
		
		JOptionPane.showMessageDialog(null,numerator+"/"+denominator+"\nResult is "+
			result);
	}
}