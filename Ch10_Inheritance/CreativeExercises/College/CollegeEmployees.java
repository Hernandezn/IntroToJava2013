import javax.swing.JOptionPane;

public class CollegeEmployees{
	public static void main(String[]args){
		Person[]collegiate=new Person[14];
		int studentCount=7;
		int facultyCount=3;
		int employeeCount=4;
		char type;
		boolean b=false;
		int num=0;
		
		for(Person temp: collegiate)
			temp=new Person();
		
		do{
			do{
				type=Character.toUpperCase(JOptionPane.showInputDialog(null,"Which "+
					"type of collegiate's data are you entering?\nCollege employee, faculty"+
					", student, or enter \"Q\" to quit.").charAt(0));
				
				if(type=='Q' || type=='C' || type=='F' || type=='S')
					b=true;
			}while(!b);
			
			if(type=='C')
				if(employeeCount>0){
					collegiate[num]=new CollegeEmployee();
					collegiate[num].setData();
					employeeCount--;
					num++;
					}
				else
					JOptionPane.showMessageDialog(null,"All employees are already "+
						"accounted for.");
			else if(type=='F')
				if(facultyCount>0){
					collegiate[num]=new Faculty();
					collegiate[num].setData();
					facultyCount--;
					num++;
					}
				else
					JOptionPane.showMessageDialog(null,"All faculty is already "+
						"accounted for.");
			else if(type=='S')
				if(studentCount>0){
					collegiate[num]=new Student();
					collegiate[num].setData();
					studentCount--;
					num++;
					}
				else
					JOptionPane.showMessageDialog(null,"All relevant students are "+
						"already accounted for.");
		}while(type!='Q' && num<collegiate.length);
		
		System.out.println("Students:");
		for(Person temp: collegiate)
			if(temp instanceof Student)
				temp.display();
		
		System.out.println("\nCollege employees:");
		for(Person temp: collegiate)
			if(temp instanceof CollegeEmployee && !(temp instanceof Faculty))
				temp.display();
		
		System.out.println("\nFaculty:");
		for(Person temp: collegiate)
			if(temp instanceof Faculty)
				temp.display();
		
		System.out.println("\nPersons not accounted for:");
		System.out.println(employeeCount+" employees, "+facultyCount+
			" faculty members, and "+studentCount+" students.");
	}
}