import java.util.Scanner;

public class DemoVariables4{
	public static void main(String[]args){
		double entry;
		double entry2;
		Scanner keyboard=new Scanner(System.in);
		
		System.out.print("Enter an integer: ");
		entry=keyboard.nextDouble();
		
		System.out.print("Enter another integer: ");
		entry2=keyboard.nextDouble();
		
		System.out.println("The first entry is "+entry+
		".\nThe second entry is "+entry2+".");
		System.out.println(entry+" plus "+entry2+" is "
		+(entry+entry2)+".");
		System.out.println(entry+" minus "+entry2+" is "
		+(entry-entry2)+".");
		System.out.println(entry+" times "+entry2+" is "
		+entry*entry2+".");
		System.out.println(entry+" divided by "+entry2+" is "
		+(entry/entry2)+" with a remainder of "+
		(entry%entry2)+".");
	}
}