import java.util.Scanner;

public class CountWhitespaces2{
	public static void main(String[]args){
		int x;
		int count=0;
		int cons=0;
		String quote;
		Scanner input=new Scanner(System.in);
		
		System.out.println("Please enter any string of characters: ");
		quote=input.nextLine();
		
		System.out.println(quote);
		
		for(x=0; x<quote.length(); x++)
			if(Character.isWhitespace(quote.charAt(x)))
				count++;
		
		System.out.println("\nThere are "+count+
			" white spaces in this string.");
	}
}