import javax.swing.*;

public class ThrowIceCream{
	public static void main(String[]args){
		IceCreamCone[]dessert=new IceCreamCone[5];
		int x;
		
		for(x=0; x<dessert.length; x++)
			try{
				dessert[x]=new IceCreamCone();
				JOptionPane.showMessageDialog(null,"Your "+dessert[x].getScoops()+
					"-scoop "+dessert[x].getFlavor()+" ice cream has registered "+
					"successfully.");
			}
			catch(IceCreamConeException error){
				JOptionPane.showMessageDialog(null,error.getMessage());
			}
	}
}