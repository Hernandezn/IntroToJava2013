import java.util.Scanner;

public class CardTwoPick{
	
	public static void main(String[]args){
		
		Card card1=new Card();
		Card card2=new Card();
		
		card1=setCard();
		card2=setCard();
		
		System.out.println("\nYou've drawn a "+card1.getValue()+" of "+
			card1.getSuit()+" and a "+card2.getValue()+" of "+
			card2.getSuit()+".");
	}
	
	public static Card setCard(){	
		Card data=new Card();
		final int CARDS_IN_SUIT=13;
		Scanner input=new Scanner(System.in);
		
		System.out.println("Set your suit: D, S, H, or C.");
		data.setSuit(input.nextLine());
		
		data.setValue((int)(Math.random()*100)%CARDS_IN_SUIT+1);
		
		return data;
	}
}