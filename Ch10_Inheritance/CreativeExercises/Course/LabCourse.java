public class LabCourse extends CollegeCourse{
	
	public LabCourse(String department, int course, int credits){
		super(department, course, credits);
		
		courseFee+=50;
	}
	
	public void display(){
		System.out.print("This is a lab course, adding $50 to the fee. ");
		super.display();
	}
}