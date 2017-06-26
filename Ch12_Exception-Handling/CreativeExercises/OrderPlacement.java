import javax.swing.*;

public class OrderPlacement{
	public static void main(String[]args){
		int[]stock={111,222,333,444};
		double[]price={.89,1.47,2.43,5.99};
		String entry;
		int itemNum, quantity, x, position=0;
		boolean invalid=true;
		
		try{
			entry=JOptionPane.showInputDialog(null,"Please enter an item number to "+
				"be ordered.");
			try{
				itemNum=Integer.parseInt(entry);
			}
			catch(Exception e){
				throw(new OrderException(1));
			}
			if(itemNum<0)
				throw(new OrderException(2));
			else if(itemNum>9999)
				throw(new OrderException(3));
			else
				for(x=0; x<stock.length; x++)
					if(itemNum==stock[x]){
						position=x;
						invalid=false;
						x=stock.length;
					}
			if(invalid)
				throw(new OrderException(4));
			
			entry=JOptionPane.showInputDialog(null,"How many of item "+itemNum+
				" would you like?");
			try{
				quantity=Integer.parseInt(entry);
			}
			catch(Exception e){
				throw(new OrderException(5));
			}
			if(quantity<1)
				throw(new OrderException(6));
			else if(quantity>12)
				throw(new OrderException(7));
			
			JOptionPane.showMessageDialog(null,"You've ordered "+quantity+" of item "+
				itemNum+", which has a unit price of $"+price[position]+".\nYour total"+
				" order price is $"+(price[position]*quantity)+".");
		}
		catch(OrderException error){
			JOptionPane.showMessageDialog(null,error.getMessage());
		}
	}
}