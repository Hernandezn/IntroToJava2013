import java.util.Scanner;

public class DemoVariables2{
	public static void main(String[]args){
		int entry;
		Scanner keyboard=new Scanner(System.in);
		System.out.print("Enter an integer: ");
		entry=keyboard.nextInt();
		System.out.println("The entry is "+entry+".");
	}
}