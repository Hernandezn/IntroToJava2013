import java.util.*;

public class NegativeArray{
	public static void main(String[]args){
		Scanner input=new Scanner(System.in);
		int size;
		byte[]test;
		
		System.out.print("Enter a number to use as an array size > ");
		
		try{
			size=input.nextInt();
			test=new byte[size];
			System.out.println("Array created successfully!");
		}
		catch(Exception error){
			System.out.println("That's not a valid value; the array couldn't be "+
				"created.");
		}
	}
}