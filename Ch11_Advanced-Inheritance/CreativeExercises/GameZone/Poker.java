public class Poker extends CardGame{
	protected static int available=52;
	
	public Poker(){
		cardsDealt=5;
	}
	
	public void displayDescription(){
		System.out.println("Poker -- Your win depends on you havinf more matching "+
			"cards than the other player.\nFor instance, two pairs beat one pair, a "+
			"pair of fours beat a pair of twos,\n\tand three of a kind beats a pair.");
	}
	
	public Card[] deal(){
		Card[]temp=new Card[cardsDealt];
		int x;
		
		for(x=0; x<temp.length; x++)
			temp[x]=draw(deck, available);
		
		return temp;
	}
	
	private Card draw(Card[]cards, int remainingCards){
		Card face;
		int x, temp;
		int selection=(int)(Math.random()*(remainingCards*100))%remainingCards;
		
		face=cards[selection];
		
		if(selection != remainingCards-1)
			for(x=selection; x<remainingCards-1; x++)
				cards[x]=cards[x+1];
		
		return face;
	}//draw
}