public class UseYear{
	public static void main(String[]args){
		Year birth=new Year();
		LeapYear death=new LeapYear();
		
		System.out.print("Birth: ");
		birth.getDays();
		
		System.out.print("Death: ");
		death.getDays();
	}
}