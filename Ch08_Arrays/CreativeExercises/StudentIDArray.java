import javax.swing.JOptionPane;

public class StudentIDArray{
	public static void main(String[]args){
		int[]idNums={      1111,   1234,  5678,    9012,    3456,   7890,
			   2345,     6789,    4567,  8901};
		String[]names={"Xavier","Parsi","Andy","Krista","Austin","Jacob",
			"Blair","Chester","Lauren","Anne"};
		double[]gpa={      3.95,   4.00,  3.22,    2.92,    3.19,   4.00,
			   2.72,     2.67,    3.77,  3.06};
		int input;
		boolean b=false;
		int x;
		
		do{
			input=Integer.parseInt(JOptionPane.showInputDialog(null,
				"Please enter your student's ID number."));
			
			for(x=0; x<idNums.length; x++)
				if(input==idNums[x]){
					JOptionPane.showMessageDialog(null,"Student "+input+", "+
						names[x]+", has a GPA of "+gpa[x]+".");
					b=true;
				}
			
			if(!b)
				JOptionPane.showMessageDialog(null,input+" is an invalid ID"+
					" number. Please refine your search.","Invalid ID",
					JOptionPane.ERROR_MESSAGE);
		}while(!b);
	}
}