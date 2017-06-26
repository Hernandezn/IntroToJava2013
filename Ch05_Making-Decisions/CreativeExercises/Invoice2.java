public class Invoice2{
	int invoiceNumber;
	double balanceDue;
	int dueMonth;
	int dueDay;
	int dueYear;
	
	public Invoice2(int num,double due,int month,int day,int year){
		if(num<1000)
			invoiceNumber=0;
		else
			invoiceNumber=num;//Invoice number assignment
		
		balanceDue=due;//Amt due assignment
		
		if(year<2011 || year>2017)
			dueYear=0;
		else
			dueYear=year;//Year due assignment
		
		if(month<1 || month>12)
			dueMonth=0;
		else
			dueMonth=month;//Month due assignment
		
		if(day<1 || day>31)
			dueDay=0;
		else
			dueDay=day;//Day due assignment
		
		switch(dueMonth){
			case 2:
				if(day>29 && (year%4)==0)
					dueDay=29;//DO NOT confuse "day" with "dueDay"
				if(day>28 && (year%4)!=0)
					dueDay=28;
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				if(day>30)
					dueDay=30;
				break;
			default:
				break;
		}//corrects for day settings higher than their months allow
		
		if(dueMonth==0)
			dueDay=0;
	}//constructor
	
	public void display(){
		System.out.println("The invoice number is "+invoiceNumber+
			". The balance, due on "+dueMonth+"/"+dueDay+"/"+dueYear+
			", is $"+balanceDue+".");
	}
}