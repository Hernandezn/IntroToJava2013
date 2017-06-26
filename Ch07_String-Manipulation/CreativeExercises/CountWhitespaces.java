public class CountWhitespaces{
	public static void main(String[]args){
		int x;
		int count=0;
		int cons=0;
		String quote="I like pie.";
		
		System.out.println(quote);
		
		for(x=0; x<quote.length(); x++)
			if(Character.isWhitespace(quote.charAt(x)))
				count++;
		
		System.out.println("\nThere are "+count+
			" white spaces in this string.");
	}
}