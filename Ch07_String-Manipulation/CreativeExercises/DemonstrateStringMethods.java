public class DemonstrateStringMethods{
	public static void main(String[]args){
		String quote="\"It is better to deserve honours and not have them"+
			" than to have them and not deserve them.\"\n\t--Mark Twain";
		
		System.out.println("The entered String:\n"+quote+"\n");
		
		int x=quote.indexOf('h');
		
		System.out.println("The 'h' first appears at value "+x+".");
		
		char y=quote.charAt(14);
		
		System.out.println("The 14th-position character is "+y+".");
		
		boolean z=quote.endsWith("Twain");
		
		System.out.println("The judgement of whether the String ends with"+
			" \"Twain\" comes out "+z+".");
		
		String alpha=quote.replace('a','A');
		
		System.out.println("After capitalizing all lower-case 'a's, the "+
			"String becomes:\n"+alpha);
	}
}