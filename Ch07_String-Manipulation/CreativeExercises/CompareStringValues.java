public class CompareStringValues{
	public static void main(String[]args){
		String a="A";
		String b="B";
		String y="Aa";
		String z="Ab";
		
		System.out.println("String a is "+a+", b is "+b+", y is "+y+
			", and z is "+z+".");
		
		int num=a.compareTo(a);
		System.out.println("Comparing "+a+" to "+a+" gives an output of "+
			num+" because they're both alphabetically the same.");
		
		num=a.compareTo(b);
		System.out.println("Comparing "+a+" to "+b+" gives "+num+
			" because "+a+" is alphabetically "+num+" compared to "+b+".");
		
		num=z.compareTo(y);
		System.out.println("Comparing "+z+" to "+y+" outputs "+num+
			" because "+z+" is alphabetically "+num+" more than "+y+".");
	}
}