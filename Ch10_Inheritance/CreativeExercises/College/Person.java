import javax.swing.JOptionPane;

public class Person{
	private String firstName;
	private String lastName;
	private String address;
	private int zip;
	private long phoneNumber;
	
	public void setData(){
		
		firstName=JOptionPane.showInputDialog(null,"Enter first name:");
		lastName=JOptionPane.showInputDialog(null,"Enter "+firstName+"'s last name:");
		address=JOptionPane.showInputDialog(null,"Enter "+firstName+" "+lastName+
			"'s street address:");
		zip=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter ZIP code:"));
		phoneNumber=Long.parseLong(JOptionPane.showInputDialog(null,"Enter "+firstName
			+"'s phone number:"));
	}
	
	public void display(){
		System.out.println(firstName+" "+lastName+", "+address+", ZIP code "+zip+
			", phone number "+phoneNumber);
	}
}