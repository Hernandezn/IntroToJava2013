import java.util.Scanner;

public class PartTime extends Student{
	private Scanner input=new Scanner(System.in);
	private int creditHrs;
	
	public PartTime(){
		fullTime=false;
		
		System.out.println("What is the student's name?");
		setName(input.nextLine());
		System.out.println("How many credit hours is the student enrolled for?");
		setCreditHours(input.nextInt());
		setTuition();
	}
	
	public void setCreditHours(int num){
		creditHrs=num;
	}
	public int getCreditHours(){
		return creditHrs;
	}
	
	public void setTuition(){
		tuition=creditHrs*200;
	}
}