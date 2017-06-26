import java.util.Scanner;

public class Lottery{
	public static void main(String[]args){
		int num1=(int)(Math.random()*10);
		int num2=(int)(Math.random()*10);
		int num3=(int)(Math.random()*10);
		Scanner input=new Scanner(System.in);
		int guess1;
		int guess2;
		int guess3;
		int count=0;
		int exactCount=0;
		
		System.out.println("Please enter your three one-digit"+
			" lottery numbers.");
		//*****
		System.out.println("Test line (gives answers): "+num1+" "+
			num2+" "+num3);//THIS COMMAND IS STRICTLY FOR TESTING
		//*****
		guess1=input.nextInt();
		guess2=input.nextInt();
		guess3=input.nextInt();
		
		if(guess1==num1){
			exactCount=exactCount+1;
			count=count+1;
		}
		if(guess1==num2 && guess1!=num1)
			count=count+1;
		if(guess1==num3 && guess1!=num1 && guess1!=num2)
			count=count+1;
		//Guess 1 evaluation
		if(guess2==num1 && guess1!=num1)
			count=count+1;
		if(guess2==num2){
			exactCount=exactCount+1;
			if(guess2!=num1 && guess1!=num2)
				count=count+1;
		}
		if(guess2==num3 && guess2!=num1 && guess2!=num2 &&
			guess1!=num3)
			count=count+1;
		//Guess 2 evaluation
		if(guess3==num1 && guess2!=num1 && guess1!=num1)
			count=count+1;
		if(guess3==num2 && guess3!=num1 && guess1!=num2 &&
			guess2!=num2)
			count=count+1;
		if(guess3==num3){
			exactCount=exactCount+1;
			if(guess3!=num2 && guess3!=num1 && guess2!=num3 &&
				guess1!=num3)
				count=count+1;
		}
		//Guess 3 evaluation
		System.out.println("Your numbers: "+guess1+" "+guess2+" "+
			guess3+"\nWinning numbers: "+num1+" "+num2+" "+num3);
		
		if(exactCount!=3)
			switch(count){
				case 0:
					System.out.println("Tough luck. You've won $0.00.");
					break;
				case 1:
					System.out.println("You've won $10.00!");
					break;
				case 2:
					System.out.println("Congratulations! You've won "+
						"$100.00!");
					break;
				case 3:
					System.out.println("!!Three matching digits!! "+
						"You've won $1,000.00!!!");
					break;
				default:
					break;
			}
		else
			System.out.println("***!!JACKPOT!!*** YOU'VE WON THE "+
				"LOTTERY'S GRAND $1,000,000.00 PRIZE!!! "+
				"CONGRATULATIONS!");
	}
}