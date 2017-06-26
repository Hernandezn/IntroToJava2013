import javax.swing.JOptionPane;

public class TicTacToe{
	public static void main(String[]args){
		String[]board={"1","2","3","4","5","6","7","8","9"};
		int[]frame={0,0,0,0,0,0,0,0,0};
		int winCheck=0;
		boolean b;
		boolean valid;
		boolean yourTurn=true;
		boolean full=false;
		int x, y;
		StringBuilder display;
		String entry;
		int result;
		
		JOptionPane.showMessageDialog(null,"Welcome to Tic Tac Toe.");
		
		do{
			b=false;
			display=new StringBuilder(21);
			
			for(x=0, y=0; x<board.length; x++){
				display.append(board[x]+" ");
				y++;
				if(y%3==0)
					display.append("\n");
			}//used to display the board
			
			if(yourTurn)
				do{
					entry=JOptionPane.showInputDialog(null,"Enter the position you "+
						"want to play:\n"+display);
					result=Integer.parseInt(entry.charAt(0)+"")-1;
					if(result>=0 && result<frame.length && frame[result]==0)
						b=true;
					
					if(!b)
						JOptionPane.showMessageDialog(null,"Invalid position.");
				}while(!b);//takes valid input from the player, blocking used spaces
			else{
				JOptionPane.showMessageDialog(null,"Your move has been recorded.\nIt's"+
					" your opponent's move:\n"+display);
				do{
					result=(int)(Math.random()*9);
					if(frame[result]==0)//<--allows only unused spaces
						b=true;
				}while(!b);
			}//computer's input
			
			if(yourTurn){
				board[result]="X";
				frame[result]++;
			}//applies the player's selection
			else{
				board[result]="O";
				frame[result]--;
				display=new StringBuilder(21);
				for(x=0, y=0; x<board.length; x++){
					display.append(board[x]+" ");
					y++;
					if(y%3==0)
						display.append("\n");
				}
				JOptionPane.showMessageDialog(null,"Your opponent has played:\n"+
					display);
			}//applies the computer's selection
			
			winCheck=eval(yourTurn,frame);
			
			if(yourTurn)
				yourTurn=false;
			else
				yourTurn=true;
			
			for(x=0, y=0; x<frame.length; x++){
				if(frame[x]!=0)
					y++;
				if(y==frame.length)
					full=true;
			}
				
		}while(winCheck==0 && !full);//full game
		
		display=new StringBuilder(21);
		for(x=0, y=0; x<board.length; x++){
			display.append(board[x]+" ");
			y++;
			if(y%3==0)
				display.append("\n");
		}
		
		if(winCheck>0)
			JOptionPane.showMessageDialog(null,display+"You win!");
		else if(winCheck<0)
			JOptionPane.showMessageDialog(null,display+"Your opponent has won.");
		else if(full)
			JOptionPane.showMessageDialog(null,display+"It's a tie.");
	}//main
	
	
	
	public static int eval(boolean b,int[]game){
		int result=0;
		
		if(game[0]!=0){
			if(game[0]==game[1] && game[1]==game[2])//top row
				result++;
			else if(game[0]==game[3] && game[3]==game[6])//left column
				result++;
			else if(game[0]==game[4] && game[4]==game[8])//y=-x diagonal
				result++;
		}
		if(game[4]!=0){
			if(game[3]==game[4] && game[4]==game[5])//mid row
				result++;
			else if(game[1]==game[4] && game[4]==game[7])//mid column
				result++;
			else if(game[2]==game[4] && game[4]==game[6])//y=x diagonal
				result++;
		}
		if(game[8]!=0){
			if(game[6]==game[7] && game[7]==game[8])//bot row
				result++;
			else if(game[2]==game[5] && game[5]==game[8])//right column
				result++;
		}
		
		if(result!=0 && !b)
			result=-1;
		
		return result;
	}//eval
}