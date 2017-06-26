public class FlipCoin2{
	public static void main(String[]args){
		double result;
		int headCount=0;
		int tailCount=0;
		final int LIMIT=1000;
		double headPercent, tailPercent;
		
		System.out.println("One thousand coin tosses...");
		
		for(int num=LIMIT; num>0; num--){
			result=Math.random();
			if(result>0.5)
				tailCount++;
			else
				headCount++;
		}
		
		headPercent=((double)headCount/(double)LIMIT)*100;
		tailPercent=((double)tailCount/(double)LIMIT)*100;
		
		System.out.println(headPercent+"% of the coin tosses were "+
			"heads, "+tailPercent+"% were tails.");
	}
}