public class FiveDice2{
	public static void main(String[]args){
		Die dice=new Die();
		int x, y;
		int playCount, compCount;
		String playCombo, compCombo, result;
		final int NUMBER_OF_ROLLS=5;
		int[]playRolls=new int[NUMBER_OF_ROLLS];
		int[]compRolls=new int[NUMBER_OF_ROLLS];
		
		for(x=0; x<NUMBER_OF_ROLLS; x++){
			playRolls[x]=dice.rerollReturn();
			compRolls[x]=dice.rerollReturn();
		}//roll
		
		playCount=count(playRolls);
		compCount=count(compRolls);
		
		playCombo=combo(playCount);
		compCombo=combo(compCount);//* of a kind
		
		System.out.println("Your rolls:");
		
		for(x=0; x<NUMBER_OF_ROLLS; x++)
			System.out.print(playRolls[x]+" ");
		System.out.println("\n"+playCombo+"\n");
		
		System.out.println("Your opponent's rolls:");
		for(x=0; x<NUMBER_OF_ROLLS; x++)
			System.out.print(compRolls[x]+" ");
		System.out.println("\n"+compCombo+"\n");
		
		if(playCount>compCount)
			System.out.println("You win!");
		else if(compCount>playCount)
			System.out.println("You've lost.");
		else
			System.out.println("It's a tie.");
	}//main
	
	public static int count(int[]rolls){
		int combo;
		int x, y;
		int result=0;
		
		for(x=0; x<rolls.length; x++){
			combo=0;
			for(y=0; y<rolls.length; y++)
				if(rolls[x]==rolls[y])
					combo++;
			if(combo>result)
				result=combo;
		}
		return result;
	}//count
	
	public static String combo(int x){
		String result="";
		
		switch(x){
			case 1:
				result="No matches.";
				break;
			case 2:
				result="A pair.";
				break;
			case 3:
				result="Three of a kind~";
				break;
			case 4:
				result="Four of a kind!";
				break;
			case 5:
				result="FIVE OF A KIND!!!";
				break;
		}
		return result;
	}//combo
}