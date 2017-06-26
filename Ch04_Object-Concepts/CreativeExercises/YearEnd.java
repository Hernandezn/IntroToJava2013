import java.util.*;

public class YearEnd{
	public static void main(String[]args){
		GregorianCalendar now=new GregorianCalendar();
		GregorianCalendar end=new GregorianCalendar(2013,11,31);
		
		int daysToEnd=end.get(Calendar.DAY_OF_YEAR)
			-now.get(Calendar.DAY_OF_YEAR);
		
		System.out.println("There are "+daysToEnd+
			" days from now until the end of the year, 2013.");
	}
}