import java.util.Scanner;

public class ShowStudent{
	public static void main(String[]args){
		Scanner input=new Scanner(System.in);
		Student studentInfo=new Student();
		
		System.out.print("Please enter the student's ID number: ");
		long IDNum=input.nextLong();
		
		System.out.print("Enter the student's earned credit hours: ");
		int creds=input.nextInt();
		
		System.out.print(
			"How many quality points has the student earned? ");
		int qPnts=input.nextInt();
		
		studentInfo.setStudentID(IDNum);
		studentInfo.setCreditHrs(creds);
		studentInfo.setPoints(qPnts);
		studentInfo.setGradePointAvg();
		
		studentInfo.displayStudentID();
		System.out.print(" has earned a total of ");
		studentInfo.displayCreditHrs();
		System.out.print(" and ");
		studentInfo.displayPoints();
		System.out.print(", earning the student a ");
		studentInfo.displayGradePointAvg();
		System.out.print(".");
	}
}