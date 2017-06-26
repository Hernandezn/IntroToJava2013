import java.util.Scanner;

public class TwelveDays{
	public static void main(String[]args){
		int selection;
		String day;
		Scanner input=new Scanner(System.in);
		
		System.out.println("Which of the twelve days of Christmas are you on? (a number 1 to 12)");
		selection=input.nextInt();
		
		if(selection>12)
			selection=12;
		if(selection<1)
			selection=1;
		
		switch(selection){
			case 12:
				day="twelfth";
				break;
			case 11:
				day="eleventh";
				break;
			case 10:
				day="tenth";
				break;
			case 9:
				day="ninth";
				break;
			case 8:
				day="eighth";
				break;
			case 7:
				day="seventh";
				break;
			case 6:
				day="sixth";
				break;
			case 5:
				day="fifth";
				break;
			case 4:
				day="fourth";
				break;
			case 3:
				day="third";
				break;
			case 2:
				day="second";
				break;
			case 1:
				day="first";
				break;
			default:
				day="";
		}
		
		System.out.println("On the "+day+" day of Christmas, my true love gave to me,");
		
		switch(selection){
			case 12:
				System.out.println("12 drummers drumming,");
			case 11:
				System.out.println("11 pipers piping,");
			case 10:
				System.out.println("10 lords a-leaping,");
			case 9:
				System.out.println("9 ladies dancing,");
			case 8:
				System.out.println("8 maids a-milking,");
			case 7:
				System.out.println("7 swans a-swimming,");
			case 6:
				System.out.println("6 geese a-laying,");
			case 5:
				System.out.println("5 golden rings!");
			case 4:
				System.out.println("4 calling birds,");
			case 3:
				System.out.println("3 French hens,");
			case 2:
				System.out.print("2 turtle doves,\nand ");
			case 1:
				System.out.println("a partridge in a pear tree.");
			default:
				;
		}
	}
}