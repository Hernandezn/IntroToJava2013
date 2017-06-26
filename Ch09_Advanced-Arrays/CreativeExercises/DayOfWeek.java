import java.util.Scanner;

public class DayOfWeek{
	enum Day{SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY}
	
	public static void main(String[]args){
		Day[]array=Day.values();
		int x;
		Scanner input=new Scanner(System.in);
		String entry;
		Day data;
		boolean b=false;
		
		System.out.println("Days of the week:");
		for(x=0; x<array.length; x++)
			System.out.print(array[x]+" ");
		
		do{
			System.out.println("\nOn what day would you like to do business?");
			entry=input.nextLine().toUpperCase();
			
			for(x=0; x<array.length; x++)
				if(array[x].toString().equals(entry)){
					b=true;
					x=array.length;
				}
			if(!b)
				System.out.println("Invalid entry.");
		}while(!b);
		data=Day.valueOf(entry);
		
		switch(data){
			case SUNDAY:
				System.out.println("Our hours on "+data+" are 11 to 5.");
				break;
			case MONDAY:
			case TUESDAY:
			case WEDNESDAY:
			case THURSDAY:
			case FRIDAY:
				System.out.println("Our hours on "+data+" are 9 to 9.");
				break;
			case SATURDAY:
				System.out.println("Our hours on "+data+" are 9 to 6.");
		}
	}//main
}