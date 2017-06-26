public class Vehicle{
	private int wheels;
	private int mpg;
	
	public Vehicle(int num, int milesPerGallon){
		wheels=num;
		mpg=milesPerGallon;
	}
	
	public String toString(){
		String s=wheels+" wheels, "+mpg+" average miles per gallon";
		return s;
	}
}