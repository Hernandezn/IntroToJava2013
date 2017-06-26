import javax.swing.*;
import java.io.*;
import java.nio.*;
import java.nio.file.*;
import static java.nio.file.StandardOpenOption.*;

public class TicTacToeWithPassword{
	public static void main(String[]args){
		String[]board={"1","2","3","4","5","6","7","8","9"};
		int[]frame={0,0,0,0,0,0,0,0,0};
		int winCheck=0;
		boolean b;
		boolean yourTurn=true;
		boolean full=false;
		int x, y;
		StringBuilder display;
		String entry;
		int result;
		//expansion variables:
		boolean deny=true;
		boolean valid;
		final String delimiter=",";
		String[]array=new String[2];
		String username, password, nameCheck;
		
		Path file=Paths.get("Accounts.txt");
		try{
			InputStream iStr=new BufferedInputStream(Files.newInputStream(file, READ));
			BufferedReader reader=new BufferedReader(new InputStreamReader(iStr));
			reader.mark(2047);
			
			do{
				username=JOptionPane.showInputDialog(null,"Enter a username.");
				
				b=true;
				valid=false;
				nameCheck=reader.readLine();
				while(nameCheck!=null && b){
					array=nameCheck.split(delimiter);
					if(username.equalsIgnoreCase(array[0])){
						b=false;
						valid=true;
					}
					if(b)
						nameCheck=reader.readLine();
				}
				if(valid){
					password=JOptionPane.showInputDialog(null,"Please enter your "+
						"password.");
					if(password.equalsIgnoreCase(array[1]))
						deny=false;
					else{
						JOptionPane.showMessageDialog(null,"That is not the correct "+
							"password.");
						b=true;
						reader.reset();
					}
				}
				else{
					JOptionPane.showMessageDialog(null,"Invalid username.");
					reader.reset();
				}
			}while(b);
			
			reader.close();
		}
		catch(Exception error){
			JOptionPane.showMessageDialog(null,"Error: "+error.getMessage());
		}//username&password locking extension
		//END EXPANSION-------------
		if(!deny){
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
						result=compSelection(frame);
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
		}//game only runs if account details check out
		else
			JOptionPane.showMessageDialog(null,"No valid account details were provided"+
				".\nThe game will now end.");
	}//main
	
	
	
	public static int compSelection(int[]game){
		int choice=-1;
		
		if(game[0]==-1){
			if(game[1]==game[0] && game[2]==0)
				choice=2;
			else if(game[2]==game[0] && game[1]==0)
				choice=1;
			else if(game[3]==game[0] && game[6]==0)
				choice=6;
			else if(game[6]==game[0] && game[3]==0)
				choice=3;
			else if(game[4]==game[0] && game[8]==0)
				choice=8;
			else if(game[8]==game[0] && game[4]==0)
				choice=4;
		}
		else if(game[0]==0){
			if(game[1]==game[2] && game[1]==-1)
				choice=0;
			else if(game[4]==game[8] && game[4]==-1)
				choice=0;
			else if(game[3]==game[6] && game[3]==-1)
				choice=0;
		}//if a match is possible with the top left
		
		if(game[4]==-1){
			if(game[1]==game[4] && game[7]==0)
				choice=7;
			else if(game[7]==game[4] && game[1]==0)
				choice=1;
			else if(game[3]==game[4] && game[5]==0)
				choice=5;
			else if(game[5]==game[4] && game[3]==0)
				choice=3;
			else if(game[2]==game[4] && game[6]==0)
				choice=6;
			else if(game[6]==game[4] && game[2]==0)
				choice=2;
		}
		else if(game[4]==0){
			if(game[1]==game[7] && game[1]==-1)
				choice=4;
			else if(game[2]==game[6] && game[2]==-1)
				choice=4;
			else if(game[3]==game[5] && game[3]==-1)
				choice=4;
		}//if a match is possible with the middle
		
		if(game[8]==-1){
			if(game[6]==game[8] && game[7]==0)
				choice=7;
			else if(game[7]==game[8] && game[6]==0)
				choice=6;
			else if(game[2]==game[8] && game[5]==0)
				choice=5;
			else if(game[5]==game[8] && game[2]==0)
				choice=2;
		}
		else if(game[8]==0){
			if(game[2]==game[5] && game[2]==-1)
				choice=8;
			else if(game[6]==game[7] && game[6]==-1)
				choice=8;
		}//if a match is possible with the bottom right
		
		if(choice==-1)
			choice=(int)(Math.random()*9);
		
		return choice;
	}//compSelection -- makes the computer a little bit smarter
	
	
	
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
	}//eval -- determines if the game is won
}