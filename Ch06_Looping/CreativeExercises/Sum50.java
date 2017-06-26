public class Sum50{
	public static void main(String[]args){
		int num;
		int val=0;
		final int LIMIT=50;
		
		for(num=1; num<=LIMIT; num++)
			val += num;
		
		System.out.println("The sum of all numbers from 1 to "+LIMIT+
			" is "+val+".");
	}
}