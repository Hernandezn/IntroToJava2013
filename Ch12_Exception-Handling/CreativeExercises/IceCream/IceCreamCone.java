import javax.swing.*;

public class IceCreamCone{
	private String flavor;
	private int scoops;
	
	public IceCreamCone() throws IceCreamConeException{
		setFlavor();
		setScoops();
	}
	
	public void setFlavor(){
		flavor=JOptionPane.showInputDialog(null,"What flavor would you like?");
	}
	public String getFlavor(){
		return flavor;
	}
	
	public void setScoops() throws IceCreamConeException{
		int selection=JOptionPane.YES_OPTION;
		int x=0;
		while(selection==JOptionPane.YES_OPTION){
			selection=JOptionPane.showConfirmDialog(null,"You have "+(x+1)+" scoop(s)"+
				"\nWould you like another?","Scoops",JOptionPane.YES_NO_OPTION,
				JOptionPane.QUESTION_MESSAGE);
			x++;
		}
		scoops=x;
		
		if(x>3)
			throw(new IceCreamConeException("Your "+flavor+" ice cream can't have "+x+
				" scoops; the maximum limit is 3."));
	}
	public int getScoops(){
		return scoops;
	}
}