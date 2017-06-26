import java.util.Scanner;

public class UseCourse{
	public static void main(String[]args){
		Scanner input=new Scanner(System.in);
		String dept;
		int course;
		int credits;
		boolean b=false;
		int x;
		String[]labs={"BIOL","CHEM","COMP","PHYS"};
		CollegeCourse instruction=new CollegeCourse(null,0,0);
		
		do{
			System.out.print("In what department is the course? ");
			dept=input.nextLine();
			
			if(dept.length()>=4){
				dept=dept.charAt(0)+""+dept.charAt(1)+""+dept.charAt(2)+""+
					dept.charAt(3);
				dept=dept.toUpperCase();
				b=true;
			}
		}while(!b);
		
		System.out.print("Enter the course number > ");
		course=input.nextInt();
		
		System.out.print("Enter the credit hours in the course > ");
		credits=input.nextInt();
		
		for(x=0; x<labs.length; x++)
			if(dept.equals(labs[x])){
				instruction=new LabCourse(dept, course, credits);
				b=false;
			}
		
		if(b)
			instruction=new CollegeCourse(dept, course, credits);
		
		instruction.display();
	}
}