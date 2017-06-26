import javax.swing.JOptionPane;

public class Quiz{
	
	public static void main(String[]args){
		int correctAnswers=0;
		
		int first=Integer.parseInt(JOptionPane.showInputDialog(null,
			"What is 9 multiplied by 7?"));
		
		if (first==9*7)
			correctAnswers=correctAnswers+1;
		
		int second=Integer.parseInt(JOptionPane.showInputDialog(null,
			"What's a number lower than 19?"));
		
		if (second<19)
			correctAnswers=correctAnswers+1;
		
		int third=Integer.parseInt(JOptionPane.showInputDialog(null,
			"When you divide 32 by 6, what is the remainder?"));
		
		if (third==32%6)
			correctAnswers=correctAnswers+1;
		
		if (correctAnswers==3)
			perfect();
		else
			score(correctAnswers);
	}
	
	public static void score(int num){
		JOptionPane.showMessageDialog(null,"You got "+num+
			" of the answers correct.");
	}
	public static void perfect(){
		JOptionPane.showMessageDialog(null,"Congratulations! you made a"+
			" perfect score.");
	}
}