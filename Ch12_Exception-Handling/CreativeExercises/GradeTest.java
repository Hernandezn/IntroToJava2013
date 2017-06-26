import javax.swing.*;

public class GradeTest{
	public static void main(String[]args){
		int[]ids={1234,5678,9012,3456,7890,2345,6789,1111,7777,8888};
		String entry;
		char data[]=new char[ids.length];
		boolean invalid;
		int x, y;
		
		for(x=0; x<ids.length; x++){
			invalid=true;
			entry=JOptionPane.showInputDialog(null,"Please enter student "+ids[x]+
				"'s letter grade.");
			try{
				data[x]=Character.toUpperCase(entry.charAt(0));
				for(y=0; y<GradeException.valid.length; y++)
					if(data[x]==GradeException.valid[y]){
						invalid=false;
						y=GradeException.valid.length;
					}
			
			if(invalid)
				throw(new GradeException(data[x]));
			}
			catch(GradeException error){
				JOptionPane.showMessageDialog(null,error.getMessage());
				data[x]='I';
			}
		}
		
		entry="";
		for(x=0; x<ids.length; x++)
			entry+="\nStudent "+ids[x]+" has a grade of "+data[x];
		
		JOptionPane.showMessageDialog(null,"The students' grades are as follows:"+
			entry);
	}
}