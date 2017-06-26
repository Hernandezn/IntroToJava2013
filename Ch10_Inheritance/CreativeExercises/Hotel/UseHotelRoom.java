public class UseHotelRoom{
	public static void main(String[]args){
		HotelRoom travelers=new HotelRoom(212);
		Suite vacationers=new Suite(319);
		
		System.out.println("The travelers' hotel room, "+travelers.getRoom()+
			", has a rental rate of $"+travelers.getRate()+".");
		
		System.out.println("The vacationers' suite, room "+vacationers.getRoom()+
			", has a rental rate of $"+vacationers.getRate()+".");
	}
}