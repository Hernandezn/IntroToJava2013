/*This class is not integrated with the others;
the book instructions seemed less practical than the implementation I made.
However impractical the current application seems, it was nearly unmanageable
when I tried integrating this class.*/
public class Gadget{
	private int itemNum;
	private String description;
	private double price;
	
	public Gadget(int num, String s, double cost){
		itemNum=num;
		description=s;
		price=cost;
	}
	
	public int getID(){
		return itemNum;
	}
	public String getDescription(){
		return description;
	}
	public double getPrice(){
		return price;
	}
}