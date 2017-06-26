public class UseAuto{
	public static void main(String[]args){
		Chevy a=new Chevy();
		Ford b=new Ford();
		
		System.out.println("The first car is a "+a.getMake()+", worth $"+a.getPrice());
		System.out.println();
		System.out.println("The second car is a "+b.getMake()+", worth $"+
			b.getPrice());
	}
}