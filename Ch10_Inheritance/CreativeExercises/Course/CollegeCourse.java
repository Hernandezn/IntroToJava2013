public class CollegeCourse{
	protected String dept;
	protected int courseNum;
	protected int creditHrs;
	protected double courseFee;
	
	public CollegeCourse(String department, int course, int credits){
		dept=department;
		courseNum=course;
		creditHrs=credits;
		
		courseFee=creditHrs*120.0;
	}
	
	public void display(){
		System.out.println(dept+" "+courseNum+" is worth "+creditHrs+
			" credits, invoking a course fee of $"+courseFee+".");
	}
}