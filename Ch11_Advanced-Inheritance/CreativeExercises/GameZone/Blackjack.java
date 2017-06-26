public class Blackjack extends CardGame{
	protected static int available=52;
	
	public Blackjack(){
		cardsDealt=2;
	}
	
	public void displayDescription(){
		System.out.println("Blackjack -- Try to get a hand of cards that add up to "+
			"something as close to 21 as possible without going over.\nJacks, queens, "
			+"and kings count as tens, and an ace can count as either a one or an "+
			"eleven.\nThe value of the ace depends on whether or not an eleven will "+
			"push the hand's value over the limit.");
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