import java.util.Scanner;

public class RockScissorsDynamite{
	public static void main(String[]args){
		Scanner input=new Scanner(System.in);
		int selection;
		
		int num=(int)(Math.random()*99)%3+1;
		
		System.out.println("Rock, scissors, dynamite!\nType 1 for "+
			"rock, 2 for scissors, or 3 for dynamite.");
		selection=input.nextInt();
		
		switch(selection){
			case 1:
				switch(num){
					case 1:
						System.out.println("Tie! You both chose rock.");
						break;
					case 2:
						System.out.println("You won!"+
							" Rock crushes scissors.");
						break;
					case 3:
						System.out.println("You lost. Rock gets blown "+
							"up by dynamite.");
						break;
					default:;
				}
				break;
			case 2:
				switch(num){
					case 1:
						System.out.println("You lost. Scissors get "+
							"crushed by rock.");
						break;
					case 2:
						System.out.println("Tie! "+
							"You both chose scissors.");
						break;
					case 3:
						System.out.println("You won! Scissors cuts"+
							" dynamite's fuse off before it can blow.");
						break;
					default:;
				}
				break;
			case 3:
				switch(num){
					case 1:
						System.out.println("You won! Dynamite blows	"+
							"up rock.");
						break;
					case 2:
						System.out.println("You lost. Dynamite's fuse "+
							"gets cut by scissors.");
						break;
					case 3:
						System.out.println("Tie! You both chose "+
							"dynamite.");
						break;
					default:;
				}
				break;
			default:
				System.out.println("Only 1, 2, and 3 work, foo.");
				break;
		}
	}
}