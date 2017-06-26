import java.util.*;

public class SqrtException{
	public static void main(String[]args){
		Scanner input=new Scanner(System.in);
		double entry;
		double num;
		
		System.out.print("Enter a value to find its square root > ");
		try{
			entry=input.nextDouble();
			if(entry<0)
				throw(new ArithmeticException());
			num=Math.sqrt(entry);
			System.out.println(num);
		}
		catch(ArithmeticException error){
			System.out.println("Negative numbers don't have square roots!");
		}
		catch(InputMismatchException error){
			System.out.println("That's not a valid number.");
		}
	}
}