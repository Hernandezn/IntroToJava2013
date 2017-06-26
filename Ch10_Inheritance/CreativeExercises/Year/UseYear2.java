import java.util.Scanner;

public class UseYear2{
	public static void main(String[]args){
		Year2 birth=new Year2();
		LeapYear2 death=new LeapYear2();
		Scanner input=new Scanner(System.in);
		String entry;
		int elapsed;
		
		System.out.print("Birth year: ");
		birth.getDays();
		System.out.print("Enter a month of birth > ");
		entry=input.nextLine();
		System.out.print("Enter the day of month > ");
		elapsed=birth.daysElapsed(entry, input.nextInt());
		System.out.println("That was "+elapsed+" days into its year.\n");
		
		input.nextLine();
		
		System.out.print("Death year: ");
		death.getDays();
		System.out.print("Enter a month of death > ");
		entry=input.nextLine();
		System.out.print("Enter the day of month > ");
		elapsed=death.daysElapsed(entry, input.nextInt());
		System.out.println("That was "+elapsed+" days into its year.");
	}
}