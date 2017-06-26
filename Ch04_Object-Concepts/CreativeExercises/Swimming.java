import javax.swing.JOptionPane;

public class Swimming{
	public static void main(String[]args){
		int poolVolume;
		double poolCapacity;
		double minutesTaken;
		double hoursTaken;
		double totalFee;
		
		double CLEANING_FEE=75;
		double GALLONS_PER_CUBIC_FOOT=7.5;
		double FLOW_RATE_PER_MINUTE=50;
		int MINUTES_PER_HOUR=60;
		double FEE_PER_HOUR=8;
		
		welcomeMsg();
		
		poolVolume=volumeInput();
		poolCapacity=(double)poolVolume*GALLONS_PER_CUBIC_FOOT;
		minutesTaken=poolCapacity/FLOW_RATE_PER_MINUTE;
		hoursTaken=minutesTaken/(double)MINUTES_PER_HOUR;
		
		double fillUpFee=Math.round(FEE_PER_HOUR*hoursTaken*100.0)/100.0;
		double svcFee=
			Math.round(100.0*(FEE_PER_HOUR*hoursTaken+CLEANING_FEE))/100.0;
		
		JOptionPane.showMessageDialog(null,"The fee to fill your pool "+
			"will be $"+fillUpFee+", and the fee for full service, "+
			"including cleaning, will be $"+svcFee+".");
		
	}//main
	
	public static void welcomeMsg(){
		JOptionPane.showMessageDialog(null,"Welcome, and thank you for "+
			"choosing In Deep Water Associates!","Welcome",
			JOptionPane.INFORMATION_MESSAGE);
	}//welcomes the user
	
	public static int volumeInput(){
		int x=Integer.parseInt(JOptionPane.showInputDialog(null,"What's "+
			 "the length of your pool, in feet?","Length",
			JOptionPane.QUESTION_MESSAGE));
		
		int y=Integer.parseInt(JOptionPane.showInputDialog(null,"What's "+
			"the width of your pool in feet?","Width",
			JOptionPane.QUESTION_MESSAGE));
		
		int z=Integer.parseInt(JOptionPane.showInputDialog(null,"What's "+
			"the depth of your pool in feet?","Depth",
			JOptionPane.QUESTION_MESSAGE));
		
		int vol=x*y*z;
		return vol;
	}//volumeInput
}