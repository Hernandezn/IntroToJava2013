public class FullDeck2{
	public static void main(String[]args){
		int x, y, z;
		final int NUMBER_OF_SUITS=4;
		final int NUMBER_OF_VALUES=13;
		Card2[]deck=new Card2[52];
		
		for(x=0, y=1, z=1; x<deck.length; x++, z++){
			if(z>NUMBER_OF_VALUES){
				z=1;//value of card
				y++;//suit of card
			}
			
			deck[x]=new Card2();
			deck[x].setValue(z);
			switch(y){
				case 1:
					deck[x].setSuit(Suit.SPADES);
					break;
				case 2:
					deck[x].setSuit(Suit.HEARTS);
					break;
				case 3:
					deck[x].setSuit(Suit.DIAMONDS);
					break;
				case 4:
					deck[x].setSuit(Suit.CLUBS);
					break;
			}
		}
		
		for(Card2 draw: deck)
			System.out.println(draw.getCard());
	}
}