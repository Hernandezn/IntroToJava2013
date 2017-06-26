import javax.swing.JOptionPane;

public class Quiz{
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
		int y;
		String input;
		boolean valid;
		
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
		}
		
		JOptionPane.showMessageDialog(null,"RESULTS:\nAnswers correct: "+
			correct+"\nAnswers incorrect: "+incorrect);
	}
}