import javax.swing.*;

public class PartAndQuantityEntry{
	public static void main(String[]args){
		String entry;
		int partNum, quantity;
		
		try{
			entry=JOptionPane.showInputDialog(null,"Please enter a part number.");
			
			try{
				partNum=Integer.parseInt(entry);
			}
			catch(Exception e){
				throw(new DataException(1));
			}
			if(partNum<0)
				throw(new DataException(3));
			else if(partNum>999)
				throw(new DataException(4));
			
			entry=JOptionPane.showInputDialog(null,"Enter a quantity to order.");
			
			try{
				quantity=Integer.parseInt(entry);
			}
			catch(Exception e){
				throw(new DataException(2));
			}
			if(quantity<1)
				throw(new DataException(5));
			else if(quantity>5000)
				throw(new DataException(6));
			
			JOptionPane.showMessageDialog(null,"Valid entry.");
		}
		catch(DataException error){
			JOptionPane.showMessageDialog(null,error.getMessage());
		}
	}
}