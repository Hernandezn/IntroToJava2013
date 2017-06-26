import javax.swing.JOptionPane;

public class Furniture2{
	public static void main(String[]args){
		double price;
		String woodType;
		String tableSize;
		final double PINE_PRICE=100.00;
		final double OAK_PRICE=225.00;
		final double MAHOGANY_PRICE=310.00;
		
		int woodInput=Integer.parseInt(JOptionPane.showInputDialog(null,
			"What type of wood would you like your table to be made of?"+
			"\n\nChoose 1 for pine, 2 for oak, or 3 for mahogany."));
		int sizeInput=Integer.parseInt(JOptionPane.showInputDialog(null,
			"Size would you like your table to be?\n\nChoose 1 for large"+
			" or 2 for small"));
		
		switch(woodInput){
			case 1:
				tableSize=sizeAssign(sizeInput);
				woodType="pine";
				price=PINE_PRICE;
				break;
			case 2:
				tableSize=sizeAssign(sizeInput);
				woodType="oak";
				price=OAK_PRICE;
				break;
			case 3:
				tableSize=sizeAssign(sizeInput);
				woodType="mahogany";
				price=MAHOGANY_PRICE;
				break;
			default:
				tableSize=sizeAssign(sizeInput);
				woodType="invalid";
				price=0;
		}
		
		if(tableSize=="large")
			price=price+35.00;
		
		if((woodInput==1 || woodInput==2 || woodInput==3) &&
			(tableSize=="small" || tableSize=="large"))
			JOptionPane.showMessageDialog(null,"You've chosen a "+tableSize
				+" "+woodType+" table, the price of which will be $"+price
				+".");
		else
			JOptionPane.showMessageDialog(null,
				"You've chosen an invalid table.");
	}
	
	public static String sizeAssign(int sizeNum){
		String size="";
		
		switch(sizeNum){
			case 1:
				size="large";
				break;
			case 2:
				size="small";
				break;
			default:
				size="invalid";
				break;
		}
		
		return size;
	}
}