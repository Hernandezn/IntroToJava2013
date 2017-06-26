public class Invoice{
	int invoiceNumber;
	double balanceDue;
	int dueMonth;
	int dueDay;
	int dueYear;
	
	public Invoice(int num,double due,int month,int day,int year){
		if(num<1000)
			invoiceNumber=0;
		else
			invoiceNumber=num;//Invoice number assignment
		
		balanceDue=due;//Amt due assignment
		
		if(month<1 || month>12)
			dueMonth=0;
		else
			dueMonth=month;//Month due assignment
		
		if(day<1 || day>31)
			dueDay=0;
		else
			dueDay=day;//Day due assignment
		
		if(year<2011 || year>2017)
			dueYear=0;
		else
			dueYear=year;//Year due assignment
	}//constructor
	
	public void display(){
		System.out.println("The invoice number is "+invoiceNumber+
			". The balance, due on "+dueMonth+"/"+dueDay+"/"+dueYear+
			", is $"+balanceDue+".");
	}
}