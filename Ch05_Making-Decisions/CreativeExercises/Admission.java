import javax.swing.JOptionPane;

public class Admission{
	public static void main(String[]args){
		double gpa=Double.parseDouble(JOptionPane.showInputDialog(null,
			"Please enter your high school GPA number (for example, 3.2)."));
		int score=Integer.parseInt(JOptionPane.showInputDialog(null,
			"What what your score on the college admission test?"));
		
		if(gpa>3.0 && score>60 || score>80)
			JOptionPane.showMessageDialog(null,"Congratulations! You've "+
				"been accepted.");
		else
			JOptionPane.showMessageDialog(null,"We regret to inform you "+
				"that you do not meet the admission criteria\nand have been "
				+"rejected for admission until further notice.");
	}
}