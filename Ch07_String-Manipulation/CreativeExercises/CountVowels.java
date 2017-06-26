public class CountVowels{
	public static void main(String[]args){
		int x;
		int count=0;
		int cons=0;
		
		String quote="Home is the place, when you have to go there, "+
			"they have to take you in.\n\tRobert Frost";
		
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