import java.util.Scanner;

public class Carpet2{
	public static void main(String[]args){
		Scanner keyboard=new Scanner(System.in);
		
		System.out.print("Please enter the length of the room in feet: ");
		short length=keyboard.nextShort();
		System.out.print("Please enter the width of the room in feet: ");
		short width=keyboard.nextShort();
		System.out.print
			("Please enter the cost per square foot in dollars and cents: ");
		float perFoot=keyboard.nextFloat();
		System.out.println("The length of the room is "+length+
			" feet, the width of the room is "+width+
			" feet, and the price per square foot of carpeting is $"
			+perFoot+".\nThe total price of carpeting the room is $"
			+length*width*perFoot+".");
	}
}