public class FlipCoin{
	public static void main(String[]args){
		double result;
		int headCount=0;
		int tailCount=0;
		final int LIMIT=10;
		double headPercent, tailPercent;
		
		System.out.println("Ten coin tosses...");
		
		for(int num=LIMIT; num>0; num--){
			result=Math.random();
			if(result>0.5){
				System.out.println("Tails.");
				tailCount++;
			}
			else{
				System.out.println("Heads.");
				headCount++;
			}
		}
		
		headPercent=((double)headCount/(double)LIMIT)*100;
		tailPercent=((double)tailCount/(double)LIMIT)*100;
		
		System.out.println(headPercent+"% of the coin tosses were "+
			"heads, "+tailPercent+"% were tails.");
	}
}