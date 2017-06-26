import java.util.Scanner;

public class Time2{
	public static void main(String[]args){
		Scanner keyStrokes=new Scanner(System.in);
		System.out.println("Please enter the employee's minutes worked: ");
		int minutes=keyStrokes.nextInt();
		System.out.println("This employee has worked for a total of "
			+minutes/60+" hours and "+minutes%60+" minutes.");
	}
}