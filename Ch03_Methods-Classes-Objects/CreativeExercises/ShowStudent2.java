import java.util.Scanner;

public class ShowStudent2{
	public static void main(String[]args){
		Scanner input=new Scanner(System.in);
		Student2 studentInfo=new Student2();
		
		System.out.print("Please enter the student's ID number: ");
		long IDNum=input.nextLong();
		
		System.out.print("Enter the student's earned credit hours: ");
		int creds=input.nextInt();
		
		System.out.print(
			"How many quality points has the student earned? ");
		int qPnts=input.nextInt();
		
		System.out.println(
			"\n!!!This test program resets all values to default in order to test the default values!!!\n");
		
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