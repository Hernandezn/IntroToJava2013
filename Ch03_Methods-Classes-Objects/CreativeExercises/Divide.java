import java.util.Scanner;

public class Divide{
	public static void main(String[]args){
		Scanner input=new Scanner(System.in);
		
		System.out.print(
			"What integer would you like to be the numerator? ");
		int top=input.nextInt();
		
		System.out.print(
			"What integer will be your divisor? ");
		int bot=input.nextInt();
		
		divideCalc(top,bot);
	}
	
	public static void divideCalc(int num,int div){
		int division=num/div;
		int remainder=num%div;
		
		System.out.println(num+" divided by "+div+" is "+division+
			" with a remainder of "+remainder+".");
	}
}