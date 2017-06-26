import java.util.Scanner;
import java.util.Arrays;

public class Median2{
	public static void main(String[]args){
		double[]values=new double[9];
		Scanner input=new Scanner(System.in);
		int x;
		double data;
		int entries=0;
		int med1, med2;
		double median;
		final double ABORT=999.999;
		
		for(x=0; x<values.length; x++){
			System.out.print("You can enter up to "+(values.length-x)+" more number"+
				"(s).\nPlease enter a number, or enter "+ABORT+" to finish entering "+
				"numbers > ");
			data=input.nextDouble();
			if(data!=ABORT){
				values[x]=data;
				entries++;
			}
			else
				x=values.length;
		}
		System.out.println("The values are:");
		for(x=0; x<entries; x++)
			System.out.print(values[x]+" ");
		
		Arrays.sort(values, 0, entries);
		System.out.println("\nSorted, their values are:");
		for(x=0; x<entries; x++)
			System.out.print(values[x]+" ");
		
		med1=entries/2;
		if(entries%2 == 0){
			med2=(entries/2)-1;
			median=(values[med1]+values[med2]) / 2.0;
		}
		else
			median=values[med1];
		
		System.out.println("\nTheir median is "+median+".");
	}
}