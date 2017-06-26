import java.util.Scanner;
import java.util.Arrays;

public class Median{
	public static void main(String[]args){
		double[]values=new double[9];
		Scanner input=new Scanner(System.in);
		int x;
		final int MEDIAN_POSITION=values.length/2;
		
		for(x=0; x<values.length; x++){
			System.out.print("You'll need to enter "+(values.length-x)+
				" more number(s).\nPlease enter a number > ");
			values[x]=input.nextDouble();
		}
		System.out.println("The values are:");
		for(x=0; x<values.length; x++)
			System.out.print(values[x]+" ");
		
		Arrays.sort(values);
		System.out.println("\nSorted, their values are:");
		for(x=0; x<values.length; x++)
			System.out.print(values[x]+" ");
		System.out.println("\nTheir median is "+values[MEDIAN_POSITION]+".");
	}
}