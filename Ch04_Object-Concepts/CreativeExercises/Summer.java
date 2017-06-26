import java.util.*;

public class Summer{
	public static void main(String[]args){
		GregorianCalendar now=new GregorianCalendar();
		GregorianCalendar destination=new GregorianCalendar(2013,5,21);
		
		int daysLeft=destination.get(Calendar.DAY_OF_YEAR)-
			now.get(Calendar.DAY_OF_YEAR);
		
		System.out.println(
			"The number of days from today to summer, 2013, is "+
			daysLeft+".");
	}
}