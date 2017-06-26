public class MathTest{
	public static void main(String[]args){
		double square=Math.sqrt(30);
		double sine=Math.sin(100);
		double cosine=Math.cos(100);
		double floor=Math.floor(44.7);
		double ceiling=Math.ceil(44.7);
		double round=Math.round(44.7);
		double larger=Math.max('K',70);
		double smaller=Math.min('K',70);
		double random=Math.random()*10.0;
		
		System.out.println("The square root of 30 is "+square+".");
		System.out.println("The sine of 100 is "+sine+", and its cosine is "
			+cosine+".");
		System.out.println("The floor of 44.7 is "+floor+", its ceiling is "
			+ceiling+", and the number, rounded, is "+round+".");
		System.out.println("Among the number 70 and the character\"K\", "+
			larger+" is the larger, and "+smaller+" is the smaller.");
		System.out.println("A random number between zero and ten is "+
			random+".");
	}
}