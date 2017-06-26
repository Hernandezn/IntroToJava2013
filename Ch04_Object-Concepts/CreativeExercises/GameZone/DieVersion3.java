public class DieVersion3{
	private int roll;
	private final int HIGHEST_DIE_VALUE=6;
	private final int LOWEST_DIE_VALUE=1;
	
	public Die(){
		roll=(int)(Math.random()*600.0)%HIGHEST_DIE_VALUE
			+LOWEST_DIE_VALUE;
	}
	
	public void reroll(){
		roll=(int)(Math.random()*600.0)%HIGHEST_DIE_VALUE
			+LOWEST_DIE_VALUE;
	}
	
	public int getRoll(){
		return roll;
	}
	
	public int rerollReturn(){
		int x;
		reroll();
		x=getRoll();
		return x;
	}
}