import javax.swing.*;

public class ScoreTest{
	public static void main(String[]args){
		int[]ids={1111, 2222, 3333, 4444, 5555};
		int[]scores=new int[ids.length];
		final int MAX_SCORE=100;
		final int MIN_SCORE=0;
		String entry;
		int x;
		
		for(x=0; x<ids.length; x++){
			entry=JOptionPane.showInputDialog(null,"Please enter a test score for "+
				"student "+ids[x]+".");
			try{
				scores[x]=Integer.parseInt(entry);
				if(scores[x]>MAX_SCORE || scores[x]<MIN_SCORE)
					throw(new ScoreException(scores[x]+" isn't within the range of "+
						"allowed scores for student "+ids[x]+".\nHis or her score will "+
						"be set to "+MIN_SCORE+" until an appropriate reentry is made."));
			}
			catch(ScoreException error){
				JOptionPane.showMessageDialog(null,error.getMessage(),"Invalid entry",
					JOptionPane.ERROR_MESSAGE);
			}
			catch(Exception error){
				JOptionPane.showMessageDialog(null,"Now, that's just silly.");
			}
		}
		entry="";
		
		for(x=0; x<scores.length; x++)
			entry+="\n"+ids[x]+" has scored a "+scores[x];
		
		JOptionPane.showMessageDialog(null,"The students' scores are as follows"+
			entry);
	}
}