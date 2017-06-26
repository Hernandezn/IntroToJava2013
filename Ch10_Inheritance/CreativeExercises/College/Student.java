import javax.swing.JOptionPane;

public class Student extends Person{
	private String major;
	private double gpa;
	
	public void setData(){
		super.setData();
		
		major=JOptionPane.showInputDialog(null,"Enter major field of study:");
		gpa=Double.parseDouble(JOptionPane.showInputDialog(null,"Enter GPA:"));
	}
	
	public void display(){
		super.display();
		
		System.out.println("Majoring in "+major+", GPA of "+gpa);
	}
}