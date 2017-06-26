import java.util.Scanner;

public class RockScissorsDynamite3{
	enum Play{ROCK, SCISSORS, DYNAMITE, NAN};
	
	public static void main(String[]args){
		Scanner input=new Scanner(System.in);
		String choice;//for accepting input from the user
		Play selection;//for comparing input against the computer's choice
		int count=0;
		int wins=0;
		int losses=0;
		int ties=0;
		char c;
		String filter;
		Play[]comp=Play.values();
		Play opponent;
		
		do{//Master loop statement
			count++;
			filter="";
			selection=Play.NAN;
			
			System.out.println("Rock, scissors, dynamite! Round "+count+" of "+
				"10.\nTake your pick~");
			choice=input.nextLine();
			
			for(int x=0; x<3; x++){
				c=choice.charAt(x);
				filter=filter+c;
			}
			
			if(filter.equalsIgnoreCase("roc"))
				selection=Play.ROCK;
			else if(filter.equalsIgnoreCase("sci"))
				selection=Play.SCISSORS;
			else if(filter.equalsIgnoreCase("dyn"))
				selection=Play.DYNAMITE;
			
			opponent=comp[(int)(Math.random()*3)];
			
			switch(selection){
				case ROCK:
					switch(opponent){
						case ROCK:
							System.out.println("Tie! You both chose rock.");
							ties++;
							break;
						case SCISSORS:
							System.out.println("You won! Rock crushes scissors.");
							wins++;
							break;
						case DYNAMITE:
							System.out.println("You lost. Rock gets blown "+
								"up by dynamite.");
							losses++;
							break;
						default:;
					}
					break;
				case SCISSORS:
					switch(opponent){
						case ROCK:
							System.out.println("You lost. Scissors get "+
								"crushed by rock.");
							losses++;
							break;
						case SCISSORS:
							System.out.println("Tie! You both chose scissors.");
							ties++;
							break;
						case DYNAMITE:
							System.out.println("You won! Scissors cuts"+
								" dynamite's fuse off before it can blow.");
							wins++;
							break;
						default:;
					}
					break;
				case DYNAMITE:
					switch(opponent){
						case ROCK:
							System.out.println("You won! Dynamite blows	"+
								"up rock.");
							wins++;
							break;
						case SCISSORS:
							System.out.println("You lost. Dynamite's fuse "+
								"gets cut by scissors.");
							losses++;
							break;
						case DYNAMITE:
							System.out.println("Tie! You both chose "+
								"dynamite.");
							ties++;
							break;
						default:;
					}
					break;
				default:
					System.out.println("That's not a choice.");
					count--;
					break;
			}//determines win or loss
			
		}while(count<10);//end master loop
		
		System.out.println("That was the last round!\nYou won "+wins+
			" games, the computer won "+losses+" games, and "+ties+
			" games were tied.");
	}//main
}