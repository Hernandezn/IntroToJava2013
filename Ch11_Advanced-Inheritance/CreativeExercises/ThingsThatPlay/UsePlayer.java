public class UsePlayer{
	public static void main(String[]args){
		Child kid=new Child();
		Actor hack=new Actor();
		Musician aspiration=new Musician();
		
		System.out.println("Childplay:");
		kid.play();
		System.out.println("Actor playing:");
		hack.play();
		System.out.println("Musician plays:");
		aspiration.play();
	}
}