import javax.swing.*;

public class IceCreamCone2{
	private String[]valid={"chocolate","vanilla","strawberry","neopolitan"};
	private String flavor;
	private int scoops;
	
	public IceCreamCone2() throws IceCreamConeException{
		setFlavor();
		setScoops();
	}
	
	public void setFlavor() throws IceCreamConeException{
		int x;
		boolean invalid=true;
		
		flavor=JOptionPane.showInputDialog(null,"What flavor would you like?");
		flavor=flavor.toLowerCase();
		for(x=0; x<valid.length; x++)
			if(flavor.equals(valid[x]))
				invalid=false;
		
		if(invalid)
			throw(new IceCreamConeException("Sorry, but we don't serve "+flavor+
				" ice cream."));
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