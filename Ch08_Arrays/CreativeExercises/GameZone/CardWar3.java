public class CardWar3{
	public static void main(String[]args){
		int x, y, z;
//		final int NUMBER_OF_SUITS=4;
		final int NUMBER_OF_VALUES=13;
		Card[]deck=new Card[52];
		int available=52;
		Card playDraw, compDraw;
		int wins=0, losses=0, ties=0;
		
		for(x=0, y=1, z=1; x<deck.length; x++, z++){
			if(z>NUMBER_OF_VALUES){
				z=1;//rank of card
				y++;//suit of card
			}
			
			deck[x]=new Card();
			deck[x].setValue(z);
			switch(y){
				case 1:
					deck[x].setSuit("Hearts");
					break;
				case 2:
					deck[x].setSuit("Diamonds");
					break;
				case 3:
					deck[x].setSuit("Clubs");
					break;
				case 4:
					deck[x].setSuit("Spades");
					break;
				default:
					deck[x].setSuit("");
			}
		}//populates the deck[]
		
		while(available>0){
			playDraw=draw(deck, available);
			available--;
			compDraw=draw(deck, available);
			available--;
			
			System.out.println("You've drawn the "+playDraw.getCard()+", and your "+
				"opponent has drawn the "+compDraw.getCard()+".");
			if(playDraw.getValue()<compDraw.getValue()){
				System.out.println("You've lost this one.");
				losses++;
			}
			else if(playDraw.getValue()>compDraw.getValue()){
				System.out.println("You've won.");
				wins++;
			}
			else{
				System.out.println("This one's a tie.");
				ties++;
			}
		}//game
		
		System.out.println("\nYou've won "+wins+" rounds, your opponent won "+losses+
			" rounds, and "+ties+" matches were tied.");
	}//main
		
	public static Card draw(Card[]cards, int remainingCards){
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