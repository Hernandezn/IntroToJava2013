import javax.swing.JOptionPane;

public class CollegeEmployee extends Person{
	private int ssn;
	private int annualSalary;
	private String department;
	
	public void setData(){
		super.setData();
		
		ssn=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter social security"+
			" number:"));
		annualSalary=Integer.parseInt(JOptionPane.showInputDialog(null,"What is "+
			"the annual salary?"));
		department=JOptionPane.showInputDialog(null,"Enter the department name:");
	}
	
	public void display(){
		super.display();
		
		System.out.println("SSN "+ssn+", in "+department+"department");
	}
}