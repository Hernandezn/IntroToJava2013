import java.util.Scanner;

public class CountVowels2{
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
			if(quote.charAt(x)=='a' || quote.charAt(x)=='e' ||
				quote.charAt(x)=='i' || quote.charAt(x)=='o' ||
				quote.charAt(x)=='u')
				count++;
			else if(Character.isLetter(quote.charAt(x)))
				cons++;
		
		System.out.println("\nThere are "+count+" vowels in this string.");
		System.out.println("There are "+cons+" consonsants.");
	}
}