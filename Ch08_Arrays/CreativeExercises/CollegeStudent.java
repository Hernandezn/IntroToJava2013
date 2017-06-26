public class CollegeStudent{
	private int studentID;
	private CollegeCourse[]course=new CollegeCourse[5];
	
	public void setStudentID(int IDnum){
		studentID=IDnum;
	}
	public int getStudentID(){
		return studentID;
	}
	
	public void setCourse(CollegeCourse instruction, int position){
		course[position]=instruction;
	}
	public CollegeCourse getCourse(int position){
		return course[position];
	}
}