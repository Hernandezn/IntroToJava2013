import javax.swing.JOptionPane;
public class RandomGuess{
	public static void main(String[]args){
		JOptionPane.showMessageDialog(null,"I'm thinking of a number between 1 and 10.");
			/*NOTE: The next feature is ripped by the programmer,
			not actually meant to be a known value at this level.*/
		JOptionPane.showMessageDialog(null,"The number is "+(1+(int)(Math.random()*10)));
	}
}