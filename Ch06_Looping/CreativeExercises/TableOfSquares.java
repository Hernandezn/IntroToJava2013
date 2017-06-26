public class TableOfSquares{
	public static void main(String[]args){
		int num;
		int val;
		final int LIMIT=20;
		
		for(num=1; num<=LIMIT; ++num){
			val=(int)Math.pow(num,2);
			System.out.println(num+" squared is "+val+".");
		}
	}
}