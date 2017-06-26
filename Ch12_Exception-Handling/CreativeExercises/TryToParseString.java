public class TryToParseString{
	public static void main(String[]args){
		String test="3a";
		int num;
		
		try{
			num=Integer.parseInt(test);
			System.out.println(num);
		}
		catch(NumberFormatException error){
			System.out.println("That's not an integer!");
		}
	}
}