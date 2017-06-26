import java.util.Scanner;

public class RockScissorsDynamite2{
	public static void main(String[]args){
		Scanner input=new Scanner(System.in);
		String choice;//for accepting input from the user
		int selection;//for comparing input against the computer's choice
		int count=0;
		int wins=0;
		int losses=0;
		int ties=0;
		char c;
		String filter;
		
		int num=(int)(Math.random()*99)%3+1;
		
		do{//Master loop statement
		count++;
		filter="";
		selection=0;
		
		System.out.println("Rock, scissors, dynamite! Round "+count+" of "+
			"10.\nTake your pick~");
		choice=input.nextLine();
		
		for(int x=0; x<2; x++){
			c=choice.charAt(x);
			filter=filter+c;
		}
		
		if(filter.equalsIgnoreCase("ro"))
			selection=1;
		else if(filter.equalsIgnoreCase("sc"))
			selection=2;
		else if(filter.equalsIgnoreCase("dy"))
			selection=3;
		
		switch(selection){
			case 1:
				switch(num){
					case 1:
						System.out.println("Tie! You both chose rock.");
						ties++;
						break;
					case 2:
						System.out.println("You won! Rock crushes scissors.");
						wins++;
						break;
					case 3:
						System.out.println("You lost. Rock gets blown "+
							"up by dynamite.");
						losses++;
						break;
					default:;
				}
				break;
			case 2:
				switch(num){
					case 1:
						System.out.println("You lost. Scissors get "+
							"crushed by rock.");
						losses++;
						break;
					case 2:
						System.out.println("Tie! You both chose scissors.");
						ties++;
						break;
					case 3:
						System.out.println("You won! Scissors cuts"+
							" dynamite's fuse off before it can blow.");
						wins++;
						break;
					default:;
				}
				break;
			case 3:
				switch(num){
					case 1:
						System.out.println("You won! Dynamite blows	"+
							"up rock.");
						wins++;
						break;
					case 2:
						System.out.println("You lost. Dynamite's fuse "+
							"gets cut by scissors.");
						losses++;
						break;
					case 3:
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
		}
		
		}while(count<10);//end master loop
		
		System.out.println("That was the last round!\nYou won "+wins+
			" games, the computer won "+losses+" games, and "+ties+
			" games were tied.");
	}
}