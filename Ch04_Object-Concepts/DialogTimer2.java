import javax.swing.JOptionPane;
import java.util.*;

public class DialogTimer2{
	public static void main(String[]args){
		int time1,time2,milli1,milli2,sec1,sec2,min1,min2,timeDiff;
		final int MILLISECS_IN_SECOND=1000;
		final int MILLISECS_IN_MINUTE=60000;
		GregorianCalendar before=new GregorianCalendar();
		
		milli1=before.get(Calendar.MILLISECOND);
		sec1=before.get(Calendar.SECOND);
		min1=before.get(Calendar.MINUTE);
		time1=MILLISECS_IN_MINUTE*min1+MILLISECS_IN_SECOND*sec1+milli1;
		
		JOptionPane.showConfirmDialog(null,"Is stealing ever justified?",
			"Difficult question",JOptionPane.YES_NO_CANCEL_OPTION,
			JOptionPane.WARNING_MESSAGE);
		
		GregorianCalendar after=new GregorianCalendar();
		milli2=after.get(Calendar.MILLISECOND);
		sec2=after.get(Calendar.SECOND);
		min2=after.get(Calendar.MINUTE);
		time2=MILLISECS_IN_MINUTE*min2+MILLISECS_IN_SECOND*sec2+milli2;
		
		timeDiff=time2-time1;
		
		JOptionPane.showMessageDialog(null,"It took "+timeDiff+
			" milliseconds for you to answer.");
	}
}