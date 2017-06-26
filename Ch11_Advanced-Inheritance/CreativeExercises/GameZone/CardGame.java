public abstract class CardGame{
	private static final int NUMBER_OF_VALUES=13;
	protected Card[]deck;
	protected int cardsDealt;
	
	public abstract void displayDescription();
	public abstract Card[]deal();
	
	public CardGame(){
		int x, y, z;
		deck=new Card[52];
		
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
		
		shuffle();
	}//constructor populates & shuffles deck
	
	public void shuffle(){
		Card[]temp=new Card[52];
		int[]block=new int[52];
		int x, y, z;
		boolean b;
		
		for(x=0; x<temp.length; x++){
			temp[x]=deck[x];
			block[x]=-1;
		}
		
		for(x=0; x<deck.length; x++){
			do{
				y=(int)(Math.random()*52);
			}while(block[y]>0);
			
			deck[x]=temp[y];
			block[y]=1;
		}
	}//shuffle
}