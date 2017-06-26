import javax.swing.JOptionPane;

public class PigDiceGame2{
	public static void main(String[]args){
		Die dice1=new Die();
		Die dice2=new Die();
		boolean yourTurn;
		int yourScore=0;
		int compScore=0;
		final int WINNING_SCORE=100;
		
		yourTurn=intro();
		
		do{//Body of the game
			if(yourTurn){
				yourScore = playerTurn(yourScore,dice1,dice2);
				yourTurn=false;
			}
			else{
				compScore = compTurn(compScore,dice1,dice2);
				yourTurn=true;
			}//end body
		}while(yourScore<WINNING_SCORE && compScore<WINNING_SCORE);
		
		if(yourScore>compScore)
			JOptionPane.showMessageDialog(null,"You win!");
		else
			JOptionPane.showMessageDialog(null,"You've lost.");
	}//Main
	
	
	
	public static boolean intro(){
		int selection;
		int flip;
		boolean first;
		
		JOptionPane.showMessageDialog(null,"You're going to be "+
			"playing a game of Pig 2 against the computer.\nYou'll "+
			" race to get to 100 points.\nYou roll two dice, and "+
			"if you don't roll any 1s, the total gets added to your "+
			"score,\n    and you can choose to either continue your "+
			"turn or to pass the turn to the computer.\nIf you DO "+
			"roll a 1, you lose all your points in that round, and "+
			"your turn ends.\nIf you roll two 1s, your score is "+
			"reset to zero, and your turn ends.\nIt's a game of "+
			"chance, so I can't really give any tips. Good luck!");
		
		do{
		selection=Integer.parseInt(JOptionPane.showInputDialog(null,
			"First, we'll see who gets the first turn. Enter 1 for "+
			"heads or 2 for tails:"));
		}while(selection!=1 && selection!=2);
		
		flip=(int)(10*Math.random())%2 + 1;
		
		if(flip==selection){
			JOptionPane.showMessageDialog(null,"Looks like you go "+
				"first.");
			first=true;
		}
		else{
			JOptionPane.showMessageDialog(null,"The computer won the"+
				" coin flip. You go second.");
			first=false;
		}
		
		return first;
	}//Introduction and determination of who goes first
	
	
	
	public static int playerTurn(int mainScore,Die x,Die y){
		int roll1, roll2;
		boolean again;
		int selection;
		int score=0;//for the round
		
		JOptionPane.showMessageDialog(null,"It's your turn.");
		
		do{
			x.reroll();
			y.reroll();
			roll1=x.getRoll();
			roll2=y.getRoll();
			
			if(roll1!=1 && roll2!=1){
				score += roll1+roll2;
				selection=JOptionPane.showConfirmDialog(null,"You "+
					"rolled a "+roll1+" and a "+roll2+", increasing "+
					"your round score to "+score+". Would you like to "+
					"roll again?","Good Roll",JOptionPane.YES_NO_OPTION,
					JOptionPane.QUESTION_MESSAGE);
				if(selection==JOptionPane.YES_OPTION)
					again=true;
				else
					again=false;
			}//rolled no 1s
			else{
				if(roll1==1 && roll2==1){
					mainScore=0;
					JOptionPane.showMessageDialog(null,"Tough luck. "+
						"You rolled a "+roll1+" and a "+roll2+", "+
						"resetting your score to zero and ending your "+
						"turn.");
				}
				else{
					JOptionPane.showMessageDialog(null,"You rolled a "+
						roll1+" and a "+roll2+", adding no points to "+
						"your score and ending your turn.");
				}
				score=0;
				again=false;
			}//rolled a 1
		}while(again);
		
		mainScore += score;
		
		JOptionPane.showMessageDialog(null,"Your main score is now "+
			mainScore+".");
		return mainScore;
	}//the player's round of dice rolls
	//below is a slight modification for the computer's round
	
	
	
	public static int compTurn(int mainScore,Die x,Die y){
		int roll1, roll2;
		boolean again;
		double selection;
		int score=0;//for the round
		
		JOptionPane.showMessageDialog(null,"It's the computer's "+
			"turn.");
		
		do{
			x.reroll();
			y.reroll();
			roll1=x.getRoll();
			roll2=y.getRoll();
			
			if(roll1!=1 && roll2!=1){
				score += roll1+roll2;
				selection=Math.random();
				if(selection>=.5){
					JOptionPane.showMessageDialog(null,"The "+
						"computer rolled a "+roll1+" and a "+roll2+", "+
						"increasing its round score to "+score+". It has "+
						"chosen to roll again.");
					again=true;
				}
				else{
					JOptionPane.showMessageDialog(null,"The "+
						"computer rolled a "+roll1+" and a "+roll2+", "+
						"increasing its round score to "+score+". It has "+
						"chosen to end its turn.");
					again=false;
				}
			}//rolled no 1s
			else{
				if(roll1==1 && roll2==1){
					mainScore=0;
					JOptionPane.showMessageDialog(null,"Bust! The "+
						"computer rolled a "+roll1+" and a "+roll2+", "+
						"resetting its score to zero and ending its "+
						"turn.");
				}
				else{
					JOptionPane.showMessageDialog(null,"The computer "+
						"rolled a "+roll1+" and a "+roll2+", adding no"+
						" points to its score and ending its turn.");
				}
				score=0;
				again=false;
			}//rolled a 1
		}while(again);
	
	mainScore += score;
	
	JOptionPane.showMessageDialog(null,"The computer's main score "+
		"is now "+mainScore+".");
	return mainScore;
	}
}