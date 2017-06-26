public class DemoBlock{
	public static void main(String[]args){
		System.out.println("Demonstrating block scope...");
		
		int x=1111;
		System.out.println("In the first block, x is "+x+".");
		
		{
			int y=2222;
			System.out.println("In the second block, x is "+x+".");
			System.out.println("In the second block, y is "+y+".");
		}
		
		{
			int y=3333;
			System.out.println("In the third block, x is "+x+".");
			System.out.println("In the third block, y is "+y+".");
			demoMethod();
			System.out.println("Post-method, x is "+x+".");
			System.out.println("Post-method, y is "+y+".");
		}
		
		System.out.println("At the end, x is "+x+".");
	}
	
	public static void demoMethod(){
		int x=8888,y=9999;
		System.out.println("In the demo method, x is "+x+".");
		System.out.println("In the demo method, y is "+y+".");
	}
}