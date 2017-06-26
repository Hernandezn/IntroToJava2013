import java.util.Scanner;

public class FullTime extends Student{
	private Scanner input=new Scanner(System.in);
	
	public FullTime(){
		setTuition();
		fullTime=true;
		
		System.out.println("What is the student's name?");
		setName(input.nextLine());
	}
	
	public void setTuition(){
		tuition=2000;
	}
}