public class TestMethods{

	public static void main(String[]args){
		int var1=19;
		int var2=-37;
		
		displayIt(var1);
		displayItTimesTwo(var1);
		displayItPlusOneHundred(var1);
		
		System.out.println();
		
		displayIt(var2);
		displayItTimesTwo(var2);
		displayItPlusOneHundred(var2);		
	}
	
	public static void displayIt(int num){
		System.out.println("The entered value is "+num+".");
	}
	
	public static void displayItTimesTwo(int num){
		System.out.println("The entered value times two is "+num*2+".");
	}
		
	public static void displayItPlusOneHundred(int num){
		System.out.println("The entered value plus one hundred is "+
			(num+100)+".");
	}
}