import javax.swing.JOptionPane;

public class PizzaTester{
	public static void main(String[]args){
		Pizza selector=new Pizza();
		
		String topping=JOptionPane.showInputDialog(null,
			"What toppings are desired?","List your toppings",
			JOptionPane.QUESTION_MESSAGE);
		int diameter=Integer.parseInt(JOptionPane.showInputDialog(null,
			"How many inches should the pizza's diameter be?",
			"Pizza size",JOptionPane.QUESTION_MESSAGE));
		double price=Double.parseDouble(JOptionPane.showInputDialog(null,
			"What's the price of the order?","Order pricing",
			JOptionPane.QUESTION_MESSAGE));
			
		selector.setToppings(topping);
		selector.setSize(diameter);
		selector.setPrice(price);
		
		JOptionPane.showConfirmDialog(null,
			"The order constitutes the topping(s) "+selector.getToppings()+
			", a diametric size of "+selector.getSize()+
			" inches, and a price of $"+selector.getPrice()+
			".\n\nIs this correct?","Order confirmation",
			JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE);
	}
}