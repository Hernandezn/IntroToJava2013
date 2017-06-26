public class CountLetters{
	public static void main(String[]args){
		int x;
		int count=0;
		int cons=0;
		String quote="I like pie.";
		
		System.out.println(quote);
		
		for(x=0; x<quote.length(); x++)
			if(Character.isLetter(quote.charAt(x)))
				count++;
		
		System.out.println("\nThere are "+count+" letters in this string.");
	}
}