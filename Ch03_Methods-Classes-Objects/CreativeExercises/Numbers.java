public class Numbers{
	public static void main(String[]args){
		int var1=47,var2=12;
		
		sum(var1,var2);
		System.out.println();
		difference(var1,var2);
	}
	
	public static void sum(int num1,int num2){
		System.out.println("The sum of the two values is "+(num1+num2)+
			".");
	}
	
	public static void difference(int num1,int num2){
		System.out.println("The difference between the two values is "+
			(num1-num2)+".");
	}
}