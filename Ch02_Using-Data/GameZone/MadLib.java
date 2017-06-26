import javax.swing.JOptionPane;

public class MadLib{
	public static void main(String[]args){
		String noun1=JOptionPane.showInputDialog(null,"Give me a noun.",
			"Noun, please :)",JOptionPane.INFORMATION_MESSAGE);
		String verb1=JOptionPane.showInputDialog(null,
			"Now, I need a verb.","Verb? :o",
			JOptionPane.INFORMATION_MESSAGE);
		String noun2=JOptionPane.showInputDialog(null,
			"... and another noun, please?","More nouns!",
			JOptionPane.QUESTION_MESSAGE);
		String noun3=JOptionPane.showInputDialog(null,
			"I just need one more noun.","Nouns and nouns and nouns c:",
			JOptionPane.INFORMATION_MESSAGE);
			
		JOptionPane.showMessageDialog(null,
			"Here's your Mad Lib!\n\nTwinkle, twinkle, little "+noun1+
			",\nHow I "+verb1+" what you are.\nUp above the "+noun2+
			" so high,\nLike a "+noun3+
			" in the sky,\nTwinkle, twinkle, little "+noun1+
			",\nHow I "+verb1+" what you are.","Your Mad Lib!",
			JOptionPane.PLAIN_MESSAGE);
	}
}