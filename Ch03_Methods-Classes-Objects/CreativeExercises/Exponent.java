import java.util.Scanner;

public class Exponent{
	public static void main(String[]args){
		Scanner input=new Scanner(System.in);
		int entry;
		
		System.out.print(
			"Please enter the number you wish to multiply by itself: ");
		entry=input.nextInt();
		
		System.out.println("\nThat number squared is "+square(entry)+
			".\nThe number cubed is "+cube(entry)+".");
	}
	
	public static int square(int num){
		int ans=num*num;
		return ans;
	}
	
	public static int cube(int num){
		int ans=num*num*num;
		return ans;
	}
}