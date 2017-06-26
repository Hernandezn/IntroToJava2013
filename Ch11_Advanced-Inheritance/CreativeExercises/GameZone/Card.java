public class Card{
	private String suit;
	private int value;
	private String rank="";
	
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
		
		switch(value){
			case 1:
				rank="Ace";
				break;
			case 2:
				rank="2";
				break;
			case 3:
				rank="3";
				break;
			case 4:
				rank="4";
				break;
			case 5:
				rank="5";
				break;
			case 6:
				rank="6";
				break;
			case 7:
				rank="7";
				break;
			case 8:
				rank="8";
				break;
			case 9:
				rank="9";
				break;
			case 10:
				rank="10";
				break;
			case 11:
				rank="Jack";
				break;
			case 12:
				rank="Queen";
				break;
			case 13:
				rank="King";
				break;
		}
	}
	public int getValue(){
		return value;
	}
	public String getRank(){
		return rank;
	}
	
	public String getCard(){
		String data=getRank()+" of "+getSuit();
		return data;
	}
}