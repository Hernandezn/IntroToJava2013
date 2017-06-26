public class JoinStrings{
	public static void main(String[]args){
		String quoteString="A woman who cries is a woman who's right.";
		String nameString="L. Lawliett";
		String dateString="birthdate unknown, died 2006";
		
		String concatenatedString="\""+quoteString+"\"\n\t"+nameString+
			"\n\t"+dateString;
		
		System.out.println(concatenatedString);
	}
}