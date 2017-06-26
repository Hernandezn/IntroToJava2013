public class Alien{
	protected String element;
	protected double armor;
	protected int range;
	
	public Alien(String s, double percent, int num){
		element=s;
		armor=percent;
		range=num;
	}
	
	public String toString(){
		String s="Element "+element+", "+armor+"% armor, "+range+" range.";
		
		return s;
	}
}