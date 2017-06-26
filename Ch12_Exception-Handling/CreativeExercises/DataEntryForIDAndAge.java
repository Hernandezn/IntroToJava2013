import javax.swing.*;

public class DataEntryForIDAndAge{
	public static void main(String[]args){
		final int MAX_ID=999;
		final int MIN_ID=0;
		final int MAX_AGE=119;
		final int MIN_AGE=0;
		String entry;
		int id, age;
		boolean done=false;
		
		do{
			try{
				entry=JOptionPane.showInputDialog(null,"Please enter the applicant's"+
				" ID number.\nEnter 0 in both fields to quit.");
				id=Integer.parseInt(entry);
				if(id<MIN_ID || id>MAX_ID)
					throw(new DataEntryException(id+" is outside the range of valid "+
						"IDs."));
				
				entry=JOptionPane.showInputDialog(null,"Please enter applicant "+id+
					"'s age.");
				age=Integer.parseInt(entry);
				if(age<MIN_AGE || age>MAX_AGE)
					throw(new DataEntryException(age+" isn't a valid age."));
				
				if(id==MIN_ID && age==MIN_AGE)
					done=true;
				else
					JOptionPane.showMessageDialog(null,"Applicant "+id+", age "+age+
						" has been successfully registered.");
			}
			catch(DataEntryException error){
				JOptionPane.showMessageDialog(null,error.getMessage());
			}
			catch(Exception error){
				JOptionPane.showMessageDialog(null,"That's not a valid numeric entry.");
			}
		}while(!done);
	}
}