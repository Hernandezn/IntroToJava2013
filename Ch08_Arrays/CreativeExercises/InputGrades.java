import javax.swing.JOptionPane;

public class InputGrades{
	public static void main(String[]args){
		int x;
		int y;
		int studentNum;
		int creditHours;
		String gradeInput;
		String courseInput;
		char letterGrade;
		CollegeCourse study;
		CollegeStudent[]pupil=new CollegeStudent[10];
		
		for(x=0; x<pupil.length; x++){
			pupil[x]=new CollegeStudent();
			
			studentNum=Integer.parseInt(JOptionPane.showInputDialog(null,
				"Please enter student "+(x+1)+"'s identification number."));
			pupil[x].setStudentID(studentNum);
			
			for(y=0; y<5; y++){
				study=new CollegeCourse();
				
				courseInput=JOptionPane.showInputDialog(null,"Enter course "+
					(y+1)+"'s identification signature for student ID "+
					studentNum+".");
				
				creditHours=Integer.parseInt(JOptionPane.showInputDialog(
					null,"How many credit hours are in course "+courseInput+
					"?"));
				do{
					gradeInput=JOptionPane.showInputDialog(null,"Enter "+
						"student ID "+studentNum+"'s letter grade in course "+
						courseInput+".");
				}while(!(gradeInput.equalsIgnoreCase("A")) &&
					!(gradeInput.equalsIgnoreCase("B")) &&
					!(gradeInput.equalsIgnoreCase("C")) &&
					!(gradeInput.equalsIgnoreCase("D")) &&
					!(gradeInput.equalsIgnoreCase("F")));
				
				letterGrade=gradeInput.charAt(0);
				
				study.setCourseID(courseInput);
				study.setCredHrs(creditHours);
				study.setGrade(letterGrade);
				
				pupil[x].setCourse(study, y);
			}//5-course loop
		}//10-student loop
	}//main
}