import java.util.Arrays;

public class SortDoubles{
	public static void main(String[]args){
		double[]values={-8.9,-4.5, -6.7,-2.3, 2.1, -.1, 4.3, 8.7, 6.5,10.9,
			-11.1,13.1, -13.3,15.3,-15.5};
		int x;
		
		System.out.println("The values are:");
		for(x=0; x<values.length; x++)
			System.out.print(values[x]+" ");
		
		Arrays.sort(values);
		
		System.out.println("\nSorted, the values are:");
		for(x=0; x<values.length; x++)
			System.out.print(values[x]+" ");
	}
}