import javax.swing.JOptionPane;

public class EmployeeIDArray{
	public static void main(String[]args){
		int[]empNum={           1,        2,      3,      4,    5,     6,
			       7,      8,      9,     10,     11,      12,     13,
			       14,   15,      16,     17,      18,     19,    20};
		String[]employee={"Runik","Dimensi","Parsi","Rivas","Lee","Lyra",
			"Tropis","Moku","Zenca","Dumas","Gallo","Cicero","Klein",
			"Scarlet","May","Garcia","Posey","Scelus","Vayne","Meek"};
		int id;
		boolean b=false;
		int x;
		
		do{
			id=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter an"+
				" employee number to look up that employee's last name."));
			
			for(x=0; x<employee.length; x++)
				if(id==empNum[x]){
					JOptionPane.showMessageDialog(null,"That employee is "+
						"Mr./M(r)s. "+employee[x]+".");
					b=true;
					x=employee.length;
				}
			
			if(!b)
				JOptionPane.showMessageDialog(null,"That isn't a valid "+
					"employee ID.");
		}while(!b);
	}
}