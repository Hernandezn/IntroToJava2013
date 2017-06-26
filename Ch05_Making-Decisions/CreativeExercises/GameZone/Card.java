public class Card{
	private String suit;
	private int value;
	
	public void setSuit(String s){
		suit=s;
	}
	public String getSuit(){
		return suit;
	}
	
	public void setValue(int num){
		value=num;
		if(value>13 || value<1)
			value=1;
	}
	public int getValue(){
		return value;
	}
}