public class EvenNums{
	public static void main(String[]args){
		int num;
		final int LIMIT=100;
		
		System.out.println("All even numbers from 1 to 100:");
		
		for(num=2; num<=LIMIT; ++num){
			if(num%2 == 0)
				System.out.print(num+" ");
			if(num%20 == 0)
				System.out.println();
		}
	}
}