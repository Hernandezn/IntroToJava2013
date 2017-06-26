import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JMyNewHome extends JFrame implements ItemListener{
	ButtonGroup models=new ButtonGroup();
	ButtonGroup bedrooms=new ButtonGroup();
	ButtonGroup garage=new ButtonGroup();
	JCheckBox[][]boxes={{new JCheckBox("Aspen   "),new JCheckBox("Brittany"),new
		JCheckBox("Colonial"),new JCheckBox("Dartmoor")},
		{new JCheckBox("No garage       "),new JCheckBox("One-car garage  "),new
		JCheckBox("Two-car garage  "),new JCheckBox("Three-car garage")},
		{new JCheckBox("Two-bedroom  "),new JCheckBox("Three-bedroom"),new JCheckBox(
		"Four-bedroom ")}};
	int[][]priceMod={{100000,120000,180000,250000},
							{    0,  7775, 15550, 23325},
							{21000, 31500, 43000}};
	JLabel header=new JLabel("Choose your house options:");
	JLabel footer=new JLabel("The price of the current selection is");
	int cost=0;
	JTextField field=new JTextField(7);
	
	public JMyNewHome(){
		super("House Order");
		int x, y;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(460, 245, 500, 165);
		setResizable(false);
		setLayout(new FlowLayout());
		add(header);
		for(x=0; x<boxes[0].length; x++)
			models.add(boxes[0][x]);
		for(x=0; x<boxes[1].length; x++)
			garage.add(boxes[1][x]);
		for(x=0; x<boxes[2].length; x++)
			bedrooms.add(boxes[2][x]);
		
		for(x=0; x<boxes.length; x++)
			for(y=0; y<boxes[x].length; y++){
				boxes[x][y].addItemListener(this);
				add(boxes[x][y]);
			}
		
//		JCheckBox empty=new JCheckBox("             ");
//		empty.setVisible(false);
//		add(empty);
		
		add(footer);
		field.setText("$"+cost);
		field.setEditable(false);
		add(field);
		
		setVisible(true);
	}
	
	public void itemStateChanged(ItemEvent event){
		Object source=event.getSource();
		int selection=event.getStateChange();
		int x, y;
		
		for(x=0; x<boxes.length; x++)
			for(y=0; y<boxes[x].length; y++)
				if(source==boxes[x][y])
					if(selection==ItemEvent.SELECTED)
						cost+=priceMod[x][y];
					else
						cost-=priceMod[x][y];
		
		field.setText("$"+cost);
	}
	
	public static void main(String[]args){
		JMyNewHome frame=new JMyNewHome();
	}
}