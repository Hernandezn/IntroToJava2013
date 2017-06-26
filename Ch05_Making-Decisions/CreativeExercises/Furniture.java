import javax.swing.JOptionPane;

public class Furniture{
	public static void main(String[]args){
		double price;
		String woodType;
		final double PINE_PRICE=100.00;
		final double OAK_PRICE=225.00;
		final double MAHOGANY_PRICE=310.00;
		
		int woodInput=Integer.parseInt(JOptionPane.showInputDialog(null,
			"What type of wood would you like your table to be made of?"+
			"\n\nChoose 1 for pine, 2 for oak, or 3 for mahogany."));
		
		switch(woodInput){
			case 1:
				woodType="pine";
				price=PINE_PRICE;
				break;
			case 2:
				woodType="oak";
				price=OAK_PRICE;
				break;
			case 3:
				woodType="mahogany";
				price=MAHOGANY_PRICE;
				break;
			default:
				woodType="invalid";
				price=0;
		}
		
		JOptionPane.showMessageDialog(null,"You've chosen a(n) "+woodType+
			" table, the price of which will be "+price+".");
	}
}