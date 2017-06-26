public class FullDeck{
	public static void main(String[]args){
		int x, y, z;
		final int NUMBER_OF_SUITS=4;
		final int NUMBER_OF_VALUES=13;
		Card[]deck=new Card[52];
		
		for(x=0, y=1, z=1; x<deck.length; x++, z++){
			if(z>NUMBER_OF_VALUES){
				z=1;//value of card
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
		}
		
		for(Card draw: deck)
			System.out.println(draw.getCard());
	}
}