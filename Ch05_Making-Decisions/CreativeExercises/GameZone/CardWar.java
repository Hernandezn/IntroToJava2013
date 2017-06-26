import java.util.Scanner;

public class CardWar{
	
	public static void main(String[]args){
		int card1val;
		int card2val;
		String card1suit;
		String card2suit;
		Card card1=new Card();
		Card card2=new Card();
		
		card1val=setCardVal();
		card2val=setCardVal();
		card1suit=setCardSuit();
		card2suit=setCardSuit();
		
		if(card1val==card2val && card1suit==card2suit){
			if(card1suit=="Spades")
				card1suit="Diamonds";
			if(card1suit=="Diamonds")
				card1suit="Clubs";
			if(card1suit=="Clubs")
				card1suit="Hearts";
			if(card1suit=="Hearts")
				card1suit="Spades";
		}
		
		card1.setValue(card1val);
		card2.setValue(card2val);
		card1.setSuit(card1suit);
		card2.setSuit(card2suit);
		
		System.out.println("\nYou've drawn a "+card1.getValue()+
			" of "+card1.getSuit()+", and the computer has drawn a "+
			card2.getValue()+" of "+card2.getSuit()+".");
		
		if(card1val!=card2val){
			if(card1val>card2val)
				System.out.println("You have won.");
			if(card1val<card2val)
				System.out.println("The computer has won.");
		}
		else
			System.out.println("The cards are equal; you've tied.");
	}
	
	public static int setCardVal(){
		final int CARDS_IN_SUIT=13;
		int val;
		
		val=(int)(Math.random()*100)%CARDS_IN_SUIT+1;
		return val;
	}
	
	public static String setCardSuit(){
		final int SUITS=4;
		int num;
		String suit;
		
		num=(int)(Math.random()*100)%SUITS+1;
		
		switch(num){
			case 1:
				suit="Spades";
				break;
			case 2:
				suit="Diamonds";
				break;
			case 3:
				suit="Clubs";
				break;
			case 4:
				suit="Hearts";
				break;
			default:
				suit="";
				break;
		}
		return suit;
	}
}