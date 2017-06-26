import javax.swing.*;
import java.io.*;
import java.nio.*;
import java.nio.file.*;
import java.nio.channels.*;
import static java.nio.file.StandardOpenOption.*;

public class QuizUsingFile{
	public static void main(String[]args){
		String[]questions={"Which Nether mob can you face down for "+
			"gunpowder?\nA: Wither, B: Wither Skeleton, C: Ghast","How do "+
			"you obtain charcoal?\nA: Mine it, B: Burn wood, C: Burn mobs",
			"Which odd weapon can be used to slay the Ender Dragon?\nA: "+
			"Snowballs, B: Fishing Rod, C: Iron Golems","Which material "+
			"can you not make stairs out of?\nA: Stone, B: Sandstone, C: "+
			"Bricks","Which of these pickaxes mines through stone the "+
			"fastest in Vanilla Minecraft?\nA: Diamond, B: Gold, C: "+
			"Obsidian"};
		String[]ansCompare={"C","B","A","A","B"};
		String[]ansDisplay={"C, Ghast.","B, Burn wood.","A, Snowballs.",
			"A, Stone.","B, Gold."};
		String[]choices={"A","B","C"};
		int correct=0, incorrect=0;
		int x=0;
		int y, hiscore=0;
		String input;
		boolean valid;
		
		Path file=Paths.get("QuizHiScore.txt");
		
		try{
			InputStream is=new BufferedInputStream(Files.newInputStream(file, READ));
			BufferedReader rd=new BufferedReader(new InputStreamReader(is));
			
			hiscore=Integer.parseInt(rd.readLine());
			JOptionPane.showMessageDialog(null,"Welcome to the Minecraft short quiz!"+
				"\nThe current high score is "+hiscore+".");
			
			rd.close();
		}
		catch(Exception error){
			JOptionPane.showMessageDialog(null,"Error!\n"+error.getMessage());
		}//reads out the high score
		
		while(x<questions.length){
			valid=false;
			
			input=JOptionPane.showInputDialog(null,questions[x]);
			
			for(String s: choices)
				if(input.equalsIgnoreCase(s))
					valid=true;
			
			if(valid){
				if(input.equalsIgnoreCase(ansCompare[x])){
					JOptionPane.showMessageDialog(null,"Correct!\nIt was "+
						ansDisplay[x]);
					correct++;
				}
				else{
					JOptionPane.showMessageDialog(null,"Nope~\nThe correct "+
						"answer was "+ansDisplay[x]);
					incorrect++;
				}
				
				x++;
			}
			else
				JOptionPane.showMessageDialog(null,"Invalid response.",
					"Invalid",JOptionPane.ERROR_MESSAGE);
		}//gives the quiz and takes score
		
		JOptionPane.showMessageDialog(null,"RESULTS:\nAnswers correct: "+
			correct+"\nAnswers incorrect: "+incorrect);
		
		if(correct>hiscore){
			byte[]array=(correct+"").getBytes();
			try{
				FileChannel fc=(FileChannel)Files.newByteChannel(file, WRITE);
				ByteBuffer buffer=ByteBuffer.wrap(array);
				
				fc.position(0);
				fc.write(buffer);
				
				JOptionPane.showMessageDialog(null,"Congratulations! You've beaten "+
					"the old high score.\nThe new high score is "+correct+".");
				fc.close();
			}
			catch(Exception error){
				JOptionPane.showMessageDialog(null,"Error: "+error.getMessage());
			}
		}//places a new high score if relevant
	}
}