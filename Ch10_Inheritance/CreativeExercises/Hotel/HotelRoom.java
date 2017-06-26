public class HotelRoom{
	private int room;
	protected double rate;
	
	public HotelRoom(int num){
		room=num;
		if(num<300)
			rate=69.95;
		else
			rate=89.95;
	}
	
	public int getRoom(){
		return room;
	}
	public double getRate(){
		return rate;
	}
}