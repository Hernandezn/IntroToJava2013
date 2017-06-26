import java.util.Scanner;

public class Lawn{
	public static void main(String[]args){
		int weeklyFee;
		int lotLength,lotWidth,lotArea;
		int seasonFee;
		final int SMALL_WEEKLY_FEE=25;
		final int MED_WEEKLY_FEE=35;
		final int LARGE_WEEKLY_FEE=50;
		final int WEEKS_PER_SEASON=20;
		Scanner input=new Scanner(System.in);
		
		System.out.print("What is the length of your lawn (in feet)? ");
		lotLength=input.nextInt();
		System.out.print("What is the width of your lawn (in feet)? ");
		lotWidth=input.nextInt();
		
		lotArea=lotLength*lotWidth;
		
		if(lotArea<4000)
			weeklyFee=SMALL_WEEKLY_FEE;
		else
			if(lotArea<6000 && lotArea>=4000)
				weeklyFee=MED_WEEKLY_FEE;
			else
				weeklyFee=LARGE_WEEKLY_FEE;
		
		seasonFee=weeklyFee*WEEKS_PER_SEASON;
		
		System.out.println("The weekly mowing fee will be $"+weeklyFee+
			".\nThis makes the 20-week seasonal fee $"+seasonFee+".");
	}
}