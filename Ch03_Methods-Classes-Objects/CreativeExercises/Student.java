public class Student{
	private long studentID;
	private int creditHrs;
	private int points;
	private float gradePointAvg;
	
	public void setStudentID(long num){
		studentID=num;
	}
	public void displayStudentID(){
		System.out.print("Student ID "+studentID);
	}
	
	public void setCreditHrs(int num){
		creditHrs=num;
	}
	public void displayCreditHrs(){
		System.out.print(creditHrs+" credit hours");
	}
	
	public void setPoints(int num){
		points=num;
	}
	public void displayPoints(){
		System.out.print(points+" quality points");
	}
	
	public void setGradePointAvg(){
		gradePointAvg=(float)points/(float)creditHrs;
	}
	public void displayGradePointAvg(){
		System.out.print(gradePointAvg+" GPA");
	}
}