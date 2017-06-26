import javax.swing.JOptionPane;

public class ConvertDate{
	public static void main(String[]args){
		String dateInput;
		int x;
		int y;
		int z;
		boolean b;
		String mm;
		String dd;
		String yyyy;
		int mmInt, ddInt, yyyyInt, ordinalDay;
		boolean validDate;
		boolean leap;
		String[]month={"January","February","March","April","May","June",
			"July","August","September","October","November","December"};
		int[]monthEnd={       31,        28,     31,     30,   31,    30,
			    31,      31,         30,       31,        30,        31};
		int[]leapMonthEnd={   31,        29,     31,     30,   31,    30,
			    31,      31,         30,       31,        30,        31};
		String displayMonth;
		
		
		do{//reinitialize all variables in case of initial invalidity:
			validDate=true;
			mm="";
			dd="";
			yyyy="";
			x=0;
			
			dateInput=JOptionPane.showInputDialog(null,"Please enter a "+
				"date (MM/DD/YYYY).");
			
			//cut input into the necessary pieces:
			for(b=true; b; x++)
				if(Character.isDigit(dateInput.charAt(x)))
					mm=mm+dateInput.charAt(x);
				else
					b=false;
			x=mm.length();
			
			for(x++, b=true; b; x++)
				if(Character.isDigit(dateInput.charAt(x)))
					dd=dd+dateInput.charAt(x);
				else
					b=false;
			
			x=mm.length()+1+dd.length();
			for(x++; x<dateInput.length(); x++)
				if(Character.isDigit(dateInput.charAt(x)))
					yyyy=yyyy+dateInput.charAt(x);
			
			//deal with any leading zeroes:
			if(mm.charAt(0)=='0'){
				z=mm.length();
				if(z!=1)
					mm=""+mm.charAt(1);
				if(z>2)
					validDate=false;
			}
			if(dd.charAt(0)=='0'){
				z=dd.length();
				if(z!=1)
					dd=""+dd.charAt(1);
				if(z>2)
					validDate=false;
			}
			
			//prepare the pieces to be used as numbers:
			mmInt=Integer.parseInt(mm);
			ddInt=Integer.parseInt(dd);
			yyyyInt=Integer.parseInt(yyyy);
			leap=leapYear(yyyyInt);//shortens things for later
			
			//determine validity of input:
			if(mmInt<1 || ddInt<1 || mmInt>12)
				validDate=false;
			
			if(leap){
//				System.out.println("leap "+leapMonthEnd[mmInt-1]);//debugtool
				if(leapMonthEnd[mmInt-1] < ddInt)
					validDate=false;
			}
			else{
//				System.out.println("nonleap "+monthEnd[mmInt-1]);//debugtool
				if(monthEnd[mmInt-1] < ddInt)
					validDate=false;
			}
			
			//display error message & go back to input if input is invalid:
			if(!validDate)
				JOptionPane.showMessageDialog(null,dateInput+" is an "+
					"invalid date.","Invalid",JOptionPane.ERROR_MESSAGE);
		}while(!validDate);//All data beyond this point is valid.
		
		//determine the date's ordinal position in the year:
		ordinalDay=0;
		if(leap){
			for(y=0; y<mmInt-1; y++)
				ordinalDay+=leapMonthEnd[y];
			ordinalDay+=ddInt;
		}
		else{
			for(y=0; y<mmInt-1; y++)
				ordinalDay+=monthEnd[y];
			ordinalDay+=ddInt;
		}
		
		//display:
		JOptionPane.showMessageDialog(null,"This date is "+month[mmInt-1]+
			" "+ddInt+", "+yyyyInt+".\nThe day in the year is "+
			ordinalDay+".");
	}//main
	
	public static boolean leapYear(int year){
		int z=0;
		boolean check;
		if(year%4==0)
			z++;
		if(year%100==0)
			z++;
		if(year%400==0)
			z++;
		
		if(z%2==0)
			check=false;
		else
			check=true;
		
		return check;
	}//leapYear
}