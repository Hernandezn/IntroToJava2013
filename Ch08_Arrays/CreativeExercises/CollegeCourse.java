public class CollegeCourse{
	private String courseID;
	private int credHrs;
	private char grade;
	
	public void setCourseID(String sig){
		courseID=sig;
	}
	public String getCourseID(){
		return courseID;
	}
	
	public void setCredHrs(int hours){
		credHrs=hours;
	}
	public int getCredHrs(){
		return credHrs;
	}
	
	public void setGrade(char letter){
		grade=letter;
	}
	public char getGrade(){
		return grade;
	}
}