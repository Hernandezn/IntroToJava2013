import javax.swing.*;
import java.util.*;
import java.io.*;
import java.nio.*;
import java.nio.file.*;
import static java.nio.file.StandardOpenOption.*;

public class SecretPhraseUsingFile{
	public static void main(String[]args){
		int lines=0;
		int x, selection;
		String choice, data="";
		StringBuilder phrase, check;
		boolean b, done=false;
		
		Path file=Paths.get("Phrases.txt");
		
		try{
			InputStream is=new BufferedInputStream(Files.newInputStream(file, READ));
			BufferedReader rd=new BufferedReader(new InputStreamReader(is));
			
			do{
				data=rd.readLine();
				if(data!=null)
					lines++;
			}while(data!=null);
			
			rd.close();
		}
		catch(IOException error){
			System.out.println("IO Error");
		}//counts lines, priming it for a random phrase selection
		
		try{
			InputStream iStr=new BufferedInputStream(Files.newInputStream(file, READ));
			BufferedReader reader=new BufferedReader(new InputStreamReader(iStr));
			
			selection=(int)(Math.random()*lines)+1;
			for(x=0; x<selection; x++)
				data=reader.readLine();
			
			reader.close();
		}
		catch(Exception error){
			System.out.println("Error: "+error.getMessage());
		}//selects a random phrase
		
		phrase=new StringBuilder(data);
		check=new StringBuilder(data);
		for(x=0; x<phrase.length(); x++)
			if(Character.isLetter(phrase.charAt(x)))
				phrase.setCharAt(x, '*');//hides the phrase
		
		JOptionPane.showMessageDialog(null,"Secret phrase! Your secret phrase is:\n"+
			phrase);
		
		do{
			b=true;
			try{
				choice=JOptionPane.showInputDialog(null,"Guess a letter: "+
					phrase).charAt(0)+"";
			}
			catch(StringIndexOutOfBoundsException error){
				choice="*";
			}
			
			if(Character.isLetter(choice.charAt(0)))//filters non-letter selections
				for(x=0; x<check.length(); x++){
					if(choice.equalsIgnoreCase(phrase.charAt(x)+"") && Character.isLetter(
						phrase.charAt(x))){
						JOptionPane.showMessageDialog(null,"You've already guessed that "+
							"letter.");
						x=check.length();
						b=false;
					}//cancels check if letter was already guessed
					else if(choice.equalsIgnoreCase(check.charAt(x)+"")){
						phrase.setCharAt(x, check.charAt(x));
						JOptionPane.showMessageDialog(null,"You got one!\n"+phrase);
						b=false;
					}//advances the game if the guess was correct
				}
			else{
				JOptionPane.showMessageDialog(null,"That's not a letter.");
				b=false;
			}
			if(b)
				JOptionPane.showMessageDialog(null,"Swing and a miss! None of the "+
					"letters matched.");//displays if a valid guess was wrong
			
			if(phrase.toString().equals(check.toString()))
				done=true;//finishes game if hidden phrase matches original
		}while(!done);
		
		JOptionPane.showMessageDialog(null,"You've guessed the secret phrase! "+
			"It was:\n"+phrase);
	}
}//LOVE IS A BATTLEFIELD.