import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.nio.*;
import java.nio.file.*;
import static java.nio.file.StandardOpenOption.*;

public class HedgeYourBetUsingFile extends JFrame implements ActionListener{
	String[]questions={"Which heavenly body conducts nuclear fusion in its core?",
		"Which is commonly formed through a long series of violent collisions?",
		"Which one always has an atmosphere?","Which of these dies by slowly "+
		"dissolving over time?","Which is the densest?"};
	JCheckBox[]choices={new JCheckBox("Planet"),new JCheckBox("Star"),new
		JCheckBox("Black hole")};
	JLabel message=new JLabel("");
	JButton button=new JButton("Proceed");
	Path scorefile=Paths.get("ScoreFile.txt");
	
	int[]answers={1, 0, 1, 2, 2};
	int x=0;
	int points=-1;
	
	public HedgeYourBetUsingFile(){
		super("Hedge Your Bet!");
		setBounds(450, 225, 500, 185);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
//		setResizeable(false);
		int lastScore=0;
		
		try{
			InputStream iStr=new BufferedInputStream(Files.newInputStream(scorefile,
				READ));
			BufferedReader reader=new BufferedReader(new InputStreamReader(iStr));
			
			lastScore=Integer.parseInt(reader.readLine());
			reader.close();
		}
		catch(Exception error){
			System.out.println("Error: "+error.getMessage());
		}
		
		message.setText("The last game's score was "+lastScore+".");
		add(message);
		button.addActionListener(this);
		add(button);
		setVisible(true);
	}//main
	
	public void actionPerformed(ActionEvent event){
		if(button.getText().equals("End"))
			System.exit(0);
		if(x==0){
			remove(button);
			repaint();
			message.setText(questions[x]);
			for(JCheckBox jcb: choices)
				add(jcb);
			button.setText("Lock in");
			add(button);
		}
		
		int count=0;
		
		if(points<0)
			points++;
		else{
			for(JCheckBox cb: choices)
				if(cb.isSelected())
					count++;
			
			if(count==0)
				message.setText(questions[x]+" \nPlease select an option before "+
					"continuing.");
			else{
				if(choices[answers[x]].isSelected()){
					if(count==1)
						points+=5;
					else if(count==2)
						points+=2;
					else
						points+=1;
				}
				x++;
				try{
					String s=questions[x];
					message.setText(s);
				}
				catch(ArrayIndexOutOfBoundsException last){
					endDisplay();
				}
			}
			
			for(JCheckBox cb: choices)
				cb.setSelected(false);
		}
	}//actionPerformed
	
	public void endDisplay(){
		try{
			OutputStream oStr=new BufferedOutputStream(Files.newOutputStream(scorefile,
				CREATE, WRITE));
			BufferedWriter writer=new BufferedWriter(new OutputStreamWriter(oStr));
			
			String pointString=points+"";
			writer.write(pointString, 0, pointString.length());
			writer.close();
		}
		catch(Exception error){
			System.out.println("Error: "+error.getMessage());
			System.exit(0);
		}
		
		if(points>21)
			message.setText(points+" points. Fantastic!");
		else if(points>15)
			message.setText(points+" points. Very good.");
		else
			message.setText(points+" points. OK.");
		
		for(JCheckBox jcb: choices)
			remove(jcb);
		repaint();
		
		button.setText("End");
	}//endDisplay
	
	public static void main(String[]args){
		HedgeYourBetUsingFile frame=new HedgeYourBetUsingFile();
	}
}