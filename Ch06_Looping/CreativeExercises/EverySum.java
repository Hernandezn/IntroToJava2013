public class EverySum{
	public static void main(String[]args){
		int num;
		int val=0;
		final int LIMIT=50;
		
		for(num=1; num<=LIMIT; num++){
			val += num;
			System.out.println("sum of numbers from 1 to "+num+
				": "+val+".");
		}
		
	}
}