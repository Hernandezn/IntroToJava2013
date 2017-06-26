import javax.swing.JOptionPane;
import java.util.*;

public class CollegeStudentTest{
	public static void main(String[]args){
		
		CollegeStudent uno;
		String one="uno";
		
		CollegeStudent ace;
		String a="ace";
		
		uno=dataFiller(one);
		ace=dataFiller(a);
		
		displayData(uno,one,ace,a);
	}//main.
	
	public static CollegeStudent dataFiller(String code){	
		String name1;
		String name2;
		int yr;
		int mnth;
		int day;
		
		name1=JOptionPane.showInputDialog(null,"Please enter the first name"
			+" of student "+code+".","First name",
			JOptionPane.PLAIN_MESSAGE);
			
		name2=JOptionPane.showInputDialog(null,"Please enter the last name"
			+" of student "+code+".","Surname",JOptionPane.PLAIN_MESSAGE);
			
		yr=Integer.parseInt(JOptionPane.showInputDialog(null,"In what year"
			+" does student "+code+" enroll?","Year",
			JOptionPane.QUESTION_MESSAGE));
			
		mnth=(Integer.parseInt(JOptionPane.showInputDialog(null,"During "+
			"which month (1-12) does student "+code+" enroll?","Month",
			JOptionPane.QUESTION_MESSAGE)))-1;
			
		day=Integer.parseInt(JOptionPane.showInputDialog(null,"On what "+
			"day of the month does student "+code+" enroll?","Day",
			JOptionPane.QUESTION_MESSAGE));
		
		GregorianCalendar timeInfo=new GregorianCalendar(yr,mnth,day);
		
		CollegeStudent data=new CollegeStudent(name1,name2,timeInfo);
		
		return data;
	}//dataFiller -- assigns new parameters to CollegeStudent objects.
	
	public static void displayData(CollegeStudent x,String callName,
		CollegeStudent y,String codeName){
		
		GregorianCalendar one=x.getEnrollDate();
		GregorianCalendar a=y.getEnrollDate();
		GregorianCalendar uno=x.getGradDate();
		GregorianCalendar ace=y.getGradDate();
		
		JOptionPane.showMessageDialog(null,"The information for student "+
			callName+" is as follows:\nThe student's name is "+
			x.getFirstName()+" "+x.getSurName()+", and this student's "+
			"enrollment date (MM/DD/YY) is "+(one.get(Calendar.MONTH)+1)+
			"/"+one.get(Calendar.DATE)+"/"+one.get(Calendar.YEAR)+". The"+
			" expected graduation date for this student is "+
			(1+uno.get(Calendar.MONTH))+"/"+uno.get(Calendar.DATE)+"/"+
			uno.get(Calendar.YEAR)+".\n\nRegarding the other student,\n"+
			"student "+codeName+"'s name is "+y.getFirstName()+" "+
			y.getSurName()+", enrolled "+(1+a.get(Calendar.MONTH))+"/"+
			a.get(Calendar.DATE)+"/"+a.get(Calendar.YEAR)+", with a "+
			"projected graduation date of "+(1+ace.get(Calendar.MONTH))+"/"+
			ace.get(Calendar.DATE)+"/"+ace.get(Calendar.YEAR)+".");
	}//displayData -- displays CollegeStudent data along with the contained calendar data.
}