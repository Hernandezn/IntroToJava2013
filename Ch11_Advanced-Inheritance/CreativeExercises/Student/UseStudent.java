public class UseStudent{
	public static void main(String[]args){
		FullTime pupil=new FullTime();
		
		System.out.println("Student "+pupil.getName()+"'s tuition is "+
			pupil.getTuition()+".");
		System.out.println();
		
		PartTime student=new PartTime();
		
		System.out.println("Student "+student.getName()+"'s tuition is "+
			student.getTuition()+". S/he is attending for "+student.getCreditHours()+
			" credit hours.");
	}
}