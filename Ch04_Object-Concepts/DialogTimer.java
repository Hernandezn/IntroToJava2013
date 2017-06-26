import javax.swing.JOptionPane;
import java.util.*;

public class DialogTimer{
	public static void main(String[]args){
		int time1,time2,milli1,milli2,sec1,sec2,timeDiff;
		final int MILLISECS_IN_SECOND=1000;
		GregorianCalendar before=new GregorianCalendar();
		
		milli1=before.get(Calendar.MILLISECOND);
		sec1=before.get(Calendar.SECOND);
		time1=MILLISECS_IN_SECOND*sec1+milli1;
		
		JOptionPane.showConfirmDialog(null,"Is stealing ever justified?",
			"Difficult question",JOptionPane.YES_NO_CANCEL_OPTION,
			JOptionPane.WARNING_MESSAGE);
		
		GregorianCalendar after=new GregorianCalendar();
		milli2=after.get(Calendar.MILLISECOND);
		sec2=after.get(Calendar.SECOND);
		time2=MILLISECS_IN_SECOND*sec2+milli2;
		
		timeDiff=time2-time1;
		JOptionPane.showMessageDialog(null,"It took "+timeDiff+
			" milliseconds for you to answer.");
	}
}