public class DemoStringBuilder{
	public static void main(String[]args){
		StringBuilder str=new StringBuilder("singing");
		print(str);
		
		str.append(" in the dead of");
		print(str);
		str.insert(0, "Black");
		print(str);
		str.insert(5, "bird ");
		print(str);
		str.append(" night");
		print(str);
		
//		char c='n';
//		char d='o';
//		String name1=new String("West Side Story");
//		String name2=new String("Jore");
//		String x=Character.toString(d);
//		
//		System.out.println(x);
	}
	
	public static void print(StringBuilder s){
		System.out.println(s);
	}
}