public class PlayCardGames{
	public static void main(String[]args){
		Poker game=new Poker();
		Card[]hand;
		int x;
		
		game.displayDescription();
		hand=game.deal();
		System.out.println("Your poker hand:");
		for(x=0; x<hand.length; x++)
			System.out.println(hand[x].getCard());
		
		System.out.println();
		Blackjack play=new Blackjack();
		
		play.displayDescription();
		hand=play.deal();
		System.out.println("Your blackjack hand:");
		for(Card B: hand)
			System.out.println(B.getCard());
	}
}